//差集的结果存储于单链表La中，*n是结果集合中元素个数，调用时为0
void Difference(LinkList &La, LinkList &Lb, int *n)
{ 
    // pa和pb分别是链表La 和Lb的工作指针,初始化为相应链表的第一个结点
    pa = La->next;
    pb = Lb->next;
    //pre为La中pa所指结点的前驱结点的指针
    pre = La;
    while (pa && pb)
        {
            if (pa->data < q->data)
            {
            // A链表中当前结点指针后移
                pre = pa;
                pa = pa->next;
                *n++;
            }
            else if (pa->data > q->data)
            // B链表中当前结点指针后移
                q = q->next;
            else
            {
                //处理A, B中元素值相同的结点，应删除
                pre->next = pa->next;
                u = pa;
                pa = pa->next;
                delete u;// 删除结点
            } 
        }
}



