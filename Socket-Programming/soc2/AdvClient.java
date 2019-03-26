package com.soc2;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class AdvClient {
	
	public static void main(String[] args) throws Exception {
		
		String ip = "localhost";
		int port = 3526;
		Socket s = new Socket(ip, port);
		
		/////////////////////////
		
		
			System.out.print("Enter a message : ");
			
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(str);
			
			
			osw.close();
			os.close();
			
				
		
		///////////////////////////
			
			
			isr = new InputStreamReader(in)
		
		
		
	
		
		
		
	}

}
