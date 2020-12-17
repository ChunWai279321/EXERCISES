import java.util.*;
public class Exercise4 {

		public static void main(String[] args) {
			Question1();
			Question2();
			Question3();
			Question4();
		}
		
		public static void Question1(){
			System.out.println("Question 1");
			//a)Declare an array alpha of 15 element of type integer
			int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			int[] beta = new int[20];
			
			//b)Output the value of the tenth element of the array alpha
			System.out.println(alpha[9]);
			
			//c)Set the value of the fifth element of the array to 35
			alpha[4] = 35;
			System.out.println(alpha[4]);
			
			//d)Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha
			alpha[8] = alpha[5] + alpha[12];
			System.out.println("Sum ="+alpha[8]);
			System.out.println();
		}

		public static void Question2() {
			System.out.println("Question 2");
			// Write a statement that declares a string array initialized with the following strings:
			//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday"
			//Write a loop that displays the contents of each element in the array that you declared
			String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			for (int i=0; i<days.length; i++) {
				System.out.println(days[i]);
			} System.out.println();
			int a=0;
			while (a<days.length) {
				System.out.println(days[a]);
				a++;
			} System.out.println();
			int b=0;
			do {
				System.out.println(days[b]);
				b++;
			} while (b<days.length);
			System.out.println();
		}
		
		public static void Question3() {
			System.out.println("Question 3");
			//Write a program that creates an array of 10 elements size
			//Your program should prompt the user to input numbers in array and then display the sum of all array elements
			int[] ele= new int[10];
			Scanner in=new Scanner(System.in);
			System.out.println("Enter numbers: ");
			for (int i=0; i<ele.length; i++) {
				ele[i]=in.nextInt();
			}
			int sum=0;
			for (int i=0; i<10; i++) {
				sum+=ele[i];
			}
			System.out.println("Sum: "+sum);
			System.out.println();
		}
		
		public static void Question4() {
			System.out.println("Question 4");
			//The variable list1 and list2 are reference arrays that each have 5 elements
			//Write code that copies the values in list1 to list2. Values in list1 are input by user
			int[] list1 = new int [5];
			int[] list2 = list1;
			Scanner in=new Scanner(System.in);
			System.out.println("List 1:");
			System.out.println("Enter 5 numbers: ");
			for (int i=0; i<list1.length; i++) {
				list1[i]=in.nextInt();
			} System.out.println();
			System.out.println("List 2");
			for (int i=0; i<list2.length; i++) {
				System.out.println(list2[i]);
			}	
			
	}
}
