dt<-'1999-06-19'
str(dt)
dt<-as.Date(dt)
str(dt)
weekdays(dt)
months(dt)
#--季度
quarters(dt)
#--没有该函�?
#--years(dt)
dt+4
apollo<-"July 20,1969,20:17:39"
apollo.fmt<-"%B %d, %Y, %H:%M:%S"
dft<-as.POSIXct(dt,ft,tz="UTC")
"2019-03-23 23:34:45 UTC"
dft<-as.POSIxlt(dft)
dft
unclass(dft)
