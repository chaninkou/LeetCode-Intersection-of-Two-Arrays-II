package intersectionArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums1 = {5,2,3,6};
		int[] nums2 = {2,3};
		
		System.out.println("Input1: " + Arrays.toString(nums1));
		System.out.println("Input2: " + Arrays.toString(nums2));
		
		FindIntersectionOfBothArrayList solution = new 	FindIntersectionOfBothArrayList();
		
		System.out.println("Solution: " + Arrays.toString(solution.intersect(nums1, nums2)));
	}
}	
