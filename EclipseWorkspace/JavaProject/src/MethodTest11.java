/*
 	方法在执行的过程中，在JVM中的内存时如何分配的，内存是如何变化的？
 	
 		1、方法只定义，不调用，是不会执行的，并且子JVM中也不会给该方法分配”运行所属“的内存空间。
 		只有在调用这个方法的时候，才会动态的给这个方法分配所属的内存空间
 		
 		2、在JVM内存划分上有三块主要的内存空间：
 			*方法区内存
 			*堆内存
 			*栈内存
 		3、关于栈数据结构：
 			*栈：stack，是一种数据结构
 			*数据结构反应放热是数据的存储形态
 			*数据结构时独立的学科，不属于任何编程语言的范畴，只不过在大多数编程语言中要使用数据结构。
 			*作为程序员需要提前精通：数据结构+算法【计算机专业必修一门课程】
 			*常见的数据结构：
 				-数组
 				-队列
 				-栈
 				-链表
 				-二叉树
 				-哈希表/散列表
 				...
 		4、方法代码片段存在哪里？方法执行的时候执行过程的内存在那里分配？
 			*方法代码片段属于.class字节码文件的一部分，字节码文件在类加载的时候，将其放到了
 			方法区中。所以JVM中的三块主要的内存空间中方法去内存最先有数据。存放了代码片段。
 			
 			*代码片段虽然在方法去内存中只占有一份，但时可以重复调用。
 			每次调用这个方法的时候，需要给该方法分配独立的场所，
 			在栈内存中分配。
 		
 		5、方法在调用的瞬间，会给该方法分配内存空间，会在栈中发生压栈动作，
 		在犯法执行结束之后，给该方法分配的内存空间全部释放，此时发生弹栈动作。
 			*压栈：给方法分配内存
 			*贪占：释放该方法的内存空间
 			
 		6、局部变量在“方法体”中声明。局部变量运行阶段内存在栈中在栈中分配。
 		
 			
 */
public class MethodTest11 {
	public static void main(String[] args) {
		
	}
}
