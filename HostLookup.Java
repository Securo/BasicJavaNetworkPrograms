import java.net.*;
import java.util.Scanner;


public class HostLookup 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
    	System.out.println("Welcome to the IP Lookup program.");
    	String host;
    	do
    	{
    		System.out.print("\nEnter a host name :");
            host = sc.nextLine();
    		try
    		{
    			InetAddress[] addresses
    			   =  InetAddress.getAllByName(host) ;
    		    for (InetAddress ip : addresses)
    		    	System.out.println(ip.toString());
    		}
    		catch  (UnknownHostException e)
    		{
    			System.out.println("Unknown host.");
    		}
      }   while (doagain());
    }
 
    private static boolean doagain()
    {
    	System.out.println();
    	String s;
    	while (true)
    	{
    		System.out.print("Look up another? "
    		 + "(Y or N) ");
    		s = sc.nextLine();
    		if (s.equalsIgnoreCase("Y"))
    			return true;
    		else if (s.equalsIgnoreCase("N"))
    			return false;
    	}
    }	
}
    		
    		
    