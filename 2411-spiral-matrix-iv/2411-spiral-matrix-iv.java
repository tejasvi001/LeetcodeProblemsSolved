/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]=new int[m][n];
         int startRow=0,startCol=0, endRow=arr.length-1,endCol=arr[0].length-1;
		while(startRow<=endRow&&startCol<=endCol) {
			for(int i=startCol;i<=endCol;i++) {
                if(head!=null){
                    arr[startRow][i]=head.val;
                    head=head.next;
                }else{
                    arr[startRow][i]=-1;
                }
				
			}
			for(int i=startRow+1;i<=endRow;i++) {
                 if(head!=null){
				    arr[i][endCol]=head.val;
                     head=head.next;
                 }else{
                    arr[i][endCol]=-1;
                 }
			}
            if(startRow<endRow)
			    for(int i=endCol-1;i>=startCol;i--) {
                     if(head!=null){
				         arr[endRow][i]=head.val;
                        head=head.next;
                     }else{
                        arr[endRow][i]=-1;
                     }
			    }
            if(startCol<endCol)

			    for(int i=endRow-1;i>startRow;i--) {
                     if(head!=null){
				        arr[i][startRow]=head.val;
                         head=head.next;
                     }
                     else{
                        arr[i][startRow]=-1;
                     }
			    }
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
        return arr;
    }
}