
public class UserRegistration
{
	public void registerUser(String username, String userCountry)
	{
		if(!userCountry.equals("India)"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) throws InvalidCountryException
	{
		UserRegistration u=new UserRegistration();
		try
		{
			u.registerUser("Pranjali", "Canada");
			//u.registerUser("Pranjali", "India");
		}
		catch(InvalidCountryException e)
		{
			//System.out.println(e.getMessage());
		}
		

	}

}



/*public class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration = new UserRegistration();
		
		try {
			registration.registerUser("Mickey", "US");
			//registration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
			//System.out.println(e.getMessage());
		}
	}

}*/
