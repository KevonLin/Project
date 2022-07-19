a <- c(1:6)
b <- c("I","love", "China")
c <- c(TRUE, FALSE)
d <- c(1, "a", FALSE)
e <- 204*2
getwd()
setwd("E:/课程资料/第三学期/数据仓库")
save(c, file="love.rda")
save.image(file = "as1.rda")
