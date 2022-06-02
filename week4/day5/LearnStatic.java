package week4.day5;

public class LearnStatic {
	public void getEmployeeDetails(String employeeName,int EmpId,String company) {
		System.out.println(employeeName);
		System.out.println(EmpId);
		System.out.println(company);
	}
public static void main(String[] args) {
	LearnStatic  emp=new LearnStatic();
	emp.getEmployeeDetails("amsath",1011, "tcs");
	emp.getEmployeeDetails("jee", 1012, "tcs");
	emp.getEmployeeDetails("madhu", 1013, "tcs");
	emp.getEmployeeDetails("mugil",1014, "tcs");
}	
}
