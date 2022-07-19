/**十进制转换为n进制
 *
 * 1.输入十进制
 * 2.选择转换的进制
 *	(1)十进制转换二进制
 *	(2)进制转换对应进制
 *		转换为十六进制
 *		<1>以小数点为界，向左依次取四为转换为十六进制作为整数部分
 *		<2>向右依次取四位转换为十六进制作为小数部分
 *		转换为八进制
 *		左右分别取三位，不足三位补零
 *		
 *	十进制转换为3进制
 *	设输入的数字为x 则输出n进制数字为x/n取余数作为最后一位，即x%n
 *	商/n的余数作为倒数第二个位，即商%n
 *	如何取到商？
 *	x=n*s+y	y=x%n s=(x-y)/n=(x-(x%n))/n
 *	y(余数)入栈
 *	x=s
 *	当s=0时y=x
 *	y入栈
 *	break
 *
 * 3.输出转换结果
 *
 * Author:lin
 * Date:11/20/2020
 * Version:2.0
 * Change:11/21/2020
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

#define STACKSIZE	255

enum {Avail=-1, Empty, Full};

typedef struct Stack
{
	int *top, *base;
	int size;
}Stack;

void Change(int num, int mode);
Stack Push(Stack p, int data);
Stack Pop(Stack p);
int StackFull(Stack p);
int StackEmpty(Stack p);
void DisplyStack(Stack p);

int main()
{
	int num, mode;
	
	printf("输入要转换的整数:");
	scanf("%d", &num);
	printf("输入目标进制:");
	scanf("%d", &mode);
	
	printf("[%d]转换成[%d]进制的结果为:\n",num, mode);
	
	Change(num, mode);

	return 0;
}

Stack InitStack(Stack p)
{
	p.base = (int *)malloc(STACKSIZE * sizeof(int));
	if (p.base == NULL)
	{
		printf("初始化栈失败\n");
		exit(0);
	}
	p.top = p.base;
	p.size = STACKSIZE;

	return p;
}

Stack Push(Stack p, int data)
{
	if (StackFull(p) == Full)
	{
		printf("栈空间已满，无法入栈\n");
		return p;
	}
	*p.top++=data;

	return p;
}

Stack Pop(Stack p)
{
	if (StackEmpty(p) == Empty)
	{
		printf("栈为空栈，无法出栈 ");
		return p;
	}
	p.top--;
	printf("出栈元素为：%d\n", *p.top);

	return p;
}

int StackFull(Stack p)
{
	if (p.top - p.base == p.size)
	{
		return Full;
	}
	else
	{
		return Avail;
	}
}

int StackEmpty(Stack p)
{
	if (p.top == p.base)
	{
		return Empty;
	}
	else
	{
		return Avail;
	}
}

void DisplayStack(Stack p)
{
	if (StackEmpty(p) == Empty)
	{
		printf("栈为空栈，无法遍历\n");
		return;
	}
	while (p.top != p.base)
	{
		p.top--;
		printf("%d-", *p.top);
	}
}


void Change(int num, int mode)
{
	assert(num && mode);
	
	int m, r;

	Stack s;
 	InitStack(s);
	do
	{
		m=num/mode;
		r=num%mode;
		Push(s, r);
		num=m;
	}while(m!=0);

	DisplayStack(s);
}
