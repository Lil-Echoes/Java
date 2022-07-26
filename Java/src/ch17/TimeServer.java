package ch17;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.GregorianCalendar;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		System.out.println("접속 대기중 ...");
		try {
			while(true) {
				Socket client = ss.accept();
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new GregorianCalendar());	// 오늘 날짜를 client에 전송 직열화해서
				oos.flush();	// OutputStream의 데이터를 완전히 보내서 비운다
				oos.close();
				os.close();
				client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}

}
