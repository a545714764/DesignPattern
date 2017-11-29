package BuilderPattern.demo2;
//具体建造者类SubMealBuilderB(B套餐建造者类)
public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡肉卷");

	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯果汁");

	}

}
