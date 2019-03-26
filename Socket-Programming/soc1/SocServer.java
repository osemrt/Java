package com.soc1;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Server is started...");
		ServerSocket ss = new ServerSocket(9454);
		System.out.println("Client is waiting for a client...");
		Socket s = ss.accept();
		System.out.println("Client is connected");
		
		
		InputStreamReader is = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		
		System.out.println(str);
		
		
	}

}
