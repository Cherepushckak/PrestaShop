package main.java.pages.User;

import main.java.pages.Common.APageParent;

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
	
}