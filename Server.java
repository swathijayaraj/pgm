import java.rmi.*;
import java.rmi.server.*;
import java.rmi.Naming.*;
import java.rmi.registry.*;
import java.io.*;
public class Server
{            

        public static void main(String args[])throws IOException
        {
                try
                {
                        Impl j=new Impl();
                        Naming.rebind("localhost",j);
                        System.out.println("server bound");
                }
                catch(Exception e)
                {}
        }
}

