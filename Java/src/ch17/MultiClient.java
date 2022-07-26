package ch17;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip ?");
		String ip = sc.nextLine();
		System.out.println("사용할 별명");
		String name = sc.nextLine();
		try {
			Socket client = new Socket(ip, 9001);
			Thread send = new SenderThread(client, name);
			Thread receive = new ReceiverThread(client);
			send.start();
			receive.start();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
