package week1.day2;

public class Employeedetails {
public  String printEmployeeName(String empName, int empID) {
	return empName;	
}
public String getEmployeeAddress(String empAddress) {
	return empAddress;
}
public double printEmployeeSalary(double empsalary) {
	return empsalary ;
}
public long printMobileNo(long empNo) {
	return empNo;
}
public static void main(String[] args) {
	Employeedetails ed = new Employeedetails();
	
	String Name = ed.printEmployeeName("Amsath", 3699);
	System.out.println(Name);
	String address =ed.getEmployeeAddress("Kumbakonam");
	System.out.println(address);
	double salary =ed.printEmployeeSalary(45000);
	System.out.println(salary);
	long mobNo =ed.printMobileNo(82707556);
	System.out.println(mobNo);
}
}