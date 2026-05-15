//merge two sort linked list
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
    this.val=val;
    this.next=null;
    }
}
class Merge {
    public static  ListNode mergeLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
         while (list1 != null && list2 != null) {
            
            if (list1.val <= list2.val) {
                temp.next = list1;
          list1 = list1.next;
            } else{
                temp.next=list2;
                list2=list2.next;

            }  temp = temp.next;
        

        if (list1 != null) {
            temp.next = list1;
        }
        
        
        if (list2 != null) {
            temp.next = list2;
        }

    }
        return dummy.next;

     }
     public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val+ " ");
            head=head.next;
        }
    }
     public static void main(String[] args){
        ListNode list1=new ListNode(1);
        list1.next= new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2= new ListNode(1);
        list2.next=new ListNode(3);
        list2.next=new ListNode(4);

        ListNode result= mergeLists(list1, list2);
        System.out.println("Merge Linked List are: ");
        printList(result);

     }
}
