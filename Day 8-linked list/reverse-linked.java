//1.Iterative

public ListNode reverseList(ListNode head) {
    ListNode prev = null, next = null, cur = head;
    
    while(cur!=null) {
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }
    return prev;

    //2.Recursive

    public ListNode reverseList(ListNode head) {
        return reverseLL(null, head);
    }
    
    ListNode reverseLL(ListNode prev, ListNode head){
        // base case or termination condition - which is already solved.
        if(head == null)
            return prev;
        
        // solve single pattern - in this case, revert the 'next' pointer to prev node.
        ListNode next = head.next;
        head.next = prev;
        
        return reverseLL(head, next);
    }