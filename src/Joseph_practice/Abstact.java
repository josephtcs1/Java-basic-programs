package Joseph_practice;

abstract class EmpInfo{
	abstract  void Info();
}
class info extends EmpInfo{
	void Info() {
		String name="joseph";
		int age =21;
		long salary = 250000;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	
}
public class Abstact {
	public static void main(String[] args) {
		EmpInfo a= new info();
		a.Info();
	}
	

}
