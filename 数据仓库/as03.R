library()
.packages()
install.packages("fortunes")
fortunes()
library("maptools")
position <- c(116.39, 39.91)
date <- "2017-10-01"
sunriset(matrix(position, nrow = 1), 
         as.POSIXct(date, tz = "Asia/Shanghai"), 
         direction = c("sunrise"), POSIXct.out = TRUE)$time
sunriset(matrix(position, nrow = 1), 
         as.POSIXct(date, tz = "Asia/Shanghai"), 
         direction = c("sunset"), POSIXct.out = TRUE)$time