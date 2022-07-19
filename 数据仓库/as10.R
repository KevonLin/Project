# 1）使用行级优先填充数据1:24到3行8列的矩阵中。
mtr1<-matrix(1:24,nrow = 3,ncol = 8,byrow = TRUE)
# 2）将题目1中创建的数据使用列绑定一个向量1:8,
colnames(mtr1)<-c(1:8)
print(mtr1)
# 3）将granny和gera两个选手的6场球赛的得分分别存储在两个向量中
# 然后将两个向量行绑定为矩阵
# 然后将矩阵的6列命名为'one','two','three','four','five','six'
granny<-c(8,7,3,7,4,5)
gera<-c(9,3,8,4,5,6)
mtr2<-rbind(granny,gera)
colnames(mtr2)<-c('one','two','three','four','five','six')
print(mtr2)
# 4）kk<-1:24,修改该向量的维度，生成一个三维数据。
kk<-1:24
arr1<-array(kk,dim = c(8,1,3))
print(arr1)
# 5）将题目3中两个选手的第六场球赛的得分都加上3
mtr3<-mtr2
mtr3[,6]<-mtr3[,6]+3
print(mtr3)
# 6）创建一个三个向量sno=c('2020001’,’2020002’,’2020003’) 
# sname=c('mike’,’tom’,’mary’)
# sage=c(19,20,21)
# 将三个向量合并为数据帧stu
stu<-data.frame(
  sno=c('2020001','2020002','2020003'),
  sname=c('Mike','Tom','Mary'),
  sage=c(19,20,21),
  stringsAsFactors = FALSE
)
print(stu)
# 7）为题目6创建的stu数据帧添加一个变量phone
stu$phone<-c('123','456','789')
print(stu)
# 8）为题目6创建的stu数据帧再添加两个观测
stu<-rbind(
  stu,
  data.frame(
    sno=c('2020004','2020005'),
    sname=c('Tommy','Black'),
    sage=c(22,23),
    phone=c('000','111'),
    stringsAsFactors = FALSE
  )
)
print(stu)
# 9）题目7创建的新的数据帧去掉变量phone
stu1<-stu[,-4]
print(stu1)
#  10)创建列表，包括granny和gera两位选手的6场球赛的得分，赛季和地点
date<-as.Date('2020-03-25')
place<-'郑州'
com<-list(mtr2,date,place)
print(com)
