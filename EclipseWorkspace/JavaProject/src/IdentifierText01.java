


/*
   关于java语言中的标识符

   1.什么是标识符？
     -在JAVA源程序中凡是程序员有权利命名的单词都是标识符
	 -标识符在EditPlus编辑器中以黑色字体高亮显示
	 -标识符可以标识的内容
	   *类名
	   *方法名
	   *变量名
	   *接口名
       *常量名
	   ...

   2.标识符的命名规则(不按照规则 编译器会报错 是语法)
      *一个合法的标识符只能由"数字、字母、下划线、美元符号"组成，不能含有其他符号
	  *不能以数字开头
	  *严格区分大小写
	  *关键字不能做标识符
      *理论上无长度限制

   3.标识符的命名规范(只是一种规范，不属于语法，不遵守规范编译器不会报错)
      *见名知意
	       public class UserService{
		       public void login(String username,String password){
		       }
		   }
	  *遵守驼峰命名方式
	     SystemService
		 UserService
		 CustomerService

      *类名、接口名：首字母大写，后面每个单词首字母大写

	  *变量名、方法名：首字母小写，后面每个单词首字母大写
	  
	  *常量名：全部大写

4.合法和不合法的标识符

  注意关键字

关键字          含义
abstract	表明类或者成员方法具有抽象属性
assert		断言，用来进行程序调试
boolean		基本数据类型之一，声明布尔类型的关键字
break		提前跳出一个块
byte		基本数据类型之一，字节类型
case		用在switch语句之中，表示其中的一个分支
catch		用在异常处理中，用来捕捉异常
char		基本数据类型之一，字符类型
class		声明一个类
const		保留关键字，没有具体含义
continue	回到一个块的开始处
default		默认，例如，用在switch语句中，表明一个默认的分支
do			用在do-while循环结构中
double		基本数据类型之一，双精度浮点数类型
else		用在条件语句中，表明当条件不成立时的分支
enum		枚举
extends		表明一个类型是另一个类型的子类型，这里常见的类型有类和接口
final		用来说明最终属性，表明一个类不能派生出子类，或者成员方法不能被覆盖，或者成员域的值不能被改变，用来定义常量
finally		用于处理异常情况，用来声明一个基本肯定会被执行到的语句块
float		基本数据类型之一，单精度浮点数类型
for			一种循环结构的引导词
goto		保留关键字，没有具体含义
if			条件语句的引导词
implements	表明一个类实现了给定的接口
import		表明要访问指定的类或包
instanceof	用来测试一个对象是否是指定类型的实例对象
int			基本数据类型之一，整数类型
interface	接口
long		基本数据类型之一，长整数类型
native		用来声明一个方法是由与计算机相关的语言（如C/C++/FORTRAN语言）实现的
new			用来创建新实例对象
package		包
private		一种访问控制方式：私用模式
protected	一种访问控制方式：保护模式
public		一种访问控制方式：共用模式
return		从成员方法中返回数据
short		基本数据类型之一,短整数类型
static		表明具有静态属性
strictfp	用来声明
FP_strict      （单精度或双精度浮点数）表达式遵循IEEE 754算术规范 [1]  
super			表明当前对象的父类型的引用或者父类型的构造方法
switch          分支语句结构的引导词
synchronized    表明一段代码需要同步执行
this            指向当前实例对象的引用
throw           抛出一个异常
throws          声明在当前定义的成员方法中所有需要抛出的异常
transient       声明不用序列化的成员域
try             尝试一个可能抛出异常的程序块
void            声明当前成员方法没有返回值
volatile        表明两个或者多个变量必须同步地发生变化
while           用在循环结构中
*/
public class IdentifierText01//类名，名字可以修改，并且要修改源文件名
{
	public static void main(String[] args){ //main是一个方法名 args是变量名
	
	}
}