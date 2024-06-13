package java8;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String city;
	private String department;
	private String gender;
	private int age;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, String city, String department, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.department = department;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", department="
				+ department + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
