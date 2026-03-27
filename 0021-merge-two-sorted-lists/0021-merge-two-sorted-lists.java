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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp1= list1;
        ListNode temp2=list2;
  
        while(temp2!=null&&temp1!=null){
            if(temp2.val>=temp1.val){
                ListNode NewNode= new ListNode(temp1.val);
                temp.next=NewNode;
                temp=NewNode;
                temp1=temp1.next;
            }else{
            ListNode NewNode = new ListNode(temp2.val);
            temp.next=NewNode;
            temp=NewNode;
            temp2=temp2.next;
        }}
       if(temp1==null){
        temp.next=temp2;
       }
       else{
        temp.next=temp1;
       }
    
    return dummy.next;
}}