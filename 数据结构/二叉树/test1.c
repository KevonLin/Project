#include <stdio.h>
#include <stdlib.h>

#define MAXLEN 100

typedef char ElemType;

typedef struct BiTNode
{
	ElemType data;
	struct BiTNode *lchild, *rchild;
} BiTNode, *BiTree;

// BiTNode *BiTree;
// BiTNode *CreateBiTNode();
// void ShowTree(BiTNOde *T);
void CreateBiTree(BiTree T);
void ShowTree(BiTree T);
void Preorder(BiTree T);
void Postorder(BiTree T);
void Levelorder(BiTree T);
void Inorder(BiTree T);
void Leafnum(BiTree T);
void Nodenum(BiTree T);
int TreeDepth(BiTree T);
int count = 0;

void CreateBiTree(BiTree T)
{
	char c;
	scanf("%c", &c);
	getchar();
	if (c == '0')
		T = NULL;
	else
	{
		T = (BiTNode *)malloc(sizeof(BiTNode));
		T->data = c;
		printf("输入%c结点的左子结点:", T->data);
		CreateBiTree(T->lchild);
		printf("输入%c结点的右子结点:", T->data);
		CreateBiTree(T->rchild);
	}
}

void Preorder(BiTree T)
{
	if (T)
	{
		Preorder(T->lchild);
		printf("%3c", T->data);
		Preorder(T->rchild);
	}
}

void Postorder(BiTree T)
{
	if (T)
	{
		Postorder(T->lchild);
		Postorder(T->rchild);
		printf("%3c", T->data);
	}
}

void Levelorder(BiTree T)
{
	int i, j;
	BiTNode *q[100], *p;
	p = T;
	if (p != NULL)
	{
		i = 1;
		q[i] = p;
		j = 2;
	}
	while (i != j)
	{
		p = q[i];
		printf("%3c", p->data);
		if (p->lchild != NULL)
		{
			q[j] = p->lchild;
			j++;
		}
		if (p->lchild != NULL)
		{
			q[j] = p->rchild;
			j++;
		}
		i++;
	}
}

void Inorder(BiTree T)
{
	Inorder(T->lchild);
	printf("%3c", T->data);
	Inorder(T->rchild);
}

void Leafnum(BiTree T)
{
	if (T)
	{
		if (T->lchild == NULL && T->rchild == NULL)
			count++;
		Leafnum(T->lchild);
		Leafnum(T->rchild);
	}
}

void Nodenum(BiTree T)
{
	if (T)
	{
		count++;
		Nodenum(T->lchild);
		Nodenum(T->rchild);
	}
}

int TreeDepth(BiTree T)
{
	int ldep, rdep;
	if (T == NULL)
		return 0;
	else
	{
		ldep = TreeDepth(T->lchild);
		rdep = TreeDepth(T->rchild);
		if (ldep > rdep)
			return ldep + 1;
		else
			return rdep + 1;
	}
}

void ShowTree(BiTree T)
{
	BiTNode *stack[MAXLEN], *p;
	int level[MAXLEN][2], top, n, i, width = 4;
	if (T != NULL)
	{
		printf("二叉树的凹入表示法:\n");
		top = 1;
		stack[top] = T;
		level[top][0] = width;
		while (top > 0)
		{
			p = stack[top];
			n = level[top][0];
			for (i = 1; i <= n; i++)
				printf(" ");
			printf("%c", p->data);
			for (i = n + 1; i < 50; i += 2)
				printf("-");
			printf("\n");
			top--;
			if (p->rchild != NULL)
			{
				top++;
				stack[top] = p->rchild;
				level[top][0] = n + width;
				level[top][1] = 2;
			}
			if (p->lchild != NULL)
			{
				top++;
				level[top][0] = n + width;
				level[top][1] = 1;
			}
		}
	}
}

int main()
{
	BiTNode *T;
	char ch1, ch2, a;
	ch1 = 'y';

	while (ch1 == 'y' || ch1 == 'Y')
	{
		printf("二叉树子系统\n");
		printf("1.建二叉树\n");
		printf("2.凹入显示\n");
		printf("3.先序遍历\n");
		printf("4.中序遍历\n");
		printf("5.后序遍历\n");
		printf("6.层次遍历\n");
		printf("7.求叶子数\n");
		printf("8.求节点数\n");
		printf("9.求树深度\n");
		printf("0.返    回\n");
		printf("请选择(0-9):\n");
		scanf("%c", &ch2);
		getchar();
		printf("\n");
		switch (ch2)
		{
		case '1':
			printf("按先序建立二叉树的序列:\n");
			printf("'0'表示后继节点为空，逐个输入，按回车输入下一个节点\n");
			printf("输入根结点:\n");
			CreateBiTree(T);
			printf("二叉树建立成功");
			break;

		case '2':
			ShowTree(T);
			break;

		case '3':
			printf("先序遍历序列为:\n");
			Preorder(T);
			break;

		case '4':
			printf("中序遍历序列为:\n");
			Inorder(T);
			break;

		case '5':
			printf("后序遍历序列为:\n");
			Postorder(T);
			break;

		case '6':
			printf("层次遍历序列为:\n");
			Levelorder(T);
			break;

		case '7':
			count = 0;
			Leafnum(T);
			printf("该二叉树有%d个叶子\n", count);
			break;

		case '8':
			count = 0;
			Nodenum(T);
			printf("该二叉树共有%d个结点\n", count);
			break;

		case '9':
			printf("该树的深度是:%d", TreeDepth(T));
			break;

		default:
			printf("输入有误!\n");
		}
		if (ch2 != '0')
		{
			printf("按回车继续，任意键返回主菜单\n");
			a = getchar();
			if (a != '\xA') //\xA=10=ASCII \n
			{
				getchar();
				ch1 = 'n';
			}
		}
	}
	return 0;
}
