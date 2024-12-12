# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0,head)
        prev = dummy
        temp = head
        
        while n>0:
            temp = temp.next
            n-=1
        
        
        while temp:
            prev = prev.next
            temp = temp.next
        
        prev.next = prev.next.next
        print(prev)
        print(temp)
        return dummy.next