(ns maps.core
  (:gen-class))

(defn -main
  "Representing domain entities with records"
  [& args]

  (println "Program start")
  
  (defrecord planet [name ; linguistic designation
                     moons ; orbiting bodies
                     size ; ratio to terra
                     ])

  (defrecord moon   [name ; linguistic designation
                     host ; gravity well origin
                     size ; relative to other solar bodies
                     ])

  (def earf
    (map->planet {:name "earf"
                  :moons #{:luna}
                  :size 1}))

  (def mars
    (map->planet {:name "mars"
                  :moons #{:phobos :deimos}
                  :size 0.5}))

  (def luna
    (map->moon {:name "luna"
                :host :earf
                :size 0.1}))

  (def phobos
    (map->moon {:name "phobos"
                :host :mars
                :size 0.01}))

  (def deimos
    (map->moon {:name "deimos"
                :host :mars
                :size 0.01}))

  (println "Program end"))
