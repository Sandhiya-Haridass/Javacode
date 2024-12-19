package exceptionhandling;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);// super act as a constructor of parent class
	}
}

public class VotingEx {
	String voteValidity(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age for voting ");
		} else {
			return "Thanks for voting";
		}

	}

	public static void main(String[] args) {
		VotingEx v = new VotingEx();
		try {
		String s = v.voteValidity(15);
		System.out.println(s);
	}
		catch (InvalidAgeException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage() +e);
		}
	}}
