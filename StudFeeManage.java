package StudentFeesManagement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class StudFeeManage {
	public static void main(String[] args){
		int balance=0;
		Map<String,Integer>names=new LinkedHashMap<>();
		Map<String,Integer>year=new LinkedHashMap<>();
		names.put("Dhanu", 10000);
		names.put("Sri", 20000);
		names.put("Susee", 10000);
		names.put("Dharan", 20000);
		names.put("Kaviya", 5000);
		names.put("Kalees",3000);
		names.put("Ashwin", 1000);

		year.put("Dhanu", 1);
		year.put("Sri", 2);
		year.put("Susee",2);
		year.put("Dharan",3);
		year.put("Kaviya", 3);
		year.put("Kalees",1);
		year.put("Ashwin", 1);

		
		System.out.println("-------------------Welcome's you----------------------");
		System.out.println("-------------------ANNAMALAI UNIVERSITY------------------");
		System.out.println("\n"+ "---------------Student's name with balance-------------");
		
		System.out.println("Name \t Fees \t Year");
		System.out.println("----------------------------------------------------------");
		for (String name: names.keySet()) {
		    String key = name.toString();
		    String value = names.get(name).toString();
		    System.out.println(key +"\t"+ value+"\t"+year.get(name));
		    
		}
		System.out.println("\n"+"------------------------------------------------------");
		
		
		Map<String,Integer>fees=new LinkedHashMap<>();
		fees.put("1st ", 20000);
		fees.put("2nd ", 20000);
		fees.put("3rd ", 20000);
		System.out.println("\n"+"------------------Term Fee Details------------------");
		System.out.println("Term \t\t Fees ");
		System.out.println("---------------------------------------------------------");
		for (String name: fees.keySet()) {
		    String key = name.toString();
		    String value = fees.get(name).toString();
		    System.out.println(key +"\t"+ value);
		}

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n"+"---------------------********-----------------------");
			System.out.println("Enter the Name: ");
			String name = sc.next();
			System.out.println("Enter the Amount: ");
			int amount=sc.nextInt();
			if(names.get(name)>= amount) {
				System.out.println("--------------*Paid Successfully*---------------");
				names.put(name, names.get(name)-amount);
				System.out.println("Student Name:\t"+name);
				System.out.println("Remaining Fee:\t"+names.get(name));
				
				
			}else {
				System.out.println("-------------*Payment unsuccessfull*--------------");
			}
		}
		
	}
}
