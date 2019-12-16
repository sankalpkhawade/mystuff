//import java.util.*;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner=new Scanner(System.in);
//		int number=scanner.nextInt();
//		for(int i=1;i<=10;i++){
//			System.out.println(number+" * "+i+" = "+number*i);
//		}
//		scanner.close();
//	}
//
//}

//-----------------pattern------------------------

//import java.util.*;
//
//public class Main{
//	
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(i+" ");
//			}
//			System.out.print("\n");
//		}
//		sc.close();
//	}
//}

//------------------------Biggest Number------------------------

//import java.util.*;
//
//public class Main {
//
//	public static void main(String args[]) {
//
//		int i, n, max;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		int a[] = new int[n];
//		for (i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}
//		max = a[0];
//		for (i = 0; i < n; i++) {
//			if (max < a[i]) {
//				max = a[i];
//			}
//		}
//
//		System.out.println("Biggest Number is : " + max);
//	}
//}

//------------------------ Anagrams ------------------------

//import java.io.*;
//import java.util.*;
//
//class Main {
//	static int No_OF_CHARS = 256;
//
//	static boolean areAnagram(char str1[], char str2[]) {
//		int count1[] = new int[No_OF_CHARS];
//		Arrays.fill(count1, 0);
//		int count2[] = new int[No_OF_CHARS];
//		Arrays.fill(count2, 0);
//		int i;
//		
//		for (i = 0; i < str1.length && i < str2.length; i++) {
//			count1[str1[i]]++;
//			count2[str1[i]]++;
//		}
//
//		if (str1.length != str2.length)
//			return false;
//
//		for (i = 0; i < No_OF_CHARS; i++)
//			if (count1[i] != count2[i])
//				return false;
//		return true;
//	}
//
//	public static void main(String args[]) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the First String :");
//		char str1[] = sc.next().toCharArray();
//		System.out.println("Enter the Second String :");
//		char str2[] = sc.next().toCharArray();
//
//		if (areAnagram(str1, str2))
//			System.out.println("The Two Strings are anagram of each other");
//		else
//			System.out.println("The Two Strings are not anagram of each other");
//		sc.close();
//	}
//}
