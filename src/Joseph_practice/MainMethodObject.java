package Joseph_practice;

public class MainMethodObject {
	public static void main(String[] args) {
		ObjectCreating obj= new ObjectCreating();
		 obj.length=20;
		 obj.width=30;
		    
		ObjectCreating king= new ObjectCreating();
		king.length=39;
		king.width=68;
		
		int joseph=obj.area();
		int joseph1=obj.per();
		System.out.println("area " +joseph);
		System.out.println("per   "  + joseph1);
		
		
		int ram=king.area();
		int ram1=king.per();
		System.out.println("area " +ram);
		System.out.println("per  " +ram1);
	}

}
