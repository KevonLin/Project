source('pastePercent.R')

source('addPercent.R')

addPercent(0.145)
addPercent
new.numbers <- c(0.8223, 0.02487, 1.62, 0.4 )
addPercent(new.numbers)

sprintf("%1.1f%%", 100*x)
# "%"为转义字符
sprintf("%.2f%%", 100*x)

paste(x, "~", sep = " !",collapse = "->")

# 函数是对象
ppaste <- addPercent
addPercent(c(0.034,0.035,0.036))

odds <- function(x) x/(1-x)
odds(0.8)

percentages <- c(58.23, 120.4, 33)
addPercent(percentages/100)

addPercent <- function(x, mult){
  percent <- round(x * mult,digits = 1)
  paste(percent, "%", sep = "")  
}

addPercent(percentages, 1)
addPercent(new.numbers, 100)

addPercent <- function(x, mult = 100){
  percent <- round(x * mult, digits = 1)
  paste(percent, "%", sep = "")
}

addPercent(new.numbers)
addPercent(new.numbers, 10)

addPercent <- function(x, mult = 100, ...){
  percent <- round(x * mult, ...)
  paste(percent, "%", sep = "")
}
addPercent(new.numbers)
addPercent(new.numbers, digits = 2)

addPercent <- function(x, mult =100, FUN = round, ...){
  percent <- FUN(x * mult, ...)
  paste(percent, "%", sep = "")
}
addPercent(new.numbers, FUN = signif, digits=3)
addPercent(new.numbers)
