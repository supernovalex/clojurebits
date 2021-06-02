; two main types of linked-list data structure

; vector (nice)

[1 2 3]

(class [1 2 3]) ; => clojure.lang.PersistentVector

; list (also nice, maybe a linked list programming exercise is due?)

(list 1 2 3)

(class '(1 2 3)) ; => clojure.lang.PersistentList

; notice that

(= (list 1 2 3) '(1 2 3)) ; => true! yay for simple shorthand


