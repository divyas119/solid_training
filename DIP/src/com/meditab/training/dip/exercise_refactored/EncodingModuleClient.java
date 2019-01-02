package exercise_refactored;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class EncodingModuleClient implements IEncoding {

	public static void main(String[] args) throws IOException
    {
		EncodingModuleClient EMC=new EncodingModuleClient();
		EMC.encodeWithFiles();
		EMC.encodeBasedOnNetworkAndDatabase();
    }

	public void encodeWithFiles(){

		BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                new FileReader("DIP/src/com/meditab/training/dip/exercise/beforeEncryption.txt"));
            writer = new BufferedWriter(
                new FileWriter("DIP/src/com/meditab/training/dip/exercise/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (writer != null) {
                try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (reader != null) {
                try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
		
	}

	public void encodeBasedOnNetworkAndDatabase() {

		URL url = null;
        try {
			url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        InputStream in = null;
        try {
			in = url.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c = 0;
        try {
			c = reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (c != -1) {
            inputString1.append((char) c);
            try {
				c = reader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
		
	}

