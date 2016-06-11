package test.service.user.mgtm;

import java.util.ArrayList;
import java.util.List;

import test.service.pojo.Person;

public class UserMgmtServiceImpl implements IUserMgmtService {

	@Override
	public List<Person> getPersonList() {
		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.add(new Person("John", "England", 22));
		arrayList.add(new Person("Michael", "Scotland", 22));
		arrayList.add(new Person("Mak", "US", 22));
		arrayList.add(new Person("IOIO", "UAE", 22));

		return arrayList;
	}

}
