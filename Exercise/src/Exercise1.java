import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("RESUME\n");
		printName();
		printGender();
		printBirthday();
		printAge();
		printMaritalStatus();
		printCitizenship();	
		printHomeAddress();
		printContactNumber();
		printGrade();
		printGPA();
		printWorkExperiences();
		printLanguages();
		printAwards();
	}
	
	
		public static void printName() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your name:");
			String name=in.nextLine();
			System.out.println("Name\t\t\t\t: "+name);			
	}
	
		public static void printGender() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your gender: ");
			String str=in.next();
			char gender=str.charAt(0);
			System.out.println("Gender\t\t\t\t: "+gender);
	}
		
		public static void printBirthday() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your birthday: ");
			String birth=in.nextLine();
			System.out.println("Birthday\t\t\t: "+birth);
	}
		
		public static void printAge() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your age:");
			int age=in.nextInt();
			System.out.println("Age\t\t\t\t: "+age+" years old");
	}
		
		public static void printMaritalStatus() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your marital tatus");
			String marital=in.nextLine();
			System.out.println("Marital Status\t\t\t: "+marital);
	}
		
		public static void printCitizenship() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your citizenship: ");
			String citizen=in.nextLine();
			System.out.println("Citizenship\t\t\t: "+citizen);
	}

		public static void printHomeAddress() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your address: ");
			String add=in.nextLine();
			System.out.println("Address\t\t\t\t:"+add);
	}
		
		public static void printContactNumber() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your contact number: ");
			String ph=in.nextLine();
			System.out.println("Contact Number\t\t\t:"+ph);
	}
		
		public static void printGrade() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your Grade STIA1113: ");
			String str=in.nextLine();
			char grade=str.charAt(0);
			System.out.println("Grade\t\t\t\t:"+grade);
	}
		
		public static void printGPA() {
			Scanner in=new Scanner (System.in);
			System.out.println("GPA sem1:");
			double sem1=in.nextDouble();
			System.out.println("GPA sme2:");
			double sem2=in.nextDouble();
			double total=(sem1+sem2)/2;
			System.out.println("CGPA\t\t\t\t:"+total);
	}
		
		public static void printWorkExperiences() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your 1st job: ");
			String no1=in.nextLine();
			System.out.println("Enter your 2nd job: ");
			String no2=in.nextLine();
			System.out.println("Work Experiences\t\t: 1."+no1+"\n\t\t\t\t\s\s2."+no2);
	}
		
		public static void printLanguages() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your 1st language: ");
			String lan1=in.nextLine();
			System.out.println("Enter your 2nd language: ");
			String lan2=in.nextLine();
			System.out.println("Languages\t\t\t: 1."+lan1+"\n\t\t\t\t\s\s2."+lan2);
	}
		
		public static void printAwards() {
			Scanner in=new Scanner (System.in);
			System.out.println("Enter your award: ");
			String a1=in.nextLine();
			System.out.println("Enter your award: ");
			String a2=in.nextLine();
			System.out.println("Awards\t\t\t\t: 1."+a1+"\n\t\t\t\t\s\s2."+a2);
	}
		
}

