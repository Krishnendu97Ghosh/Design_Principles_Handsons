package design_principles1;

public class DBConn {
	private static DBConn instance;

	private DBConn() {}	
	
    public static DBConn getInstance()
    {
    	if(instance==null) 
    	{
    		instance = new DBConn();
    	}
    	return instance;
    }
    
//    public void print()
//    {
//    	System.out.println("Do you know this fact that Anton died so we could live!");
//    }
	
}
