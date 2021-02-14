import java.util.*;

/*
    Reverse Linked List Question
    ----------------------------
*/


/*
    Only Solution - Basic solution

    - O(n)) time | O(1) space

    - O(n) time because the number of
      nodes in the linked list is n.

    - O(1) space because no additional
      memory is required to reverse the
      linked list.
 */




class Program {

    public static linkedList reverseLinkedList(linkedList head) {
        linkedList prevNode = null;
        linkedList currNode = head;
        while (currNode != null) {
            linkedList nxtNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nxtNode;
        }
        return preNode;
    }

    static class linkedList {
        int val;
        linkedList next = null;

        public linkedList(int val) {
            this.value = value;
        }
    }
}