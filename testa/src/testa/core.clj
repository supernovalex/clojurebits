(ns testa.core
  (:require [libpython-clj.require :refer [require-python]]
	    [libpython-clj.python :as py]))

(require-python '(transformers))
(require-python '(torch))

(def tokenizer (py/$a transformers/GPT2Tokenizer from_pretrained "gpt2"))

(def text "Who was Jim Henson ? Jim Henson was a")
;; encode text input
(def indexed-tokens  (py/$a tokenizer encode text))
indexed-tokens ;=>[8241, 373, 5395, 367, 19069, 5633, 5395, 367, 19069, 373, 257]

;; convert indexed tokens to pytorch tensor
(def tokens-tensor (torch/tensor [indexed-tokens]))
tokens-tensor
;; ([[ 8241,   373,  5395,   367, 19069,  5633,  5395,   367, 19069,   373,
;;    257]])

;;; Load pre-trained model (weights)
;;; Note: this will take a few minutes to download everything
(def model (py/$a transformers/GPT2LMHeadModel from_pretrained "gpt2"))

;;; Set the model in evaluation mode to deactivate the DropOut modules
;;; This is IMPORTANT to have reproducible results during evaluation!
(py/$a model eval)


;;; Predict all tokens
(def predictions (py/with [r (torch/no_grad)]
                          (first (model tokens-tensor))))

;;; get the predicted next sub-word"
(def predicted-index (let [last-word-predictions (-> predictions first last)
                           arg-max (torch/argmax last-word-predictions)]
                       (py/$a arg-max item)))

predicted-index ;=>582

(py/$a tokenizer decode (-> (into [] indexed-tokens)
                            (conj predicted-index)))

;=> "Who was Jim Henson? Jim Henson was a man"

