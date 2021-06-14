gmp = function(s) {
  # assumption that there is at least one uptick on that day!

  t = 1:length(s)

  buyt = 0
  sellt = 0

  profitz = function(v, rem) {
    v - rem
  }

  profit_list = list()

  for (i in seq_along(s)) {

  }

  print(profit_list)

  cat(paste0("You should have bought at: ", buyt, ".\n", 
             "And then sold at: ", sellt, ".\n")) 
}
