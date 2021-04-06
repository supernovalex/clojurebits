(ns real-clicker.core
  (:require [libpython-clj.require :refer [require-python]]
            [libpython-clj.python :as py]))

(require-python '(transformers))
(require-python '(torch))

