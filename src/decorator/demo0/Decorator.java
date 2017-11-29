package decorator.demo0;



public class Decorator extends Component{
	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	public void operation(){
		component.operation();
	}

}
