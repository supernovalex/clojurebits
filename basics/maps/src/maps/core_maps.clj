(ns maps.core
  (:gen-class))

(defn -main
  "Model domain entities using maps"
  [& args]

  (println "Program start")
  
  (def earf {:name "earf" ; linguistic designation
             :moons #{:luna} ; orbiting bodies
             :size 1 ; relative to other solar bodies
             :type :planet ; entity type
             })

  (def luna {:name "luna" ; linguistic designation
             :host :earf ; orbiting bodies
             :size 0.1 ; relative to other solar bodies
             :type :moon ; entity type
             })

  (def murs {:name "murs" ; linguistic designation
             :moons 2 ; orbiting bodies
             :size "small" ; relative to other solar bodies
             :type :planet ; entity type
             })
  
  (println "Program end"))
