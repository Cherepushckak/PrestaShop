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
	public UserPage() { getUserPageContainer(); }

	public UserPageContainer getUserPageContainer() {
		return new UserPageContainer();
	}
}