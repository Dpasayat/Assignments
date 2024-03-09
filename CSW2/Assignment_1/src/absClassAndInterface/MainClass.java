package absClassAndInterface;
import java.util.*;
public class MainClass 
{

	public static void main(String[] args) 
	{
		

	}

}

interface NetworkDevInterface
{
	int MIN_PORT = 49152;
	int MAX_PORT= 65535;
	String IP_prefix="127.0.1";
	void initiate();
	void assign_IP_port(int IP_addr,int port);
	
	void release_IP_port();
}
abstract class NetworkDevAbstract
{
	protected static List <Integer> assignedIPs = new ArrayList <Integer> ();
	protected static List <Integer> assignedPorts = new ArrayList <Integer> ();
	protected int port;
	protected int IP;
	public final void disp_basic ()
	{
		for(int i=0;i<assignedIPs.size();i++)
		{
			System.out.println(assignedIPs.get(i));
		}
		for(int i=0;i<assignedPorts.size();i++)
		{
			System.out.println(assignedPorts.get(i));
		}
	}

	  abstract public void disp_dev_specific ();

	@Override
	public String toString() {
		return "Device ip:[ "+NetworkDevInterface.IP_prefix + port + ""+ IP + "]";
	}	  
}

class Mobile  extends NetworkDevAbstract implements NetworkDevInterface
{
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getIp() {
		return IP;
	}

	public void setIp(int ip) {
		this.IP = ip;
	}

	@Override
	public void initiate() 
	{
		 int randport =(int) Math.floor(Math.random()*(NetworkDevInterface.MAX_PORT-NetworkDevInterface.MIN_PORT )+NetworkDevInterface.MIN_PORT );
		 int randip= (int) Math.floor(Math.random()*126 + 1);
		if(!assignedIPs.contains(randip) && !assignedPorts.contains(randport)) 
		{
			assignedPorts.add(randport);
			assignedIPs.add(randip);
			this.setPort(randport);
			this.setIp(randip);
			return;
			
		}
		else initiate();
		
	}

	@Override
	public void assign_IP_port(int IP_addr, int port) 
	{
		if(!assignedIPs.contains(IP_addr) && !assignedPorts.contains(port)) 
		{
			assignedPorts.add(port);
			assignedIPs.add(IP_addr);
			this.setPort(port);
			this.setIp(IP_addr);
			return;
			
		}
		else
		{
			System.out.println("IP already assigned");
		}
		
		
	}

	@Override
	public void release_IP_port() 
	{
		assignedIPs.remove(this.IP);
		assignedPorts.remove(this.port);
		
	}

	@Override
	public void disp_dev_specific() 
	{
		
		System.out.println("Mobile"+assignedIPs.indexOf(this.IP)+": "+this);
	}
	
	
}
class SmartWatch  extends NetworkDevAbstract implements NetworkDevInterface
{
	
	

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getIp() {
		return IP;
	}

	public void setIp(int ip) {
		this.IP = ip;
	}

	@Override
	public void initiate() 
	{
		 int randport =(int) Math.floor(Math.random()*(NetworkDevInterface.MAX_PORT-NetworkDevInterface.MIN_PORT )+NetworkDevInterface.MIN_PORT );
		 int randip= (int) Math.floor(Math.random()*126 + 1);
		if(!assignedIPs.contains(randip) && !assignedPorts.contains(randport)) 
		{
			assignedPorts.add(randport);
			assignedIPs.add(randip);
			this.setPort(randport);
			this.setIp(randip);
			return;
			
		}
		else initiate();
		
	}

	@Override
	public void assign_IP_port(int IP_addr, int port) 
	{
		if(!assignedIPs.contains(IP_addr) && !assignedPorts.contains(port)) 
		{
			assignedPorts.add(port);
			assignedIPs.add(IP_addr);
			this.setPort(port);
			this.setIp(IP_addr);
			return;
			
		}
		else
		{
			System.out.println("IP already assigned");
		}
		
		
	}

	@Override
	public void release_IP_port() 
	{
		assignedIPs.remove(this.IP);
		assignedPorts.remove(this.port);
		
	}

	@Override
	public void disp_dev_specific() 
	{
		
		System.out.println("Smartwatch"+assignedIPs.indexOf(this.IP)+": "+this);
	}
	
}
