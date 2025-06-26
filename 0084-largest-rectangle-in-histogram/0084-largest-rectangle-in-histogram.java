class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxArea=arr[0];
		int pse[]=new int[arr.length];
		int nse[]=new int[arr.length];
		previousSmallerElement(arr,pse);
		nextSmallerElement(arr,nse);
		
		for(int i=0;i<arr.length;i++) {
			int area=arr[i]*(nse[i]-pse[i]-1);
			maxArea=Math.max(maxArea, area);
		}
		return maxArea;
    }
    private void nextSmallerElement(int[] arr, int[] nse) {
		    int n = arr.length;
		    Stack<Integer> stack = new Stack<>();
		    
		    for (int i = n - 1; i >= 0; i--) {
		        while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
		            stack.pop();
		        }

		        // Fix here:
		        if (stack.isEmpty()) {
		            nse[i] = n;  // means no smaller element to the right
		        } else {
		            nse[i] = stack.peek();
		        }

		        stack.push(i);
		    }
		}
    private void previousSmallerElement(int[] arr, int[] pse) {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < arr.length; i++) {
	            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
	                stack.pop();
	            }

	            if (stack.isEmpty()) {
	                pse[i] = -1;
	            } else {
	                pse[i] = stack.peek();
	            }

	            stack.push(i);
	        }
	    }
}