/*
 	����return
 	
 		*����return�ؼ��ֵ�Java���ֻҪ�����Ǹ������ڵķ���ִ�н�����
 		
 		*�ڡ�ͬһ�������У�return������治�ܱ�д�κδ��룬
 		��Ϊ��Щ������Զִ�в�����
 */
public class MethodTest09 {
	public static void main(String[] args) {
		
		/*
		int retValue = m();
		System.out.println(retValue);
		*/
		
		//������󣺵��÷��������������������
		//System.out.println(m);
		
		System.out.println(m());
	}
		//���뱨��ȱ�ٷ�����䣬���³����������Ϊ�޷��ٷְٱ�֤��return 1;����ִ�С�
		/*
		public static int m(){
			int a = 10;
			if(a > 3){
				return 1;
			}
		}
		 */
	//���³�����Ա�֤��return 1;��return 0;ִ�С�����ͨ��
	/*
	public static int m() {
		int a = 10;
		if(a > 3) {
			return 1;
		}else {
			return 0;
		}
	}
	*/
	
	//�����Ϸ�����ȫ��ͬ
	/*
	public static int m() {
		int a = 10;
		if(a > 3) {
			return 1;
		}
		return 0;
	}
	*/
	
	/*
	public static int m() {
		return 10 > 3 ? 1 : 0;
	*/
	
	public static int m() {
		return 2 > 3 ? 1 : 0;
	
	}
}
