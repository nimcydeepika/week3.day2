package week1.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to chennai";
		char search='w';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==search) {
				count++;
			}
			System.out.println("total occurance 'w' in the string is="+count);
		}

	}

}
