# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        n1 = self.findNumber(l1)
        n2 = self.findNumber(l2)

        result = n1 + n2
        if (result == 0):
            return ListNode()
            
        head = ListNode()
        node = head
        
        while result > 0:
            node.next = ListNode(result % 10)
            result //= 10
            node = node.next

        return head.next
    def findNumber(self, l):
        n = 0
        power = 0
        while (l != None):
            n += l.val * (10**power)
            power += 1
            l = l.next
        return n
        