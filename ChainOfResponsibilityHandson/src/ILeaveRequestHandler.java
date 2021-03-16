
public interface ILeaveRequestHandler {
	public ILeaveRequestHandler nextHandler = null;
	void handleRequest(LeaveRequest request);
	void setNextHandler(ILeaveRequestHandler nextHandler);
	ILeaveRequestHandler getNextHandler();
}
