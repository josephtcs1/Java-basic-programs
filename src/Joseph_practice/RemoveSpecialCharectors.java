package Joseph_practice;

public class RemoveSpecialCharectors {
	public static void main(String[] args) {
	String str="JO&^  Se4859#ph#$%^&* ";
	String plainstr=str.replaceAll("[^a-zA-Z0-9]", "");
  System.out.println(plainstr);

}
}
