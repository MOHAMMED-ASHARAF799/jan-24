
public class PrimeNo2 {

	public static void main(String[] args) {
		//print a prime number from 1-100
		for(int i=1,k=0;i<=100;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++)	{		
				if(num % p==0) counter++;
			}
			if(counter == 2) {
				System.out.print(num+" '-' ");
				k++;
				if(k==0) {
					System.out.println();
					k=0;
				}
				
			}
			
		}
		

	}

}
