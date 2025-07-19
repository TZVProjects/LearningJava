package org.vm.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTemplateOne {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] nums = Arrays.stream(sc.nextLine().trim().split(",\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
			int target = Integer.parseInt(sc.nextLine());
			System.out.println(binarySearch(nums, target));
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}
	
	public static int binarySearch(int[] nums, int target) {
		if(nums == null || nums.length == 0) return -1;

		int left = 0, right = nums.length - 1;
		  
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target) { 
				return mid; 
			} else if(nums[mid] < target) { 
				left = mid + 1; 
			} else { 
				right = mid - 1; 
			}
		}

		return -1;
	}
}
