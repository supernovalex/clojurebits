(ns python-from-clojure.core
  (:require [libpython-clj.python :as py :refer [py. py.. py.-]]))

(defn -main
  [& args]
  (py/initialize! :python-executable "C:\\Users\\Alex123\\anaconda3\\python.exe"
                  :library-path "C:\\Users\\Alex123\\anaconda3\\python3.dll")
  (println "Hello, World!"))
