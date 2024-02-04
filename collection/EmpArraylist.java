package collection;
import java.util.*;

public class EmpArraylist {

	public static void main(String[] args) {
	//	ArrayList empList = new ArrayList<>();
		List empList1 = new ArrayList();
		
		Emp emp1= new Emp(1, "kunal", 30000);
		Emp emp2= new Emp(2, "tunal", 40000);
		Emp emp3= new Emp(3, "sunal", 50000);
		Emp emp4= new Emp(4, "munal", 60000);
		Emp emp5= new Emp(5, "hunal", 70000);
		
		empList1.add(emp1);
		empList1.add(emp2);
		empList1.add(emp3);
		empList1.add(emp4);
		empList1.add(emp5);
		
		for(int i=0;i<empList1.size();i++) {
			System.out.println(empList1.get(i));
		}
		System.out.println("----------SIZE--------------");
		System.out.println(empList1.size());
		System.out.println("----------GET--------------");
		System.out.println(empList1.get(3-1));
		System.out.println("----------DELETE-------------");
		System.out.println(empList1.remove(5-1));
		
		System.out.println("----------DISPLAY--------------");
		for(int i=0;i<empList1.size();i++) {
			System.out.println(empList1.get(i));
		}
		Emp emp6= new Emp(5, "hunal", 70000);
		empList1.add(emp6);
		System.out.println("----------SUBLIST--------------");
		System.out.println(empList1.subList(0, 5));
		
	}

}
