(defn mean
  "Calculate the arithmetic mean of numeric input"
  ([] [0.0 0])
  ([[^double s ^long c :as acc] e]
   (if (nil? e)
     acc
     (let [e (double e)]
       [(+ s e) (inc c)])))
  ([[s c]]
   (when-not (zero? c)
     (/ s c))))

