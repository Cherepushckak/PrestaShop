package pages.User;

import pages.Common.APageParent;

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