package service;

public class UserinfoService {
	public boolean login(String username, String password) {
		if (username.equals("a") && password.equals("aa")) {
			return true;
		} else {
			return false;
		}
	}
}
