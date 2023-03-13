package firstPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UserService {
	private static List<UserBean> users = new ArrayList<>();

	static {
		users.add(new UserBean("suriya",22));
		users.add(new UserBean("prakash",28));
	}

	private UserBean UserBean;

	public List<UserBean> findAll() {
		return users;
	}

	public UserBean save(UserBean user) {
		users.add(user);
		return UserBean;
	}

	public UserBean findOne(String name) {
		for (UserBean user : users) {
			if (user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public UserBean deleteById(String name) {
		Iterator<UserBean> iterator = users.iterator();
		while (iterator.hasNext()) {
			UserBean user = iterator.next();
			if (user.getName().equalsIgnoreCase(name)) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
