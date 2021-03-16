
public class ProjectManager implements ILeaveRequestHandler {
	public ILeaveRequestHandler nextHandler;
	

	public ILeaveRequestHandler getNextHandler() {
		return nextHandler;
	}


	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()<=5)
		{
			System.out.println(request.getEmployee()+", your application for "+request.getLeaveDays()+" days leave is granted by Project Manager");
		}
		else {
			nextHandler.handleRequest(request);
		}

	}

}
