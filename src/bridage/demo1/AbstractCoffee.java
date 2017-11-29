package bridage.demo1;

public abstract class AbstractCoffee {
	protected Flavor flavor;
	public void setFlavor(Flavor flavor){
		this.flavor = flavor;
	}
	public abstract void drink();
}
