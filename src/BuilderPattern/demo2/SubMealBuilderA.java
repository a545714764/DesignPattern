package BuilderPattern.demo2;
//���彨������SubMealBuilderA(A�ײͽ�������)
public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("һ�����ȱ�");

	}

	@Override
	public void buildDrink() {
		meal.setDrink("һ������");

	}

}
