import java.util.Scanner;

public class Fourthfunctionexample {
	static float anyCountryToIndianrupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("usa")) {
			res=amt*78.25f;
			
		}
		if(country.equalsIgnoreCase("UK")) {
			res=amt*65.25f;
			
		}
		if(country.equalsIgnoreCase("uae")) {
			res=amt*20.25f;
			
		}
		return res;	
		
	}
	static int getAmt() {
		return 100;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter country name--->");
		String country =sc.next();
		String cC=getMydetails(country);
		System.out.println("please enter country",+cC);
		if(cC.equalsIgnoreCase("country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt=sc.nextInt();
			
		}
		
		
	}
	private static String getMydetails(String country) { 
		string
		
		// TODO Auto-generated method stub
		return null;
	}
			
		
	}


