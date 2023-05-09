package Joseph_practice;

public class Rakesh {
	public static void main(String[] args) {
    int n1 = 0, n2 = 1, num;
    for (int i = 0; i < 100; i++) {
        num = n2 + n1;
        System.out.println(num + " ");
        n1 = n2;
        n2 = num;
    }
}

}

