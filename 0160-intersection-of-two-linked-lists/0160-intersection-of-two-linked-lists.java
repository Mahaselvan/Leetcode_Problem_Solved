/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int lenA=0;
        int lenB=0;
        while(temp1!=null){
            lenA++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            lenB++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(lenA>lenB){
            int steps=lenA-lenB;
            for(int i=0;i<steps;i++){
                temp1=temp1.next;
            }
        }
        else{
        int steps = lenB-lenA;
        for(int i=0;i<steps;i++){
            temp2=temp2.next;
        }
        }
     while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;    
        
      }
      return temp1;
    }
}