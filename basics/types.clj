; booleans, strings, numbers. all java types

(class 1) ; java.lang.long

(class 1.) ; java.lang.double

(class "") ; java.lang.string (always use double quotes!)

(class false) ; java.lang.boolean

(class nil) ; null value 

; is there an NA type? like R? unsure

; in clojure (like lisp, r, etc...) code is data, thus, there's a special type

(quote (+ 1 2))

; this is code as data, there's also a shorthand

'(+ 1 2 )

; the two statements above create a "literal list of data", and can be evaluated 

(eval '(+ 1 2)) ; => 3

; so... 

(= (eval '(+ 1 1 )) 2) ; true! haha, amazing!
