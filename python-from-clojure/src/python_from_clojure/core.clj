(ns python-from-clojure.core
  (:require
    [libpython-clj2.python :as py :refer [py. py.. py.-]]
    [libpython-clj2.require :refer [require-python]]))

(require-python '[opencv])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
