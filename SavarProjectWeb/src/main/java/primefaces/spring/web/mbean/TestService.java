package primefaces.spring.web.mbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import test.service.pojo.Person;
import test.service.user.mgtm.IUserMgmtService;

@Controller
@ManagedBean(name = "testService")
@ViewScoped
public class TestService implements Serializable {

	@Autowired
	private IUserMgmtService mgmtService;

	/**
	 * 
	 */

	public void populatePersonList(ActionEvent event) {
		
		this.personList.addAll(mgmtService.getPersonList());
		
		System.out.println(personList);

	}

	private static final long serialVersionUID = 1L;
	private List<Person> personList;

	public TestService() {
		personList=new ArrayList<Person>();
		System.out.println("Bean initialised");
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

}
