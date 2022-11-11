public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode pointer = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pointer.next = l1;
                pointer = pointer.next;
                l1 = l1.next;
            }
            else {
                pointer.next = l2;
                pointer = pointer.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            pointer.next = l1;
            pointer = pointer.next;
            l1 = l1.next;
        }
        if (l2 != null) {
            pointer.next = l2;
            pointer = pointer.next;
            l2 = l2.next;
        }
        return newHead.next;
    }
