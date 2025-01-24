import java.util.Scanner;

public class IfElsefile {

	public static void main(String[] args) {
		// TODO Auto-generated method struc
		char ch;
Scanner inp=new Scanner(System.in);
System.out.println("enter a char---.");
ch=inp.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')) {
	System.out.println("ALPHABET");
}
else if(ch>='0'&& ch<='9') {
	System.out.println("digit...");

}
else {
	System.out.println("spl character...");
}
System.out.println("math.round(1.349765)"+Math.round(1.349765));



	}

}
