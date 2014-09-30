import java.net.*;
import java.rmi.*;
import java.io.*;
import java.rmi.Naming.*;
public class Fcli
{
	public static void main(String args[])throws IOException,NotBoundException
	{
		Fcl f=(Fcl)Naming.lookup("//192.168.0.17/localhost");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		BufferedReader br2=new BufferedReader(isr);
		String s1=br.readLine();
		String s2=br2.readLine();
		f.cmpr(s1,s2);
		f.rev(s1);
		f.concat(s1,s2);
		f.cse(s1,s2);
	}
}
