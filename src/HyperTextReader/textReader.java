package HyperTextReader;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

public class textReader {
	
	private static String FILENAME = null;
	private String textFromFile = null;
//	private String textFromURL = null;
	private String regex = "[U|uR|rL|l]";
	
	public void readFromFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your read file's address:");
		FILENAME = sc.nextLine(); 
		System.out.println("Thank You! We'll get back to you soon...");
		sc.close();
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			while ((textFromFile = br.readLine()) != null) {
				textFromFile = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("OK, here we are! I've reached your read file and gave it's value to my String textFromFile.");
	}
	
	public void findTheUrl() throws IOException {
		 Pattern p = Pattern.compile(regex);
	     Matcher m = p.matcher(textFromFile);
	     System.out.println("Now we'll be hunting URL with your RegEx...");
	     if (m.find()) {
	    	 System.out.println("Yes, we've found it! Now I'll rewrite your first RegEx to the pattern of URL address...");
	    	 String newRegex = "http*[a-z]:\\/\\/[A-Za-z]+.[A-Za-z]+ ";
	    	 Pattern newP = Pattern.compile(newRegex);
	         Matcher newM = newP.matcher(textFromFile);
	         System.out.println("Now we'll be searching for the URL address... Hold on a second...");
	         if (newM.find()) {
	        	 System.out.println("Yuppie, found it. Trying to copy website's text to your doc...");
	        	 String webAddress = newM.group();
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
	     else {
	    	 System.out.println("There's no String as your RegEx, please check.");
	     }
	}
}


// http*[a-z]:\/\/[A-Za-z]+.[A-Za-z]+ 