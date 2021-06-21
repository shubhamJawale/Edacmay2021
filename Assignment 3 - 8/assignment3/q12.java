//q12.java

/*12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]*/
import java.util.*;







class q12{
	
	public static void main (String args[]){

		

			Scanner sc = new Scanner(System.in);
			int basic_sal = sc.nextInt();
			int hra, da, gs;

			if(basic_sal <10000)
			{
				hra = (int)((2.1) * basic_sal);
				da = (int)((0.9) * basic_sal);
				gs = (int) (basic_sal+hra+da);

				System.out.println("gross salary is " +gs+ " including HRA of " +hra+ " and da of " +da );
			}
			else {
				hra = 2000;
				da = (int)((0.98) * basic_sal);
				gs = (basic_sal+hra+da);

				System.out.println("gross salary is " +gs+ " including HRA of " +hra+ " and da of " +da );
			}

	}


}