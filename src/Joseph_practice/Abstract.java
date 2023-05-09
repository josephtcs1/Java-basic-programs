package Joseph_practice;
abstract class A{
	abstract void display();
	void King() {
		System.out.println("virat....."); // normal method
		
	}
}
abstract class B extends A{
	 void display() {
		System.out.println("dispaly");
	}
	abstract void show(); 

} 
class C extends B{
	 void show() {
		System.out.println("showeble.......");
	}
	
} 
public class Abstract{
	public static void main(String[] args) {
		C obj=new C();
		obj.display();
		obj.show();
		obj.King();
		
	}
}
