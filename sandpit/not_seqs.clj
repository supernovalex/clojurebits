; remember! only the final line will be output from this script

; to force printing of resutls - need println, like on l23

; on second thoughts, this is nothing to do with sequences

; these do the same thing, useful for stats

(map (fn [x] (- x 4)) [6 9 11])

(map #(- % 4) [6 9 11])

; useful functions
; nth
; first
; rest
; last
; type

; examples
(def n (range 1 11))

(first n) ; => 1
(println (rest n)) ; => [2 3 4 5 6 7 8 9 10]
(last n) ; => 10
(nth n 3) ; => 4

; why 4? indexed at zero :(

(type 3) ; => java.lang.Long
