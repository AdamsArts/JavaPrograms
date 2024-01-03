package String;

import java.util.Scanner;

public class FindWebsiteType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the website URL");
		String URL = sc.next();
		String domain = findDomain(URL);

//		System.out.println(domain);

		switch (domain) {
		case ".com":
			System.err.print(URL);
			System.out.print(" is a commercial website");

			break;
		case ".in":
			System.err.print(URL);
			System.out.print(" is a organization which is based in India");

			break;
		case ".edu":
			System.err.print(URL);
			System.out.print(" is a education website");
			break;
		case ".gov":
			System.err.print(URL);
			System.out.print(" is a Government website");

			break;

		default:
			System.err.print(URL);
			System.out.print(" Wrong domain name in given URL");
			break;
		}

		sc.close();

	}

	private static String findDomain(String uRL) {

		String sub = uRL.substring(uRL.length() - 5);
		int indexNo = sub.indexOf('.');

		String domain = sub.substring(indexNo);

		return domain;
	}

}
