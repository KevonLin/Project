//��Ľ���洢�ڵ�����La�У�*n�ǽ��������Ԫ�ظ���������ʱΪ0
void Difference(LinkList &La, LinkList &Lb, int *n)
{ 
    // pa��pb�ֱ�������La ��Lb�Ĺ���ָ��,��ʼ��Ϊ��Ӧ����ĵ�һ�����
    pa = La->next;
    pb = Lb->next;
    //preΪLa��pa��ָ����ǰ������ָ��
    pre = La;
    while (pa && pb)
        {
            if (pa->data < q->data)
            {
            // A�����е�ǰ���ָ�����
                pre = pa;
                pa = pa->next;
                *n++;
            }
            else if (pa->data > q->data)
            // B�����е�ǰ���ָ�����
                q = q->next;
            else
            {
                //����A, B��Ԫ��ֵ��ͬ�Ľ�㣬Ӧɾ��
                pre->next = pa->next;
                u = pa;
                pa = pa->next;
                delete u;// ɾ�����
            } 
        }
}



