package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDomainByRegEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the web Addressw");
		String webAddress = sc.next();
		String RegExPattern = "(?:\\.com|\\.edu|\\.in|\\.gov)";
		Pattern pattern = Pattern.compile(RegExPattern);
		Matcher matcher = pattern.matcher(webAddress);
		if (matcher.find()) {
			String domain = matcher.group(0);
//			System.err.println(domain);
			findDomain(domain, webAddress);
		} else
			System.out.println("You entered invalid webaddress");
		sc.close();
	}

	private static void findDomain(String domain, String webAddress) {

		switch (domain) {
		case ".com":
			System.err.print(webAddress);
			System.out.print(" is a Commercial website");

			break;
		case ".in":
			System.err.print(webAddress);
			System.out.print(" is a India based website");

			break;
		case ".gov":
			System.err.print(webAddress);
			System.out.print(" is a Government website");

			break;
		case ".edu":
			System.err.print(webAddress);
			System.out.print(" is a Education website");

			break;

		default:
			break;
		}
	}

}
