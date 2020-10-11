package intro;

import java.util.*;
public class employee 
{
		String name;
		int age;
		String place;
	public void inizalize()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=input.next();
		System.out.println("Enter the Age");
		int age=input.nextInt();
		System.out.println("Enter the place");
		String place=input.next();
    	System.out.println(name);
		System.out.println(age);
		System.out.println(place);
        }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
      employee s2=new employee();
	  employee s1=new employee();
      s1.inizalize();
}
}