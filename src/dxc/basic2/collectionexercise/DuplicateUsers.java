package dxc.basic2.collectionexercise;

 
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class User {
	private String username;
	private String password;
	private String email;

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	//overriding equals method which compares username of users to check if they are equal or not
	@Override
	public boolean equals(Object user) {
		User tempuser = null;
		boolean flag = false;
		if (user instanceof User) { //instanceof tests if passed object is of User class or not
			tempuser = (User) user;
			flag=this.email.equals(tempuser.email);
		}
		return flag;
	}

	//overriding hashCode() method to return length of username
	@Override
	public int hashCode() {
		return username.length();
	}

	//overriding hashCode() to print username and email when User object reference is printed
	@Override
	public String toString() {
		return this.username + " : " + this.email;
	}
}

class DuplicateUsers {

	public static void main(String[] args) {
		// creating a list of users
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Max", "fgc123", "max@infy.com"));
		userList.add(new User("Mike", "hdgsh@", "imike@infy.com"));
		userList.add(new User("John", "ucantseeme", "jojo@infy.com"));
		userList.add(new User("Moby", "fgc123", "iammoby@infy.com"));
		userList.add(new User("Moby", "fgc123", "iammoby@infy.com"));

		// creating user set from list
		Set<User> userSet = new LinkedHashSet<User>();
		userSet.addAll(userList);
		
		//printing all users
		for (User user : userSet) {
			System.out.println(user);
		}
	}
}
//Step1: execute the program, observe objects printed
//Step2: uncomment equals() and hashCode(), observe objects printed
