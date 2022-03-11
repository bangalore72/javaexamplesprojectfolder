package dxc.basic2;

import java.util.UUID;

class Aadhar
{
	private String  aadharId;
	
	public Aadhar(String aadhar){
		this.aadharId = aadhar;
	}
}

class Employee extends Aadhar {
	
	private Integer employeeId;
	private String employeeName;
	private Double baseSalary;

	// Parameterized constructor
	Employee(int employeeIdparam, String employeeName, Double baseSalary) {
		super(UUID.randomUUID().toString());
		this.employeeId = employeeIdparam;
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void display() {
		System.out.println("Employee details at parent class employee called");
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Base Salary: " + baseSalary);
	}
	
	public void display(String nameOfCaller) {
		System.out.println("Employee details at parent class employee called");
		 
		
	}
}

class PermanentEmployee extends Employee {
	private String designation;
	private Integer hikePercent;

	PermanentEmployee(int employeeId, String employeeName, Double baseSalary, String designation) {
		super(employeeId, employeeName, baseSalary);
		this.designation = designation;
		this.hikePercent = 12;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getHikePercent() {
		return hikePercent;
	}
    
	public void calculateSalaryHike() {
		Float salaryHike =  (float) (this.getBaseSalary() * (this.getHikePercent()*0.01));
		System.out.println("Salary Hike: "+salaryHike);
	}
	

	public void display() {
		System.out.println("PermanentEmployee details at parent class employee ");
		System.out.println("Employee Id: " + this.getEmployeeId());
	 
	}
	
	
}

class TemporaryEmployee extends Employee {
	private Float servicePeriod;
	
	TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, Float servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}
	
	TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, String  servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		 
	}

	public Float getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(Float servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public void calculateSalaryHike() {
		Float salaryHike =  (float) (this.getBaseSalary() * (this.getServicePeriod()*2*0.01));
		System.out.println("Salary Hike: "+salaryHike);
	}
	
	public void display() {
		System.out.println("TemporaryEmployee details at parent class employee ");
		System.out.println("Employee Id: " + this.getEmployeeId());
	 
	}
	
}



class ContractEmployee extends Employee {
	private Float servicePeriod;
	
	ContractEmployee(int employeeId, String employeeName, Double baseSalary, Float servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}

	public void calculateSalaryHike() {
		Double salaryHike =   this.getBaseSalary() ;
		System.out.println("Salary Hike for contractor: "+salaryHike);
	}
	
 
	public void display() {
		System.out.println("ContractEmployee details at parent class employee ");
		System.out.println("Employee Id: " + this.getEmployeeId());
	 
	}
}


class Tester {
	public static void main(String[] args) {
		PermanentEmployee permanentEmp = new PermanentEmployee(101, "John", 28000.0, "Lead");
		permanentEmp.display();
		System.out.println("Designation: " + permanentEmp.getDesignation());
		permanentEmp.calculateSalaryHike();
		
		System.out.println("----------------");
		TemporaryEmployee tempEmp = new TemporaryEmployee(210, "Ross", 20000.0, 2.5f);
		tempEmp.display();
		System.out.println("Service Duration (in years): " + tempEmp.getServicePeriod());
		tempEmp.calculateSalaryHike();

		
		 
		
		Employee baseEmp = new Employee(110 , "Shadab" , 12000.0);
		baseEmp.display("Suresh");
		baseEmp.display();
		
		baseEmp = permanentEmp;
		baseEmp.display("Suresh100");
		
		baseEmp =   new PermanentEmployee(101, "John", 28000.0, "Lead");
		baseEmp.display();
		
		
	}
}


