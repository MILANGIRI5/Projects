package org.milan.sbrest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {

//	http://localhost:8080/employees
	@RequestMapping("employee")
	public List<EmployeeVO> getEmployee() {
		EmployeeVO employee1 = new EmployeeVO(12, "Milan", 22.000);
		EmployeeVO employee2 = new EmployeeVO(13, "Biki", 12.000);

		List<EmployeeVO> employee = new ArrayList<EmployeeVO>();
		employee.add(employee1);
		employee.add(employee2);

		return employee;
	}

//	http://localhost:8080/employees/employee/12
	// search by id
	@RequestMapping("employee/{id}")
	public EmployeeVO getEmployee(@PathVariable("id") int id) {
		System.out.println("id " + id);
		EmployeeVO employee1 = new EmployeeVO(12, "Milan", 22.000);
		EmployeeVO employee2 = new EmployeeVO(13, "Biki", 12.000);

		if (id == 12)
			return employee1;
		else if (id == 13)
			return employee2;
		else {
			return null;
		}
	}

//	http://localhost:8080/employees/employeename/milan
	// search by id
	@RequestMapping("employeename/{name}")
	public EmployeeVO getEmployee(@PathVariable("name") String name) {
		System.out.println("Name " + name);
		EmployeeVO employee1 = new EmployeeVO(12, "Milan", 22.000);
		EmployeeVO employee2 = new EmployeeVO(13, "Biki", 12.000);

		if (name.equalsIgnoreCase("Milan"))
			return employee1;
		else if (name.equalsIgnoreCase("Biki"))
			return employee2;
		else {
			return null;
		}
	}

//	http://localhost:8080/employees/employeeidname/12/milan
	// search by id and name
	@RequestMapping("employeeidname/{id}/{name}")
	public EmployeeVO getEmployee(@PathVariable("id") int id, @PathVariable("name") String name) {
		System.out.println("id and Name " + id + ", " + name);
		EmployeeVO employee1 = new EmployeeVO(12, "Milan", 22.000);
		EmployeeVO employee2 = new EmployeeVO(13, "Biki", 12.000);

		if (id == 12 && name.equalsIgnoreCase("Milan"))
			return employee1;
		else if (id == 13 && name.equalsIgnoreCase("Biki"))
			return employee2;
		else {
			return null;
		}
	}
}
