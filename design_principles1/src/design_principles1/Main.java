package design_principles1;



public class Main {
	//private static DBConn instance;
	public static DBConn caller()
	{
		return DBConn.getInstance();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Main.caller().hashCode());
		System.out.println(Main.caller().hashCode());
		System.out.println(Main.caller().hashCode());
		

	}

}
