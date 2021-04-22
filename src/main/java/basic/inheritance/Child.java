package basic.inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
	
		Parent obj=new Parent();
		Parent obj1=new Child();
		Child obj2=new Child();
		
	
	//	obj.print();
	//	obj1.print();
		obj2.print();

		

	}
	
	public void print() {
		super.print();
		System.out.println("hi inside child");
	}

}
