package exceptionhandling;

public class VoteException extends Exception {
	public VoteException(String vote)
	{
		super(vote);
	}

}
