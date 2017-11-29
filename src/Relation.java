
public class Relation {
		//---------------------------------------
		//1.双向关联
		public class Customer{
			private Product[] products;
		}
		public class Product{
			private Customer customer;
		}
		//1.双向关联
		//---------------------------------------
		
		
		//---------------------------------------
		//2.单向关联
		public class Customer1{
			private Address address;
		}
		public class Address{
		}
		//2.单向关联
		//----------------------------------------
		
		
		//---------------------------------------
		//3.自关联
		public class Node{
			private Node subNode;
		}
		//3.自关联
		//------------------------------------------
		
		
		//------------------------------------------
		//4.多重性关联
		public class Form{
			private Button[] button;
		}
		public class Button{}
		//4.多重性关联
		//------------------------------------------
		
		
		//--------------------------------------------
		//5.聚合关系
		public class Car{
			private Engine engine;
			public Car(Engine engine){
				this.engine = engine;
			}
			public void setEngine(Engine engine){
				this.engine = engine;
			}
		}
		public class Engine{
			
		}
		//5.聚合关系
		//--------------------------------------------
		
		
		//--------------------------------------------
		//6.组合关系
		public class Head{
			private Mouth mouth;
			public Head(){
				mouth = new Mouth();
			}
		}
		public class Mouth{
			
		}
		//6.组合关系
		//--------------------------------------------
		
		
		//---------------------------------------------------------
		//7.依赖关系
		public class Driver{
			public void drive(Car1 car){
				car.move();
			}
		}
		public class Car1{
			public void move(){
				
			}
		}
		//7.依赖关系
		//--------------------------------------------------------------
		
		//--------------------------------------------------------------
		//8.泛化关系
		public class Person{
			protected String name;
			protected int age;
			public void move(){
				
			}
			public void say(){
				
			}
		}
		public class Student extends Person{
			private String studentNo;
			public void study(){
				
			}
		}
		//8.泛化
		//---------------------------------------------------------
		
		
		//----------------------------------------------------------
		
}
	