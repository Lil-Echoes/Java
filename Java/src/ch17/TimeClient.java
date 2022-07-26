package ch17;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip를 입력하세요");
		String ip = sc.nextLine();
		Socket client = new Socket(ip, 7000);			// 서버와 연결
		InputStream is = client.getInputStream();		// 서버에서 보낸 데이터 읽을 준비
		ObjectInputStream ois = new ObjectInputStream(is);	// 직렬화 된 데이터 읽을 준ㅂㅣ
		GregorianCalendar gc = (GregorianCalendar) ois.readObject();
		System.out.printf("현재 시간 : %TF %TT", gc, gc);
		
		sc.close();
		is.close();
		ois.close();
		client.close();
	}

}
