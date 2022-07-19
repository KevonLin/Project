letters
LETTERS
head(letters)
head(LETTERS)
head(letters,3)
tail(letters,3)
islands
names(islands)
--str列出向量类型和内容
str(months<-1:12)
month.name
names(months)<-month.name
str(months)
paste("hello","world",sep="_")
paste(letters[1:5],1:5,sep="_")
paste(letters[1:5],1:5,sep="_",collapse="/")
strsplit("My name is Kevonlin"," ")
sort(letters,decreasing = TRUE)
state.name
--查询取[]子集
state.name[grep("New",state.name)]
head(state.name,8)
head(substr(state.name,2,5),6)
state.name[grep(" ",state.name)]
dd<-c('north','east','south','north','north')
f_dd<-factor(dd)
str(f_dd)
f_dd<-factor(dd,levels=c("east","west","south","north"),labels=c("E","W","S","N"))
f_dd
--文本替换
a<-gsub("abcdefg","c","xxcxx");
print(a)
words<-c('beach','beech')
grep("beach",words)
grep('b(e*)ch',words)
