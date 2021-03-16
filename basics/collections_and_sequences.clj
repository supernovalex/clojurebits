; lists are linked-lists 

'(1 2 3) ; remember the ' 

(def x 4)
(def y 3)

(def noms '(x x y y))

; to display a defined variable then no parentheses are needed

noms

(coll? noms) ; a list is a collection

(seq? noms) ; a list is also a sequence (unlike a vector)

; adding things to a list

(def b 1)

(cons b noms)

; some funny things can happen here....
(cons x noms) ; => (4 x x y y)
(cons 'x noms) ; => (x x x y y)
(cons '(x) noms) ; => ((x) x x y y)

; i guess that's logical because code is data :)
