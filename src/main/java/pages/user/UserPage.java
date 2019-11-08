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
	
}