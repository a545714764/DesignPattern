package strategy.demo2;
/*
 * ����ģʽʵ��2֮�������
 * ĳϵͳ�ṩ��һ�����ڶ��������ݽ��в�������,�����װ�˶�����ĳ�������,���������Ԫ�ء�������Ԫ�ؽ�������ȡ�
 * �����������Ϊ����ʹ�ò���ģʽ��Ƹ���������࣬ʹ�ÿͻ��˿��Զ�̬�ظ��������㷨�����Ը�����Ҫѡ��ð�������
 * ѡ��������������Ҳ�ܹ������������������㷨
 */
public class Client {
	public static void main(String[] args) {
		int arr[]={1,4,5,3};
		int result[];
		ArrayHandler ah = new ArrayHandler();
		
		Sort sort;
		sort = (Sort) XMLUtil.getBean();
		
		ah.setSortObj(sort);
		result = ah.sort(arr);
	}
}
