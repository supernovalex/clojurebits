; the big one!

; press & release helpers
(defn press-key [k] 
  (.keyPress (java.awt.Robot.) k))
(defn release-key [k]
  (.keyRelease (java.awt.Robot.) k&))

; wait
(defn waitfor [t]
  (.delay (java.awt.Robot.) (+ t (rand-int 39))))

; one or more key inputs
(defn keyp [t & kl]
  (run! press-key kl)
  (run! release-key kl)
  (waitfor t)
  1)

(keyp 1505 81)
(keyp 1505 82)

