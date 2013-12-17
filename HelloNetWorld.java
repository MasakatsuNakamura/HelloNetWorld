import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloNetWorld {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.sanix.co.jp/index.html");
			HttpURLConnection urlconn;
			try {
				urlconn = (HttpURLConnection)url.openConnection();
				urlconn.connect();
				BufferedInputStream bis = new BufferedInputStream(urlconn.getInputStream());
				int c = -1;
				while((c = bis.read()) != -1){
					System.out.print((char)c);
				}
				bis.close();
				urlconn.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
