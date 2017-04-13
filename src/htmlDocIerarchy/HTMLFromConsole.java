package htmlDocIerarchy;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

public class HTMLFromConsole extends MainHTMLDocDownloader {
	
	private String consoleInput;
	
	public HTMLFromConsole() {
		super();
		System.out.println("Also, be so kind to enter your text:");
		Scanner sc = new Scanner(System.in);
		consoleInput = sc.nextLine();
		sc.close();
	}
	
	 public void findURL() {
		 	
		 	consoleInput = consoleInput.toLowerCase();
         	String[] words = consoleInput.split(" ");
		 
         	for (int i = 0; i < words.length; i++) {
            	System.out.println(words[i]);
            }
         	
         	for (int i = 0; i < words.length; i++){
                if (words[i].equals("url")) {
                	
                	Pattern p = Pattern.compile(regEx);
       	         	Matcher m = p.matcher(words[i+1]);
                	if (m.find()) {
                		webAddress = words[i+1];
                	}
                }
            }
         	
         	System.out.println(webAddress);
	 }
	 
	 public void connect() throws IOException {
			try {
				URL site = new URL(webAddress);
				URLConnection urlConnection = site.openConnection();
	            urlConnection.connect();
	            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	            String inputStr;
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Almost forgot! Please enter your write file's local address: ");
	            String filenameToWrite = sc.nextLine();
	            sc.close();
	            FileWriter fw = new FileWriter(filenameToWrite);
	            BufferedWriter bw = new BufferedWriter(fw);

	            while ((inputStr = br.readLine()) != null){
	                bw.write(inputStr);
	            }
	            
	            bw.close();
	            
	            System.out.println("If i'm not mistaking, it works. Check your write file!");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

}
