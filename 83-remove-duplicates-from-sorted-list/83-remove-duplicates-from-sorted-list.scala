/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        if (head == null) return head
        var p = head

        while (p != null && p.next != null) {
            if (p.x == p.next.x) {
                p.next = p.next.next

            } else {
               p = p.next 
            }
            
        }
   
        head
    }
}