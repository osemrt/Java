package com.soc1;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocClient {
	
	public static void main(String[] args) throws Exception {
		
		String address = "localhost";
		int port = 9454;
		
		Socket s = new Socket(address, port);
		
		
		OutputStream s_os = s.getOutputStream();
		OutputStreamWriter os = new OutputStreamWriter(s_os);
		os.write("Osemrt");
		
		os.flush();
		os.close();
		
		
	}
}
