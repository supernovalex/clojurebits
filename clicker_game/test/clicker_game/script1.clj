(println "Run program")

; (.getPixelColor (java.awt.Robot.) x y))

; press two keys (alt-tab, to focus window)
(.keyPress (java.awt.Robot.) 18)
(.keyPress (java.awt.Robot.) 9)

; un-press these two keys
(.keyRelease (java.awt.Robot.) 18)
(.keyRelease (java.awt.Robot.) 9)

; single key  using clojure variable
(def k1 81)
(.delay (java.awt.Robot.) 100)
(.keyPress (java.awt.Robot.) k1)
(.keyRelease (java.awt.Robot.) k1)

; another single key
(.keyPress (java.awt.Robot.) 9)
(.keyRelease (java.awt.Robot.) 9)

; single key passed to clojure function
(def k2 82)
(.delay (java.awt.Robot.) 1510)
(defn tap-key [k]
  (.keyPress (java.awt.Robot.) k)
  (.keyRelease (java.awt.Robot.) k)
  1)

; don't forget to call the function :)
(tap-key k2)

; multiple key presses 
(.delay (java.awt.Robot.) 1560)

(defn pressk [k]
  (.keyPress (java.awt.Robot.) k))	
(defn releasek [k]
  (.keyRelease (java.awt.Robot.) k))

(defn multi-key [& kl] 
  (run! pressk kl)
  (run! releasek kl)
  1)
(multi-key 17 67)



