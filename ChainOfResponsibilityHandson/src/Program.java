import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name:");
		String name = sc.nextLine();
		System.out.print("\nEnter the number of days:");
		int days = sc.nextInt();
		
		LeaveRequest lr = new LeaveRequest();
		lr.setEmployee(name);
		lr.setLeaveDays(days);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler hr = new HR();
		ILeaveRequestHandler manager = new ProjectManager();
		
		supervisor.setNextHandler(manager);
		manager.setNextHandler(hr);
		
		supervisor.handleRequest(lr);
		
		
	}

}
