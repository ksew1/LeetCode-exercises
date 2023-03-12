# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        

        if list1 == None:
            return list2
        if list2 == None:
            return list1 
        if list2.val < list1.val:
            list1, list2 = list2, list1
        
        head = list1
        while list1 != None:
            if list2 != None:
                if list1.val <= list2.val and (list1.next == None or list2.val <= list1.next.val):
                    node = list2
                    list2 = list2.next
                    node.next = list1.next
                    list1.next = node
            list1 = list1.next
        return head