package BuilderPattern.demo2;
//���彨������SubMealBuilderB(B�ײͽ�������)
public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("һ�������");

	}

	@Override
	public void buildDrink() {
		meal.setDrink("һ����֭");

	}

}
