#include <stdio.h>
#include <stdlib.h>
#define STACKMAX 100
typedef struct stacknode
{
	int data;
	struct stacknode *next;
}StackNode;
typedef struct 
{
	StackNode *top;
}LinkStack;
void Push (LinkStack &s,int x)
{
	StackNode *p=new StackNode;
	p->data=x;
	p->next=s.top;
	s.top=p;
}
int Pop(LinkStack &s,int &x)
{
	StackNode *p;
	if(s.top!=NULL)
	{
		p=s.top;
		x=p->data;
		s.top=p->next;
		delete p;
		return 1;
	}
	else 
		return 0;
}
void ShowStack (LinkStack s)
{
	StackNode *p=s.top;
	if (p==NULL)
		printf("\n\t\t栈为空。 ");
	else 
	{
		printf("\n\t\t栈元素为： ");
		while (p!=NULL)
		{
			printf("%6d",p->data);
			p=p->next;
		}
		printf("\n");
	}
}
void Conversion(int n)
{
	LinkStack s;
	int x;
	s.top=NULL;
	do
	{
		x=n%2;
		n=n/2;
		Push(s,x);
	}while(n);
	printf("\n\t\t转换后的二进制数值： ");
	while (Pop(s,x))
		printf("%d",x);
	printf("\n");
}
void Suffix()
{
	char str[STACKMAX];
	char stack[STACKMAX];
	char exp[STACKMAX];
	char ch;
	int sum,i,j,t,top=0;
	printf("\n\t\t输入算术表达式(算术符只能包含+,-,*,/),以#结束:\n\t\t");
	fflush(stdin);
	i=0;
	do
	{
		i++;
		scanf("%c",&str[i]);
	}while(str[i]!='#'&& i!=STACKMAX);
	sum=i;
	t=1;
	i=1;
	ch=str[i];
	i++;
	while (ch!='#')
	{
		switch (ch)
		{
		case '(':
			top++;
			stack[top]=ch;
			break;
		case ')':
			while (stack[top]!='(')
			{
				exp[t++]=stack[top--];
				exp[t++]=',';
			}
			top--;
			break;
		case '+':
		case '-':
			while (top!=0 && stack[top]!='(')
			{
				exp[t++]=stack[top--];
				exp[t++]=',';
			}
			stack[++top]=ch;
			break;
		case '*':
		case '/':
			while(stack[top]=='*' || stack[top]=='/')
			{
				exp[t++]=stack[top--];
				exp[t++]=',';
			}
			stack[++top]=ch;
			break;
		case ' ':
			break;
		default:
			while (ch>='0'&&ch<='z')
			{
				exp[t++]=ch;
				ch=str[i++];
			}
			i--;
			exp[t++]=',';
		}
		ch=str[i++];
	}
	while (top!=0)
	{
		exp[t++]=stack[top--];
		if(top!=0)
			exp[t++]=',';
	}
	printf("\n\t\t输入的中缀表达式是: ");
	for(j=1;j<sum;j++)
		printf("%c",str[j]);
	printf("\n\n\t\t后缀表达式是: ");
	for(j=1;j<t;j++)
		printf("%c",exp[j]);
	printf("\n");
}
void main()
{
	LinkStack s;
	int i=1,j=1,val,n;
	char choice;
	s.top=NULL;
	while(1)
	{
		printf("\n");
		printf("\n\t\t       栈子系统       ");
		printf("\n\t\t**********************");
		printf("\n\t\t*     1--进    栈    *");
		printf("\n\t\t*     2--出    栈    *");
		printf("\n\t\t*     3--显    示    *");
		printf("\n\t\t*     4--数制转换    *");
		printf("\n\t\t*     5--逆波兰式    *");
		printf("\n\t\t*     0--退出程序    *");
		printf("\n\t\t**********************");
		printf("\n\t\t 请选择菜单号(0--5): ");
		fflush(stdin);
		choice=getchar();
		switch (choice)
		{
		case '1':
			while (1)
			{
				printf("\n\t\t输入一个整数('0'表示结束)并按回车: ");
				scanf("%d",&val);
				if (val!=0)
					Push (s,val);
				else 
					break;
			}
			break;
		case '2':
			if (Pop(s,val))
				printf("\n\t\t出栈元素为: %6d",val);
			else
				printf("\n\t\t栈为空，没有元素可以出栈! \n");
			break;
		case '3':
			ShowStack(s);
			break;
		case '4':
			printf("\n\t\t请输入一个十进制正整数: ");
			scanf("%d",&n);
			Conversion(n);
			break;
		case '5':
			Suffix();
			break;
		case '0':
			exit(0);
		default:
			printf("\n\t\t输入的菜单错误，请重新输入! \n");
		}
	}
}
		
