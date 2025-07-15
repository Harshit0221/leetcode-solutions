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
        ListNode tempa=headA;
        ListNode tempb=headB;

        int lengtha=0;
        while(tempa!=null){
            lengtha++;
            tempa=tempa.next;
        }
        int lengthb=0;
        while(tempb!=null){
            lengthb++;
            tempb=tempb.next;
        }
        tempa=headA;
        tempb=headB;

        if(lengtha>lengthb){
            int steps=lengtha-lengthb;
            for(int i=1;i<=steps;i++){
                tempa=tempa.next;
            }
        }else{
            int steps=lengthb-lengtha;
            for(int i=1;i<=steps;i++){
                tempb=tempb.next;
            }
        }
        while(tempa!=tempb){
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return tempa;

    }
}