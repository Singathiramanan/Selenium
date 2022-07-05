package Advance1;

import java.util.ArrayList;
import java.util.Scanner;

public class Muthu  
{
	public static void main(String[] args) 
	{
		Chennai c=new Chennai();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid Name");
		String pname = sc.next();
		c.nameData(pname);
	}
}
class Chennai
	{
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> phoneNumber =new ArrayList<Integer>();
		ArrayList<String> address=new ArrayList<String>();
		public void nameData(String n1)
		{
			name.add("Muthu");
			name.add("Arun");
			name.add("Sridhar");
			name.add("Nagarjun");
			name.add("kumar");	
			phoneNumber.add(79046);
			phoneNumber.add(94869);
			phoneNumber.add(86082);
			phoneNumber.add(90437);
			phoneNumber.add(96775);
			address.add("10/236,Rajaji Nagar");
			address.add("No.9, Kannagi Nagar");
			address.add("No.6,Mullapalayam Street");
			address.add("12/315,S.S.kovil street");
			address.add("No.12,Andal Nagar");
			for(int i=0;i<name.size();i++)
			{
			  if(n1.equals(name.get(i))){
				  System.out.println(name.get(i));
				  System.out.println(phoneNumber.get(i));
				  System.out.println(address.get(i));
			  }
			}
		}
		
}
			
			

	


