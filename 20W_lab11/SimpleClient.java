import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class SimpleClient {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		try {
		Socket client = new Socket("Localhost", 1254);

		DataInputStream is = new DataInputStream(client.getInputStream());
		DataOutputStream os = new DataOutputStream(client.getOutputStream());

		//Receive data from the server: 
		@SuppressWarnings("deprecation")
		String line = is.readLine();
		//Send data to the server: 
		// os.writeBytes(“Hello\n”);

		client.close();
		}

		catch (IOException e) {
		System.out.println("" + e);

		}

		}

		}




