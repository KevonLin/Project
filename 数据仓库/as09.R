# 1）创建包含多个元素的字符向量
# 分别用length（）函数和nchar（）函数测量
# 字符向量的长度和每个元素包含的字符个数。
str1<-c("My","name","is","kevonlin")
length(str1)
nchar(str1)

# 2）使用内置的数据集letters和LETTERS。
# 利用head（）函数和tail（）函数
# 分别输出这两个数据集的前十个字符和后六个字符。
head(letters,10)
tail(letters,10)
head(LETTERS,10)
tail(LETTERS,10)
# 3）用str（）函数查看islands结构
# 找出世界上最小的6个大陆（岛屿）的名称。
head(names(sort(islands,decreasing = TRUE)),6)

# 4）创建命名向量month.days
# 使其有每个月天数和月份名称，并找出30天的月份。
month.day<-c(31,28,31,30,31,30,31,31,30,31,30,30)
names(month.day)<-month.name
str(month.day)
names(month.day[month.day==30])

# 5）创建字符串pangram（”The quick brown fox jumps over the lazy dog”）,
# 用strsplit（）函数将这句话打散成单词，用unique（）函数获取唯一元素
# 向量。（配合tolower（））
pangram<-"The quick brown fox jumps over the lazy dog"
words<-unlist(strsplit(pangram," ",fixed=TRUE))
unique(tolower(words))

# 6）用paste（）函数实现A—E与1—5两个向量的连接，
# 向量之间用“_”连接，向量内部用“---”连接。
paste(LETTERS[1:5],1:5,sep="___",collapse = "_")

# 7）文本排序，利用sort函数对letters数据降序排序。
sort(letters,decreasing = TRUE)

# 8）利用数据集state.name,
#	查找state.name中各个元素从3到6的子串
#	查找名称中包含“New”的州
#	查找包含两个单词的州名
#	查找包含“East”的州名
substr(state.name,3,6)
state.name[grep("New",state.name)]
state.name[grep(" ",state.name)]
stete.name[grep("East",state.name)]

# 9）设置一个字符向量，用gsub（）函数实现某个单词的替换。
str2<-c("abcdefg","c","xxcxx");
a<-gsub("abcdefg","c",str2);
print(a)

# 10）创建一个向量，其中包含：file_a.csv, file_b.csv, file_c.csv,
# 从这三个元素中提取出a，b，c。
filename<-c("file_a.csv", "file_b.csv", "file_c.csv")
str_sub(filename,start = 6,end = 6)

# 11)创建rwords(“bach”,”back”,”beech”,”beach”,”black”)
#	使用可选匹配来检索“beach”或“beech”
#	利用可计数性原则来提取“bach”和“beech”
rword<-c("bach","back","beech","beach","black")
str_match(rword,"beech|beach")
str_match(rword,"be(e*|a*)ch")

# 12）安装包stringr，以上题目用P77列出的包中函数操作。
install.packages("stringr")
library(stringr)
