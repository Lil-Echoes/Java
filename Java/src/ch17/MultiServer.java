package ch17;

import java.io.*;
import java.net.*;

public class MultiServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(9001);
			while(true) {
				Socket client = ss.accept();
				Thread th = new PerClientThread(client);
				th.start();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
			ss.close();
	}
}
