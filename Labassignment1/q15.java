import java.util.*;

class q15{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter two No.");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
System.out.println("Before Swap.");
System.out.println("n1:."+n1);
System.out.println("n2:."+n2);

n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.println("After swap2.");
System.out.println("n1:."+n1);
System.out.println("n2:."+n2);


}
}