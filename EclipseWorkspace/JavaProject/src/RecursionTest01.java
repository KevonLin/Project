/*
 	���ڷ����ĵݹ����
 		1��ʲô�ǵݹ飿
 			a(){
 				a();
 			}
 			
 		2���ݹ�ʱ�ܺķ�ջ�ڴ�ģ��ݹ��㷨���Բ��õ�ʱ��������
 		
 		3�����³������е�ʱ������һ�����󡾲����쳣��ʱ����Error��
 			java.long.StackOverflowError
 			��ʾջ�ڴ�һ������
 			�������޷���أ�����JV,ֹͣ����
 		
 		4���ݹ�����н���������û�н�������һ���ᷢ��ջ�ڴ��������
 		
 		5���ݹ鼴ʹ���˽�����������ʹ��������ʱ��ȷ�ģ�Ҳ���ܷ���ջ�ڴ����������Ϊ�ݹ�̫����
 		
 		ע�⣺
 			�ݹ���Բ�ʹ�þ�����ʹ��
 			������Щ����¸ù��ܵ�ʹ�ñ��������ݹ鷽ʽ�������磺Ŀ¼������
 		
 */
public class RecursionTest01 {
	public static void main(String[] args) {
		System.out.println("main begin");
		doSome();
		System.out.println("main over");
	
	}
	
	//���µĴ���Ƭ����Ȼֻ��һ��
	//���ǿ��Ա��ظ��ĵ��ã�����ֻҪ����doSome�������ͻ���ջ�ڴ����·���һ���������ڴ�ռ䡣
	public static void doSome() {
		System.out.println("doSome begin");
		doSome();//���д��벻��������һ�в���ִ��
		System.out.println("doSome over");
	}
}
