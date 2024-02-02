package Package_Examples;

public class Secondlargest {
	    public static void main(String[] args) {
	        int[] array = {5, 12, 9, 34, 18, 7, 23};

	        int secondLargest = findSecondLargest(array);

	        System.out.println("The second largest element in the array is: " + secondLargest);
	    }

	    // Function to find the second largest element in an array
	    private static int findSecondLargest(int[] arr) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                // If current element is greater than the current largest
	                // Move the current largest to second largest, and update largest
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                // If current element is greater than the current second largest
	                // and not equal to the largest, update second largest
	                secondLargest = arr[i];
	            }
	        }

	        return secondLargest;
	    }
	}


