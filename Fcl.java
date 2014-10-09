 import java.rmi.*;

public interface Fcl extends Remote
{
public String reverse(String str)throws RemoteException;
public int compare(String str,String str2)throws RemoteException;
public String append(String str,String str2)throws RemoteException;
public String ucase(String str)throws RemoteException;
public String lcase(String str)throws RemoteException;
public void close()throws RemoteException;
}
