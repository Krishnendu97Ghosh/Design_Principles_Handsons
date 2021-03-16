
public class HR implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()>5)
		{
			System.out.println(request.getEmployee()+", your application for "+request.getLeaveDays()+" days leave is granted by HR");
		}
		else {
			nextHandler.handleRequest(request);
		}

	}

	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		// TODO Auto-generated method stub

	}

	@Override
	public ILeaveRequestHandler getNextHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
