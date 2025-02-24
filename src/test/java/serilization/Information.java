package serilization;

import java.util.List;

public class Information {

	private String name;
	private int age;
	private Address address;
	private List<Departments> departments;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Departments> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Departments> departments) {
		this.departments = departments;
	}

}
