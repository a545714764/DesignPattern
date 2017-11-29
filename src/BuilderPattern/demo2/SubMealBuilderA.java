package BuilderPattern.demo2;
//具体建造者类SubMealBuilderA(A套餐建造者类)
public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡腿堡");

	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯可乐");

	}

}
