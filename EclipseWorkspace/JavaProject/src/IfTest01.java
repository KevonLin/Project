/*
 	Java������if��䣬����ѡ��ṹ��if����ֱ��Ʒ�֧���/����������䣺
 		1��if�����﷨�ṹ�����ֱ�д��ʽ
 			��һ�֣�
 				if(�������ʽ��true/false��){
 					java���;
 					java���;
 					java���;
 					...
 				}
 			�ڶ��֣�
 				if(�������ʽ){
 					java���;
 					...
 				}else{
 					java���;
 					...
 				}
 				
 			������:
 			ֻҪһ��������if������
 				if(�������ʽ){
 					java���
 					java���
 					...
 				}else if(�������ʽ){
 					java���
 					java���
 					...
 				}else if(�������ʽ){
 					java���
 					java���
 					...
 				}
 				
 			�����֣�
 			����ϱߵĶ���������ִ�����һ��else
 				if(�������ʽ){
 					java���
 					java���
 					...
 				}else if(�������ʽ){
 					java���
 					java���
 					...
 				}else if(�������ʽ){
 					java���
 					java���
 					...
 				}else if(�������ʽ){
 					java���
 					java���
 					...
 				}else{
 					java���
 					java���
 					...
 				}
 					
 		2���ص㣺����Java�е�if��䣬ֻҪ��һ����ִ֧�У�����if���ȫ������
 		
 		3��ע�⣺���ϵڶ��ֺ͵����ִ���else��һ����һ����ִ֧��
 		
 		4�����еĿ�����䶼����Ƕ��ʹ�ã�ֻҪ����Ƕ�׾��С�
 			if(){
 				if(){
 					if(){
 						
 						}
 					}
 			}else{
 				if(){
 					if(){
 						if(){
 							}
 						}
 					}
 				}
 				
 		5��ע������
 		
 		5��if���ķ�֧��ֻ��һ��Java���Ļ�������������ʡ�Բ�д��
 			if(true/false){
 				һ��java���
 				}
 				
 			if(true/falese) һ��java���;
 		
 		
 */
public class IfTest01 {
	public static void main(String[] args) {
		
		//��������λ�õ��幫�ﷶΧ���пϵ»��Ļ���ȥKFC���緹
		
		//������
		double distance = 4.0;//��λkm
		//�ж����
		if(distance < 5) {
			System.out.println("ȥFFC�Է�");
		}else {
			System.out.println("����λ���幫�ﷶΧ��û��KFC");
		}
		
		/*����
			����ϵͳ����һ�������ĳɼ����ɼ�����С���㡣�ɼ���Χ[0-100]
			����ѧ���ĳɼ��жϸ�ѧ���ĳɼ��ȼ���
				[90-100]	A
				[80-90)		B
				[70-80)		C
				[60-70)		D
				(0-60)		E
				
			���ϵ��߼��жϲ���if������
		*/
		
		double score = 59.9;
		score = 100;
		
		if(score < 0 || score >100) {
			System.out.println("�Բ���������Ŀ����ɼ����Ϸ�");
		}else if( score >= 90 ) {
			System.out.println('A');
		}else if( score >= 80) {
			System.out.println('B');
		}else if( score >=70) {
			System.out.println('C');
		}else if( score >= 60) {
			System.out.println('D');
		}else if( score >= 0){
			System.out.println('E');							
		}
		
		String grade = "�ÿ����Ŀ��Գɼ��ȼ�ʱ:E�ȼ�";
		
		if(score < 0 || score >100) {
			grade = "�Բ���������Ŀ����ɼ����Ϸ�";
		}else if( score >= 90 ) {
			grade = "�ÿ����Ŀ��Գɼ��ȼ�ʱ:A�ȼ�";
		}else if( score >= 80) {
			grade = "�ÿ����Ŀ��Գɼ��ȼ�ʱ:B�ȼ�";
		}else if( score >= 70) {
			grade = "�ÿ����Ŀ��Գɼ��ȼ�ʱ:C�ȼ�";
		}else if( score >= 60) {
			grade = "�ÿ����Ŀ��Գɼ��ȼ�ʱ:D�ȼ�";
		}

		System.out.println(grade);
	}	
}
	

