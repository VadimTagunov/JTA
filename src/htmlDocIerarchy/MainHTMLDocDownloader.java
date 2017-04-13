package htmlDocIerarchy;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

public class MainHTMLDocDownloader {
	
	public String webAddress;
	public String regEx;
	
	public MainHTMLDocDownloader() {
		System.out.println("At least you have to enter your regEx! Please call constructor with argument \'String regEx\'");
		Scanner sc = new Scanner(System.in);
		regEx = sc.nextLine();
		sc.close();
	}
	
}
