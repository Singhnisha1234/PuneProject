package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinValue {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,3,6,7,8,9,10);
		
		int i =list.stream().min(Integer::compare).get();
		System.out.println(i);
	}
}
