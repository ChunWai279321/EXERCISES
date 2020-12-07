
public class Exercise3 {

	public static void main(String[] args) {

		System.out.println("For");
		int sum=0;
		double total;
		double average;
		int lowerbound=1;
		int upperbound=100;
		for(int number=lowerbound; number<=upperbound; ++number) {
			sum+=number;
		}
		total=sum;
		average=total/upperbound;
		System.out.println("The sum of 1 to 100 is "+sum);
		System.out.println("The average is "+average+"\n");
		
		
		System.out.println("While-do");
		sum=0;
		int number=lowerbound;
		while(number<=upperbound) {
			sum+=number;
			++number;
		} 
		average=total/upperbound;
		System.out.println("The sum of 1 to 100 is "+sum);
		System.out.println("The average is "+average+"\n");
	
		System.out.println("Do-while");
		sum=0;
		number=lowerbound;
		do {
			sum+=number;
			++number;
		} while (number<=upperbound);
		average=total/upperbound;
		System.out.println("The sum of 1 to 100 is "+sum);
		System.out.println("The average is "+average);
	}
}
		
		
	
	

