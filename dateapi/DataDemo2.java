package dateapi;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataDemo2 {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss");
		System.out.println(ft.format(d));
		
		System.out.println("---------------------------");
		
		SimpleDateFormat ft1 = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(ft1.format(d));
		
		System.out.println("---------------------------");
		
		SimpleDateFormat ft2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(ft2.format(d));
		
		System.out.println("---------------------------");
		
		System.out.printf("%s %tB %<te %<tY","DATE IS :",d);
		
		System.out.println("\n---------------------------");
		System.out.println("\n---------------------------");
		
		SimpleDateFormat ftt = new SimpleDateFormat("hh:mm");
		System.out.println(ftt.format(d));
		SimpleDateFormat ft3 = new SimpleDateFormat("D");
		System.out.println("DAY OF THE YEAR "+ft3.format(d));

	}

}
