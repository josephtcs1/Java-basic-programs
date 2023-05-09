package Joseph_practice;


 class Example {
	
void kittu() {
	System.out.println("Tiger is back1");
}

}
class Example1 extends Example {
	void kittu() {
		System.out.println("Tiger is back2");
	}
}
public class MainClass {
	
	public static void main(String[] args) {
		Example example = new Example1();
		example.kittu();
		Example example2 = new Example();
		example2.kittu();
	}
}
