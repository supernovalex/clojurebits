; on second thoughts, this is nothing to do with sequences

; these do the same thing, useful for stats

(map (fn [x] (- x 4)) [6 9 11])

(map #(- % 4) [6 9 11])
