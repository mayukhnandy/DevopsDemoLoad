
package com.model;
import java.util.*;
public class UserRepository {
	 public static List<User>  userList= new ArrayList<User>();

	public List<User> getAllUsers() {
		return userList;
	}

	public void addUsersToRepository() {
		User user1 = new User("admin", "admin");
		User user2 = new User("debu", "debu");
		userList.add(user1);
		userList.add(user2);
	} 
}
