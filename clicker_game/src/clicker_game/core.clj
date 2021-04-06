(ns clicker-game.core
  (:require [libpython-clj2.python :as py]))

(py/initialize! :python-executable "/usr/bin/python3"
		:library-path "/usr/lib/python3")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
