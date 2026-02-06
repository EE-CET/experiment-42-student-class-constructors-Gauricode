import java.util.Scanner;

class Student {
	String name;
	int rollNo;
   
	Student(String name, int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}

    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    
    // TODO: Create a method or use direct access to print details in the required format
}

public class StudentClass {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	String name1=sc.nextLine();
	int rollNo1=sc.nextInt();
	sc.nextLine();
	Student s1=new Student(name1,rollNo1);
        
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        String name2=sc.nextLine();
	int rollNo2=sc.nextInt();
	sc.nextLine();
	Student s2=new Student(name2,rollNo2);

        // TODO: Read name2
        // TODO: Read rollNo2
        
        // TODO: Create two Student objects
        System.out.println("Name: "+s1.name+" Roll: "+s1.rollNo);
	System.out.println("Name: "+s2.name+" Roll: "+s2.rollNo);
    }    // TODO: Print details for both students
    
}
