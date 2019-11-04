package com.biz.network.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 192.168.123.36
public class ClientV1 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Scanner scan = new Scanner(System.in);
		
		String serverIP = "192.168.123.45";
		int port = 8085;
		
		Socket sendSocket = new Socket(); // ,port);
		
		System.out.println("Client Start!");
		
		// sendSocket.connect(new InetSocketAddress(8085));
		
		while(true) {
			
			System.out.print(">> ");
			String strSend = scan.nextLine();
			
			// 키보드로 입력한 문자열을 UTF-8로 인코딩 한 후, byte배열로 변환
			// Socket을 통해서 문자열을 전송하기 위한 준비
			byte[] msg = strSend.getBytes("UTF-8");
			OutputStream os = sendSocket.getOutputStream();
			os.write(msg);
			
			
			
		}
		
		
		
		
		
		
	}

}
