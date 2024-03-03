package onurkaan2;

public class main {
 
	public static void main(String[] args) {
		Employee employee=new Employee("onur kaan","Bilişim",4000);
		employee.showInfos();
		Manager manager=new Manager("oguzhan","temizlik",1000,10);
		manager.showInfos();
        manager.raiseSalary(100);
	}

}
