# 矩阵使用
mtr1<-matrix(1:24,ncol=4,byrow=TRUE)
mtr2<-matrix(1:24,nrow=4,byrow=TRUE)
print(mtr1)
print(mtr2)
str(mtr1)
# 获取矩阵阶数
dim(mtr1)
# 获取元素长度
nchar(mtr1)
# 向量组合为矩阵
num1<-c(1,2,3,4,5)
num2<-c(6,7,8,9,0)
# 行合并
mtr3<-rbind(num1,num2)
print(mtr3)
# 列合并
mtr4<-cbind(num1,num2)
print(mtr4)
# 取值
mtr1[1,2]
mtr2[2:4,2:3]
mtr2[-2,-3]
mtr2[-3,]
mtr2[3,]
# 修改值
num1[1]<-100
print(num1)
mtr1[1,1]<-0
print(mtr1)
mtr2[2,3]<-0
print(mtr2)
# 给行(列)取名
rownames(mtr1)<-c(1:6)
colnames(mtr1)<-head(letters,4)
print(mtr1)
rownames(mtr2)<-rownames(mtr2, do.NULL = FALSE, prefix = "A")
colnames(mtr2)<-colnames(mtr2, do.NULL = FALSE, prefix = "a")
print(mtr2)
#日期格式化
date1<-as.Date('1999/06/19')
str(date1)
format.Date(date1,"%Y-%m-%d")
print(date1)
# 维度取数
arr1<-array(1:12,dim=c(2,3,2))
# 1行2列第1张表
arr1[1,2,1]