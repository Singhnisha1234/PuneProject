package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		List<Employee> list = Arrays.asList();
	
		  new Employee(101,"Nisha","nishasingh39107@gmail.com","Pune","IT","Female",28);
		  new Employee(102,"Amit","amitkumar11@gmail.com","Delhi","HR","male",29);
		  new Employee(103,"Lata","latasingh23@gmail.com","Noida","Developer","Female",30);
		  new Employee(104,"Isha","isha123@gmail.com","Delhi","Software Developer","Female",27);
		  new Employee(105,"Naina","naina345@gmail.com","Mumbai","Developer","Female",26);
		  new Employee(105,"Naina","naina345@gmail.com","Mumbai","Developer","Female",26);
		
	List<Employee> l = list.stream().filter(n -> n.getAge()>26).collect(Collectors.toList());
		  System.out.println(l);
		 
		
	}

}
