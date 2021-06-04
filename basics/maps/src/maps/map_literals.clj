(ns map-lit.core
  :gen-class))

(defn -main
  "Example of how reader reads map literals with namespace syntax"
  [& args]

  #:planet{:name "earth"
           :features #:features{:population "8 bill"
                                :water? true}}

  (println "Program exit successfully"))
