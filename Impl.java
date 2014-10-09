 import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;



public class Impl extends UnicastRemoteObject implements Fcl
  {

 	 public Impl()throws Exception
 		 {
 		 super();
  		}

	public String reverse(String str)throws RemoteException
   		{

     		int i,length;
    		 String rev=" ";
     		length=str.length();
     		for(i=length-1;i>=0;i--)
     			{
       			rev+=str.charAt(i);
    			 }
		
		return(rev);
		}

	public int compare(String str,String str2)throws RemoteException
   {
int c;
      if(str.compareTo(str2)>0)
      {
	c=1;
       
      }
      else if(str.compareTo(str2)<0)
      {
c=2;
         
      }
      else
      { 
c=0;
       
      }
return(c);
   }



public String append(String str,String str2)throws RemoteException
   
   {
     String c;
     c=str.concat(str2);
     return(c);
   }



 public String ucase(String str)throws RemoteException
   
   {
     String lstr;
     lstr=str.toLowerCase();
	return(lstr);
   }


  public String lcase(String str)throws RemoteException
   
   {
     String ustr;
     ustr=str.toUpperCase();
	return(ustr);
   }
public void close()throws RemoteException
{
System.exit(0);
}

}
