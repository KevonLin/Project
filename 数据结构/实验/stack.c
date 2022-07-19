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
		printf("\n\t\tջΪ�ա� ");
	else 
	{
		printf("\n\t\tջԪ��Ϊ�� ");
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
	printf("\n\t\tת����Ķ�������ֵ�� ");
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
	printf("\n\t\t�����������ʽ(������ֻ�ܰ���+,-,*,/),��#����:\n\t\t");
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
	printf("\n\t\t�������׺���ʽ��: ");
	for(j=1;j<sum;j++)
		printf("%c",str[j]);
	printf("\n\n\t\t��׺���ʽ��: ");
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
		printf("\n\t\t       ջ��ϵͳ       ");
		printf("\n\t\t**********************");
		printf("\n\t\t*     1--��    ջ    *");
		printf("\n\t\t*     2--��    ջ    *");
		printf("\n\t\t*     3--��    ʾ    *");
		printf("\n\t\t*     4--����ת��    *");
		printf("\n\t\t*     5--�沨��ʽ    *");
		printf("\n\t\t*     0--�˳�����    *");
		printf("\n\t\t**********************");
		printf("\n\t\t ��ѡ��˵���(0--5): ");
		fflush(stdin);
		choice=getchar();
		switch (choice)
		{
		case '1':
			while (1)
			{
				printf("\n\t\t����һ������('0'��ʾ����)�����س�: ");
				scanf("%d",&val);
				if (val!=0)
					Push (s,val);
				else 
					break;
			}
			break;
		case '2':
			if (Pop(s,val))
				printf("\n\t\t��ջԪ��Ϊ: %6d",val);
			else
				printf("\n\t\tջΪ�գ�û��Ԫ�ؿ��Գ�ջ! \n");
			break;
		case '3':
			ShowStack(s);
			break;
		case '4':
			printf("\n\t\t������һ��ʮ����������: ");
			scanf("%d",&n);
			Conversion(n);
			break;
		case '5':
			Suffix();
			break;
		case '0':
			exit(0);
		default:
			printf("\n\t\t����Ĳ˵���������������! \n");
		}
	}
}
		
