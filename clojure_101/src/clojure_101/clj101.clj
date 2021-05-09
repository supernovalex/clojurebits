; reload function is (rload)

; most of this won't print as it's not explicitly called, 
; the part dividers just break it up nicely
(println "~~~~~~~~~~ Part 1 ~~~~~~~~~~~~")

(defn testit
  []
  (println "test works"))

; this is awesome

; control flow
; if
(if true
  (println "this will evaluate, because it's true!")
  (println "this won't, it's not false!"))

; if-else
(if false
  (do (println "not this")
      (println "or this, because there's an else"))
  (do (println "definitely this")
      (println "and this! because there is a do!")))

; when
(when true
  (println "huzzah!"))

; naming stuff with def
(def hooligans
  ["earlobe" "hysty" "confustica" "nastytips"])

hooligans

; bad practice
(def danger_level :bad)
(def message "Watch out, things are ")
(if (= danger_level :bad)
  (def message (str message "not good!"))
  (def message (str message "not bad!")))

message

; gooder practise
(defn message2
  [lev]
  (str "Watch out, things are "
       (if (= lev :bad)
         "not good!"
         "not bad!")))

; strings are only concatenated with str
(def hero "Jack Sparrow")
(str "'It's my jar of dirt' ~ " hero)

; maps are cool in clojure
{} ; this one is empty (it's a literal too)

{:first-name "Sam"
 :last-name "Ovar"} ; this is a populated one

(def story {:beginning {:ch1 "hello" :ch2 "there"}
            :middle {:ch1 "general" :ch2 "kenobi"}
            :end {:ch1 "a surprise" :ch2 "to be sure"}})
; this is a nested nested map map 

; the nested map prints awfully so 

(println "~~~~~~~~~~ Part 2 ~~~~~~~~~~~~")

; hash-map function!
(def fish (hash-map :beginning "today is a good day " :end "for fishing"))

; the get function looks up a value in a hash map
(println (get fish :beginning)) 
(println (get fish :end "not there"))
;not there will be print if the :end keyword is not found in the map
; fortuitously, it is! spiffing!

; get-in (there my lad) is used for nested maps
(get-in story [:beginning :ch1])
(get-in story [:end :ch2])

; you can also treat a map like a function to find a key
(story :beginning)

(println "~~~~~~~~~~ Part 3 ~~~~~~~~~~~~")
