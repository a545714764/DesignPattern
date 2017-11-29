package BuilderPattern.demo2;
//抽象建造者类MealBuilder(套餐建造者类)
public abstract class MealBuilder {
	protected Meal meal = new Meal();
	
	public abstract void buildFood();
	public abstract void buildDrink();
	
	public Meal getMeal(){
		return meal;
	}
}
