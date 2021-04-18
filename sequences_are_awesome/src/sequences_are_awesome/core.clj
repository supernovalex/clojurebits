(ns sequences-are-awesome.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; inc a number
(inc 2)

;; inc a vector
(inc [1 2 3])

;; doh!
;; try another way
(def numbers [1 2 3])
(nth numbers 0)

;; 
