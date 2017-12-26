package br.com.newcorretora.service.geraws.clientsample;

import br.com.newcorretora.service.geraws.SUDPOMSGPort;
import br.com.newcorretora.service.geraws.SUDPOMSGService;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        SUDPOMSGService service1 = new SUDPOMSGService();
	        System.out.println("Create Web Service...");
	        SUDPOMSGPort port1 = service1.getSUDPOMSGPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.geraws(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        SUDPOMSGPort port2 = service1.getSUDPOMSGPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.geraws(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
