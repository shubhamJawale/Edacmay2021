//q4.java-assignmnet 6



import java.util.*;


class Marks
{
	Scanner sc = new Scanner(System.in);
	int totalMarks;	
	float avg ;
	Marks(){}
	/*Marks(int totalMarks)
	{
		this.totalMarks = totalMarks;
		avg = (float)(totalMarks/3);
	}*/
	
	void display(){

		avg = (float)(totalMarks/3);
		System.out.println("totalMarks"+totalMarks);
		System.out.println("Avarage"+avg);
	}
	

}


class Physics extends Marks 
{
	

	int pmarks;
	Physics()
	{
		System.out.println("Enter marks for Physics");
		int marks=sc.nextInt();
		this.pmarks= marks;
		super.totalMarks += marks;

	}

}

class Chemistry extends Marks 
{
	int cmarks;

	Chemistry()
	{
		System.out.println("Enter marks for Chemistry");
		int marks=sc.nextInt();
		this.cmarks= marks;
		super.totalMarks += marks;

	}


	

}

class Maths extends Marks 
{
 	int mmarks;

	Maths()
	{
		System.out.println("Enter marks for Maths");
		int marks=sc.nextInt();
		this.mmarks= marks;
		super.totalMarks += marks;

	}

}


class Student
{
	Scanner sc = new Scanner(System.in);
	int rollno;
	String name;
	Marks marks;
	Student[] arr;
	Student(int rollno ,  String name, Marks marks){
		this.rollno = rollno;
		this.name = name;
		this.marks=marks;
	
	}
	Student(int size){
		 arr = new Student[size];
	}




	Student addStudent()
	{
		System.out.println("Enter roll no");
		int rn= sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.next();
		System.out.println("Enter markks");
		Marks c = new Chemistry();
		 c = new Physics();
		 c = new Maths();


		return new Student(rn,nm,c);
	}

	Student[] saveStudent()
	{
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=addStudent();
		}
		return arr;
	}

	void Display(Student[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i].rollno);
			System.out.println(arr[i].name);
			System.out.println(arr[i].marks.totalMarks);
			System.out.println(arr[i].marks.avg);
		}
	}




}


class q4
{
	public static void main(String[] args) {
		Student s = new Student(1);
		Student[] a1= s.saveStudent();
						s.Display(a1);
	}
}