(ns clojure-101.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "This is cool!"))

(defn rload
  "reload this file muhaha"
  []
  (load-file "src/clojure_101/core.clj")
  (load-file "src/clojure_101/clj101.clj"))
