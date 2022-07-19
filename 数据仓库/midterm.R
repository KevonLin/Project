sno<-c('2020325110301','2020325110301','2020325110314',
       '2020325110316','2020325110339')
sname<-c('王海鹏','郭佳雪','李林泽',
         '冯菲菲','李衬衬')
sdate<-c(as.Date('1999-10-14'),as.Date('2000-01-07'),as.Date('1999-06-19'),
         as.Date('2000-08-11'),as.Date('2000-10-29'))
stel<-c('18438632336','19513309985','15613552667',
        '15138237454','18738827401')
ssex<-factor(c('男','女','男','女','女'))
stu.data<-data.frame(
  sno,sname,sdate,stel,ssex,
  stringsAsFactors = FALSE
)
str(stu.data)
# 提取考生本人的姓名
print(stu.data[stu.data$sno=='2020325110314','sname'])
# 修改考生本人的联系电话为‘12345678’
stu.data[stu.data$sname=='李林泽','stel']<-'12345678'
print(stu.data)
# 修改数据帧的行名称为one,two ,three,four,five
rownames(stu.data)<-c('one','two','three','four','five')
print(stu.data)
# 提取5位同学的姓名和性别
df1<-stu.data[c('sname','ssex')]
print(df1)
# 提取所有女生的学号和姓名
df2<-stu.data[stu.data$ssex=='女',c('sno','sname')]
print(df2)

gmath<-c(99,94,92,95,96)
gchinese<-c(82,83,83,96,82)
genglish<-c(83,97,83,86,93)
term<-'2021-2022'
stu.grade<-data.frame(sno,gmath,gchinese,genglish,term)
print(stu.grade)
com1<-list(stu.data,stu.grade)
print(com1)
# 提取所有学生的学号
print(stu.grade$sno)
# 提取本人的数学及英文成绩
df3<-stu.grade[stu.grade$sno=='2020325110314',c('gmath','genglish')]
colnames(df3)<-c('数学成绩','英语成绩')
print(df3)
# 计算所有学生数学课程的平均成绩
res1<-mean(stu.grade$gmath)
print(res1)