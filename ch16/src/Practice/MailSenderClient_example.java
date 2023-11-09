package Practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * <pre>
 * 
 * 생성된 소켓을 이용하여 mailsender 서버로 data를 전송하여 mail을 발송하고, 결과를 받아오는 소켓통신 프로그램 클라이언트를 구현하세요.
 * 서버로 전송할 데이터는 '|'를 구분자로 '받는사람의 메일주소', '메일 제목', '메일 내용'으로 구성.
 *  ex. "메일주소|제목|내용";
 * </pre>
 */
public class MailSenderClient_example
{

	static String message;
	static DataOutputStream out;
	static DataInputStream in;
	
	public static void main(String[] args)
	{
		try
		{
			@SuppressWarnings("resource")
			Socket socket = new Socket("ch16.ml", 8080);
			
			// Code Start..
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			
			message = "sujin0970@naver.com|안녕하세요|안녕하세요 잘지내시죠";
			out.writeUTF(message);
			
			System.out.println(in.readUTF());
			
			in.close();
			out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
