// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    
    if (l == null) {
        return l;
    }
    
    ListNode<Integer> current = l.next;
    ListNode<Integer> previous = l;
    
    while (current != null) {
        if (current.value == k) {
            previous.next = current.next;
        } else {
            previous = current;
        }
        
        current = current.next;
    }
    
    if (l.value == k) {
        l = l.next;
    }
    
    return l;
}