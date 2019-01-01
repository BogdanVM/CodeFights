// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    
    if (l == null || l.next == null || l.next.next == null) {
        return true;
    }
    
    /* Find the middle of the list by traversing it with 2 pointers */
    ListNode<Integer> middle = l;
    ListNode<Integer> temp = l;
    while (temp != null && temp.next != null) {
        temp = temp.next.next;
        middle = middle.next;
    }
    
    /* Now we reverse the elements in the list after the middle one */
    temp = middle;
    ListNode<Integer> next = null;
    ListNode<Integer> prev = null;
    while (temp != null) {
        
        next = temp.next;
        temp.next = prev;
        prev = temp;
        temp = next;
    }
    
    /* Now we iterate through both the sub-lists and see if they match */
    temp = prev;
    while(temp != null) {
        if (temp.value - l.value != 0) {
            return false;
        }
        
        temp = temp.next;
        l = l.next;
    }
    
    return true;
}