//package lab11;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class SimpleServer {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		try {
		ServerSocket server = new ServerSocket(1254);
		Socket sCli = server.accept();

		DataInputStream is = new DataInputStream(sCli.getInputStream());
		DataOutputStream os = new DataOutputStream(sCli.getOutputStream());

		//Receive data from the server: 
		@SuppressWarnings("deprecation")
		String line = is.readLine();
		//Send data to the server: 
		// os.writeBytes(“Hello\n”);
		server.close();
		}catch (IOException e) {
			System.out.println("" + e);

		}

		}

		}



