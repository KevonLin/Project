#include<stdio.h>
#include<stdlib.h>

#define ElemType char
#define MAXLEN 50
#define NONENODE '0'

int num=0,counter1=0,counter2=0;

typedef struct node                                          
{
	ElemType data;
	struct node *lchild,*rchild;
}BT;


BT* CreateTree()                                  
{
	BT *bt;
	ElemType x;
	scanf("\n%c",&x);
	if(x==NONENODE)                                                   
	{
		bt=NULL;                                                 
	}
	else
	{
		bt=(BT*)malloc(sizeof(BT));                              
		bt->data=x;
		bt->lchild=CreateTree();                                 
		bt->rchild=CreateTree();                                 
    }
    return bt;
}


ShowTree(BT *T)                                                     
{
	int i;
	if(T==NULL)
	{
	 	return;                                                       
   	}
	 else 	                                   
	 {
		 num++;                                                      
		 printf("\t\t\t");
		 for(i=0;i<num;i++)
		 {
			 printf("  ");
		 }
		printf("%c",T->data);
		{
			printf("-");
		}
		printf("\n");
		ShowTree(T->lchild);                                        
		ShowTree(T->rchild);                                         
		num=num-1;
	 }
}


void Preorder(BT *T)                                  
{
	if(T==NULL)
	{
		return;
	}
	else 	                                    
	{
		printf("%c ",T->data);      		       
		Preorder(T->lchild);   	               
		Preorder(T->rchild);   	               
	}
}


void Inorder(BT *T)                                   
{
	if(T==NULL)
	{
		return;
	}
	else 	                                   
	{
		Inorder(T->lchild);                   
		printf("%c ",T->data);    	         
		Inorder(T->rchild);   	            
	}
}


void Postorder(BT *T)                             
{
	if(T==NULL)
	{
		return;                               
	}
	else 	                                 
	{
		Postorder(T->lchild);   	            
		Postorder(T->rchild);   	            
		printf("%c ",T->data);      		    
	}
}


void Levelorder(BT *T)                         
{
	int i,j;
	BT *q[MAXLEN],*p;                          
	p=T;
	if (p!=NULL) 		                       
	{
		i=1;
		q[i]=p;
		j=2;
	}                                          
	while (i!=j)                               
	{
		p=q[i];
		printf("%c ",p->data);                 
		if( p->lchild!=NULL)
		{
			q[j]=p->lchild;
			j++;
		}                                      
		if(p->rchild!=NULL)
		{
			q[j]=p->rchild;
			j++;
		}                                      
		i++;
	}
}

void Nodenum(BT *T)                            
{
	if(T==NULL)
	{
		return;
	}
	else
	{
		counter2++;                            
		Nodenum(T->lchild);                    
		Nodenum(T->rchild);                    
	}
}

void Leafnum(BT *T)                            
{
	if(T==NULL)                                
	{
		return;                                
	}
	else
	{
		if(T->lchild==NULL&&T->rchild==NULL)
		{
			counter1++;                               
		}
		Leafnum(T->lchild);                           
		Leafnum(T->rchild);                           
	}
}

int TreeDepth(BT *T)                                  
{
	int ldep,rdep;                                    
	if(T==NULL)
	{
		return 0;
	}
	else
	{
		ldep=TreeDepth(T->lchild);                    
		rdep=TreeDepth(T->rchild);                    
		if(ldep>rdep)
		{
			return ldep+1;
		}
		else
		{
			return rdep+1;
		}
	}
}

void Menu()
{
	printf("\n\t\t\t  二 叉 树 子 系 统 \n");
	printf("\t**************************************************************\n");
	printf("\t*      1------建立二叉树的二叉链表存储结构                   *\n");
	printf("\t*      2------按凹入表显示二叉树                             *\n");
	printf("\t*      3------按先序遍历二叉树                               *\n");
	printf("\t*      4------按中序遍历二叉树                               *\n");
	printf("\t*      5------按后序遍历二叉树                               *\n");
	printf("\t*      6------按层次遍历二叉树                               *\n");
	printf("\t*      7------统计二叉树的叶子结点总数                       *\n");
	printf("\t*      8------统计二叉树的结点总数                           *\n");
	printf("\t*      9------统计二叉树的深度                               *\n");
	printf("\t*      0------返            回                               *\n");
	printf("\t**************************************************************\n");
	printf("\t  请选择要执行的操作代号（0-9）: ");
}

int main()
{
	int i,c;
	ElemType x;
	BT *T,*t;

	do
	{
		Menu();
		scanf("%d", &c);
		if(c==0)
			break;
		switch(c)
		{
			case 0:
				break;

			case 1:
				printf("\n\t  按先序次序输入二叉树中结点的值,以0字符表示空树\n");
				printf("\t请输入： ");
				T=CreateTree();
				printf("\t  数据输入完毕!\n");
				break;

			case 2:
				printf("\n\t\t\t凹入表显示二叉树\n");
				ShowTree(T);
				break;

			case 3:
				printf("\n\t\t先序遍历二叉树: ");
				Preorder(T);
				printf("\n");
				break;

			case 4:
				printf("\n\t\t中序遍历二叉树: ");
				Inorder(T);
				printf("\n");
				break;

			case 5:
				printf("\n\t\t后序遍历二叉树: ");
				Postorder(T);
				printf("\n");
				break;

			case 6:
				printf("\n\t\t层次遍历二叉树: ");
				Levelorder(T);
				printf("\n");
				break;

			case 7:
				Leafnum(T);
				printf("\n\t\t树的叶子节点数为: %d\n",counter1);
				counter1=0;
				break;

			case 8:
				Nodenum(T);
				printf("\n\t\t树的节点数为: %d\n",counter2);
				counter2=0;
				break;

			case 9:
				printf("\n\t\t树的深度为: %d\n",TreeDepth(T));
				break;

			default:
				printf("\n\t\t 输入有误，请重新选择操作代号\n");
	
			}

	}while(c);

	return 0;
}
