package serilization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serilization {
	// POJO concept --> we are going to convert to json

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		ObjectMapper map = new ObjectMapper();
		Information r = map.readValue(new File("C:\\Users\\Windows\\eclipse-workspace\\SampleMavenJan6\\information.json"),
				Information.class);

		String name = r.getName();
		System.out.println(name);
		int age = r.getAge();
		System.out.println(age);
		String streetName = r.getAddress().getStreetName();
		System.out.println(streetName);
		String district = r.getAddress().getDistrict();
		System.out.println(district);
		List<Departments> departments = r.getDepartments();

		for (Departments departments2 : departments) {
			String departmentName = departments2.getDepartmentName();
			String departmentHead = departments2.getDepartmentHead();

			System.out.println(departmentName + " " + departmentHead);
		}
	}

}
