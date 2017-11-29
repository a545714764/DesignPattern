package BuilderPattern.demo2;
//指挥者类KFCWaiter(服务员类)
public class KFCWaiter {
	private MealBuilder mb;
	
	public void setMealBuilder(MealBuilder mb){
		this.mb = mb;
	}
	
	public Meal construct(){
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}
