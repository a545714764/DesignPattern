
public class Relation {
		//---------------------------------------
		//1.˫�����
		public class Customer{
			private Product[] products;
		}
		public class Product{
			private Customer customer;
		}
		//1.˫�����
		//---------------------------------------
		
		
		//---------------------------------------
		//2.�������
		public class Customer1{
			private Address address;
		}
		public class Address{
		}
		//2.�������
		//----------------------------------------
		
		
		//---------------------------------------
		//3.�Թ���
		public class Node{
			private Node subNode;
		}
		//3.�Թ���
		//------------------------------------------
		
		
		//------------------------------------------
		//4.�����Թ���
		public class Form{
			private Button[] button;
		}
		public class Button{}
		//4.�����Թ���
		//------------------------------------------
		
		
		//--------------------------------------------
		//5.�ۺϹ�ϵ
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
		//5.�ۺϹ�ϵ
		//--------------------------------------------
		
		
		//--------------------------------------------
		//6.��Ϲ�ϵ
		public class Head{
			private Mouth mouth;
			public Head(){
				mouth = new Mouth();
			}
		}
		public class Mouth{
			
		}
		//6.��Ϲ�ϵ
		//--------------------------------------------
		
		
		//---------------------------------------------------------
		//7.������ϵ
		public class Driver{
			public void drive(Car1 car){
				car.move();
			}
		}
		public class Car1{
			public void move(){
				
			}
		}
		//7.������ϵ
		//--------------------------------------------------------------
		
		//--------------------------------------------------------------
		//8.������ϵ
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
		//8.����
		//---------------------------------------------------------
		
		
		//----------------------------------------------------------
		
}
	