; take 2

; key press & release helpers function
	
(defn press-key [k] 
(.keyPress (java.awt.Robot.) k))
(defn release-key [k]
 (.keyRelease (java.awt.Robot.) k&))

; one or more key inputs

	(defn keyp [& kl]
	 (run! press-key kl)
	 (run! release-key kl)
	 1)

	; random wait 
	(defn waitgcd []
	 (.delay (java.awt.Robot.) (+ 1505 (rand-int 49))))
