package com.kh.arrayPractice2.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample2 {
	Scanner sc = new Scanner(System.in);
	public void sample1() {

		int[] arr = new int[10];


		int value=1;
		String str="";
		for(int i=0; i<arr.length; i++) {
			arr[i]=value++;


		}
		for(int i=0; i<arr.length; i++) {
			if(i!=arr.length-1) {
				str += arr[i] + ", ";
			}else {
				str += arr[i];
			}
		}
		System.out.println(str);
	}
	public void sample2() {
		String[] str = {"딸기", "바나나", "복숭아", "키위", "사과"};

		System.out.println(str[1]);


	}

	public void sample3() {


		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		System.out.print("문자를 입력하시오 : ");
		char ch = sc.next().charAt(0);

		char[] strr = new char[str.length()];
		int count=0;
		for(int i=0; i<str.length(); i++) {
			strr[i]=str.charAt(i);
			if(strr[i] == ch){
				count++;
			}
		}
		System.out.println("일치하는 값의 수는 : " + count);

	}

	public void sample4() {
		System.out.print("주민등록번호를 입력하시오 : ");
		String num = sc.nextLine();

		String[] arr  = new String[14];
		String[] arr2 = new String[14];

		arr[6] = "-";		
		for(int i=0; i<num.length()-7; i++) {

			arr[i]= num.substring(i, i+1);


		}	

		for(int j=7; j<num.length()+1; j++ ) {
			arr[j]= num.substring(j-1, j);
		}	

		String str = "";

		arr2 = arr.clone();

		for(int i=8; i <arr2.length;  i++) {
			arr2[i]="*";
		}

		for(int i=0; i<arr.length; i++) {
			if(i != arr.length -1) {
				str += arr[i];
			}else {
				str += arr[i];
			}
		}
		System.out.println("주민등록번호 : " + str);
		str= "";


		for(int i=0; i<arr2.length; i++) {
			if(i != arr2.length -1) {
				str += arr2[i];
			}else {
				str += arr2[i];
			}
		}
		System.out.println("주민등록번호 : " + str);
	}

	public void sample5() {
		System.out.print("홀수인 양의 정수를 입력하시오 : ");
		int num =sc.nextInt();

		int[] arr = new int[num];

		int value=1;
		for(int i=0; i<arr.length/2+1; i++) {
			arr[i] += value++;
		}

		value =num/2;
		for(int i = num/2+1; i<arr.length; i++) {
			arr[i] += value--;

		}

		String str= "";
		for(int i=0; i<arr.length; i++) {
			if(i != arr.length -1) {
				str += arr[i]+ ", ";
			}else {
				str += arr[i];
			}
		}
		System.out.println("값은 : " + str);
	}


	public void lotto() {
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {		
			arr[i] += new Random().nextInt(45)+1;
			for(int j=1; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}

		for(int i=1; i<arr.length; i++) {	
			for(int j=0; j< i; j++) {	

				if(arr[i] < arr[j]) { 
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		String str="";
		for(int i=0; i<arr.length; i++) {
			if(i != arr.length -1) {
				str += arr[i]+ ", ";
			}else {
				str += arr[i];
			}
		}
		System.out.println("lotto : " + str);

	}
}





