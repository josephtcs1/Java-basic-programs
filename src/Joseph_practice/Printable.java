package Joseph_practice;

 interface Printable {
	void print();
	int a=20;
}
interface showble{
		void show();
		
	}

 class TestInt implements Printable,showble{
	public void print() {
		System.out.println("Printble...........");
		
	}
	public void show(){
		System.out.println("shoeble............");
		
	}
	public  class Printable{
   public  void main(String[] args) {
	   TestInt obj= new TestInt();
	   obj.print();
	   obj.show();
	   //obj.a=30;
	   //System.out.println(obj.a);
	
}
	
}
 }
 
  
