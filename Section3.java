package PractiseSel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
		int age = 27;
		String name = "Aishwarya";
		boolean check = true;
		char a = 'c';
		float n = (float) 1.5;
		System.out.println(age);
		System.out.println(name);
		System.out.println(a);
		System.out.println(check);
		System.out.println(n);
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int arr2[] = {2,3,4,5,6};
		System.out.println(arr2[2]);
		System.out.println(arr[0]);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i = 0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		String names[] = {"Aish","Pathak","Riya","Selenium"};
		List<String> nameList = Arrays.asList(names);
		System.out.println(nameList.contains("Selenium"));
//		for(int i =0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		for(String nm: names) {
			System.out.println(nm);
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		ArrayList<String> arrayNew = new ArrayList<String>();
		arrayNew.add("Aishwarya");
		arrayNew.add("Pathak");
		arrayNew.add("Likes");
		arrayNew.add("Sel-Java");
		arrayNew.remove("Likes");
//	System.out.println(arrayNew.get(2));
//	for(int i = 0;i<arrayNew.size();i++) {
//		
//	}
//	if(arrayNew.contains("Selenium")) {
//		System.out.println(true);
//	}
//	else {
//		System.out.println(false);
//	}
	for(String val: arrayNew) {
		System.out.println(val);
	}
	
	String va = new String();
	va="Aish is a good girl";
	String al = "Pathak";
	String arrva[] = va.split(" ");
	for(String ava: arrva) {
		System.out.println(ava);
		
	}
	for(int i =al.length()-1;i>=0;i--){
		System.out.println(al.charAt(i));
	}
	
		
		
	

	}

}
