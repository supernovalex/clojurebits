; pass x and y coordinate on screen, return the current colour of that pixel

(defn colour_at [x y] 
	(.getPixelColor (java.awt.Robot.) x y))
