package BuilderPattern.demo2;
/*
 * ������ģʽ:ʵ��˵��
 * ������ģʽ������������KFC��δ����ײ�:�ײ���һ�����Ӷ���,��һ�������ʳ(�纺����������)
 * ������(���֭�����ֵ�)����ɲ���,��ͬ���ײ��в�ͬ����ɲ���,��KFC�ķ���Ա���Ը��ݹ˿͵�Ҫ��
 * һ��һ��װ����Щ��ɲ���,����һ���������ײ�,Ȼ�󷵻ظ��˿�
 */
public class Client {

	public static void main(String[] args) {
		//��̬ȷ���ײ�����
		MealBuilder mb = (MealBuilder) XMLUtil.getBean();
		//����Ա��ָ����
		KFCWaiter waiter = new KFCWaiter();
		//����Ա׼���ײ�
		waiter.setMealBuilder(mb);
		Meal meal = waiter.construct();
		
		System.out.println("�ײ����:");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());

	}

}
