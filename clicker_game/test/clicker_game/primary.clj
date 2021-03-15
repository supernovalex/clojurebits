; the big one!

; press & release helpers
(defn press-key [k] 
  (.keyPress (java.awt.Robot.) k))
(defn release-key [k]
  (.keyRelease (java.awt.Robot.) k))

; wait
(defn waitfor [t]
  (.delay (java.awt.Robot.) (+ t (rand-int 39))))

; one or more key inputs
; modifiers must be entered first!
(defn keyp [t & kl]
  (run! press-key kl)
  (run! release-key kl)
  (waitfor t)
  1)

; main logic
(defn click []
  (keyp 100 18 9)
  (keyp 1 9)
  (keyp 2005 51)
  (keyp 2005 51)
  (keyp 1505 82)
  (keyp 1505 17 49)
  (keyp 1780 49)
  (keyp 2005 51)
  1)

; let's go!
(click)
