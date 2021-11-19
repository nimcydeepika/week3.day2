package week3.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="we learn java basics as part of java sessions in java week1";
		char[]charArray=str.toCharArray();
		Set<Character>ch=new LinkedHashSet<Character>();
		for(Character eachchar:charArray) {
			ch.add(eachchar);
		}
		System.out.println(charArray);
		int [] num={2,4,5,6,7,8,8,7,5,4};
		Set<Integer>uniquenum=new TreeSet<Integer>();
		for (int i=0;i<charArray.length;i++) {
			uniquenum.add (num[i]);
		}
				if(uniquenum.add(charArray[i])) {
					uniquenum.remove(charArray[i]);
					System.out.println((charArray[i]));
					
				}

	}

}
