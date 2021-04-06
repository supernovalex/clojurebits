(ns testhere
 (:require
  [libpython-clj2.python :as py :refer [py. py.. py.-]]
  [libpython-clj2.require :refer [require-python]]))

(require-python '[transformers :bind-ns])
