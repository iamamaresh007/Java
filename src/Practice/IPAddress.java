package Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress myIP = InetAddress.getLocalHost();
		System.out.println("IP address is:");
		System.out.println(myIP.getHostAddress());
	}

}
