package Recursion;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int sumOfDigits = sum(nums, nums.length);
		System.out.println("The sum of the array is "+sumOfDigits);
		int startNum = 5;
		countDown(startNum);		
        String originalString = "hello";
        String reversedString = reverseString(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
	    
	}
	
	private static void countDown(int startNum) {
		//this method takes a number and counts down to 1		
		System.out.println(startNum);
		countDown(startNum-1);
		System.out.println("counting down from "+startNum+" until 1");
	}

	private static int sum(int[] nums, int length) {
		//This method takes the array and calculates the total
		if(length < 0) {
			return 0;
		}
		else {
			return nums[length-1]+sum(nums, length-1);
		}
	
	}
	
    public static String reverseString(String hello) {
    	// Take the first character, reverse the rest, and concatenate
        if (hello.isEmpty()) {
            return hello;
        } else {	            
            return reverseString(hello.substring(1)) + hello.charAt(0);
        }
    }


}
