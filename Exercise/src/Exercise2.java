import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		printExercise7();
		printExercise19();
		printExercise20();
		printExercise31();
		printExercise33();
		printExercise34();
		printExercise37();
		printExercise46();
		printExercise49();
		printExercise52();
	}
	
		public static void printExercise7() {
			Scanner in=new Scanner(System.in);
			System.out.println("Exercise 7");
			System.out.print("Enter a number: ");
			int no=in.nextInt();
			for(int i=1;i<11;i++)
			{
			System.out.println(no+"x"+(i)+"="+(no*i)+"\n");
			}	
	}
		
		public static void printExercise19() {
			Scanner in=new Scanner(System.in);
			System.out.println("Exercise 19");
			int num, i=1, j; 
			int b2[]=new int[100];
			System.out.print("Enter a number: ");
			num=in.nextInt();
			while(num!=0) {
				b2[i++]=num%2;
				num=num/2;	
			}
			System.out.print("Binary is: ");
			for(j=i-1;j>0;j--) {
				System.out.print(b2[j]);
			} 
			System.out.println("\n");
	}
		
		public static void printExercise20() {
			Scanner in=new Scanner(System.in);
			System.out.println("Exercise 20");
			String base16="";
			char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			System.out.print("Enter a number: ");
			int no=in.nextInt();
			while (no>0) {
				int rem=no%16;
				base16=hex[rem]+base16;
				no=no/16;
			}
			System.out.println("Hexadecimal: "+base16+"\n");
	}
			
		
		public static void printExercise31() {
			System.out.println("Exercise 31");
			System.out.println("Java Version: "+System.getProperty("java.version"));
			System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
			System.out.println("Java Home: "+System.getProperty("java.home"));
			System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
			System.out.println("Java Vendor URL: "+System.getProperty("java.vendot.url"));
			System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}
		
		public static void printExercise33() {
			System.out.println("Exercise 33");
			Scanner in=new Scanner(System.in);
			System.out.print("Enter a number: ");
			long no=in.nextLong();
			System.out.println("The sum of the number: "+ sumd(no)+"\n");
		}
			public static int sumd(long no) {
				int sum=0;
				while(no!=0) {
					sum+=no%10;
					no/=10;
				}
				return sum;
	}
		
		public static void printExercise34() {
			System.out.println("Exercise 34");
			Scanner in=new Scanner(System.in);
			System.out.print("Enter a length: ");
			double len=in.nextDouble();
			System.out.println("Area of the hexagon is: "+hexagonArea(len)+"\n");
		}
			public static double hexagonArea(double len) {
				return (6*(len*len))/(4*Math.tan(Math.PI/6));
	}
		
		public static void printExercise37() {
			System.out.println("Exercise 37");
			Scanner in=new Scanner(System.in);
			System.out.print("Enter a phrase: ");
			char[] letters=in.nextLine().toCharArray();
			System.out.print("Reverse: ");
			for (int i=letters.length-1;i>=0;i--) {
				System.out.print(letters[i]);
			}
			System.out.print("\n");
	}
		
		public static void printExercise46() {
			System.out.println("Exercise 46");
			System.out.format("Current date & time: %tc%n\n",System.currentTimeMillis());
	}
		
		public static void printExercise49() {
			System.out.println("Exercise 49");
			for(int i=1;i<100;i++) {
				if(i%2!=0) {
					System.out.println(i);}}
				System.out.println("");	
	}
		
		public static void printExercise52() {
			System.out.println("Exercise 52");
			Scanner in=new Scanner(System.in);
			int fno, sno, tno, total;
			System.out.print("Enter 1st number: ");
			fno=in.nextInt();
			System.out.print("Enter 2nd number: ");
			sno=in.nextInt();
			System.out.print("Enter sum of 1st and 2nd number: ");
			tno=in.nextInt();
			total=fno+sno;
			if (tno==total) {
				System.out.print("Result: True");
			} else {
				System.out.print("Result: False");
			}
	}
}
