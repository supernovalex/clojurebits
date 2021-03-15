
(defn getone []
  (keyp 10 9)
  (keyp 1505 51)
  (keyp 1505 51)
  (keyp 1505 51)
  (keyp 1505 51)
  (keyp 5000 49)
  1)

(defn gettwo []
  (getone)
  (getone)
  1)

(defn leggo []
  (keyp 100 18 9)
  (gettwo)
  1)
