 import java.rmi.*;
import java.io.*;


public class Client
{
public static void main(String args[])
  {
String rev,str,str2,con,ls,us;
int c;
 try
  {
 String ip="//localhost/SERVICE";
//192.168.0.19
 Fcl s=
   (Fcl)Naming.lookup(ip);

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	

do
{
System.out.println("MENU\n 1.REVERSE \n 2.COMPARE \n 3.CONCATINATE \n4.LOWERCASE TO UPPERCASE\n5.UPPERCASE TO LOWERCASE\n6.Exit");
System.out.println("Enter the choice\n");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
	case 1:
		System.out.println("enter the String");
		 str=br.readLine();
		rev=s.reverse(str);
		System.out.println("reverse is"+rev);break;
	case 2:
		System.out.println("enter the String");
		str=br.readLine();
		System.out.println("enter the second String");
		str2=br.readLine();
		c=s.compare(str,str2);
		if(c==1)
		 System.out.println("First string is greater");
		else if(c==2)
		System.out.println("Second string is greater");
		else
		 System.out.println("Both are equal");
		break;
	case 3:
		System.out.println("enter the String");
		str=br.readLine();
		System.out.println("enter the second String");
		 str2=br.readLine();
		con=s.append(str,str2);
		System.out.println("The String after concatenation is :"+con);break;
	case 4:
		System.out.println("enter the String");
		 str=br.readLine();
		ls=s.lcase(str);
		 System.out.println("lower to upper:"+ls);break;
	case 5:
		System.out.println("enter the String");
		 str=br.readLine();
		us=s.ucase(str);
		System.out.println("upperr to lower:"+us);break;
	case 6: s.close();
	default:
		System.out.println("wrong choice");

}
}while(true);

  }
 catch(Exception e)
  {
  System.out.println(e.getMessage());
  e.printStackTrace();
  }
  }
}
