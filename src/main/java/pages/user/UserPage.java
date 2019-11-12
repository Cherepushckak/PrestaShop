package main.java.pages.user;

import main.java.pages.common.APageParent;

/**
 * 
 */
public class UserPage extends APageParent {

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