import java.util.*;
class q13{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter Height");
float height = sc.nextFloat();

System.out.println("Enter width");
float width = sc.nextFloat();

float area = width * height;
float parimeter = 2 * ( width + height);

System.out.println("Area of Ractangle with  width of " +width+ " and height of " + height + " is ===> "  +area);
System.out.println("Perimeter of Ractangle with  width of " +width+ " and height of " + height + " is ===> "  +parimeter );
 
}


}