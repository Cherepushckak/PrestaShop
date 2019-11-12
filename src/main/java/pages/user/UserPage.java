package main.java.pages.user;

import main.java.pages.header.HeaderFull;

/**
 * 
 */
public class UserPage extends HeaderFull {

	// Fields
	public UserPageContainer userPageContainer;
	
	/**
	 * Default constructor
	 */
	public UserPage() {
		UserPageContainer userPageContainer = new UserPageContainer();
	}


	//Nata created for helper
	public UserPageContainer getUserPageContainer() {
		return userPageContainer;
	}
}