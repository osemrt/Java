package com.soc2;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AdvServer {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Server is connected...");
		ServerSocket ss = new ServerSocket(3526);
		System.out.println("Client is waiting for connection...");
		Socket s = ss.accept();
		System.out.println("Client is connected...");
		/////////////////////////////////////////////////////////////
		
		InputStream is = s.getInputStream();
		InputStreamReader isw = new InputStreamReader(is);		
		
		BufferedReader br = new BufferedReader(isw);
		String str = br.readLine();
		
		System.out.println(str);		
		
		//////////////////////////////////////////////////////////////
		
		isw = new InputStreamReader(System.in);
		br = new BufferedReader(isw);
		str = br.readLine();
		
		System.out.println(str);
		
		////////////////////////////////////////////////////////////////
		
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(str);
		
		
	}

}
