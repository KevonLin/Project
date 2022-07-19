addPercent <- function(x){
  if(!is.numeric(x)) return(NULL)
  percent <- round(x * 100, digits = 1)
  result <- paste(percent, "%", sep = "")
  #默认返回最后一个变量的值
  return(result)
}