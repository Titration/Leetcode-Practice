class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {

    ListNode head;
    int length;

    public MyLinkedList() {
        head = new ListNode();
        length = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode new_node = new ListNode(val);
        new_node.next = head.next;
        head.next = new_node;
        length++;
    }
    
    public void addAtTail(int val) {
        ListNode new_node = new ListNode(val);
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }
        ListNode new_node = new ListNode(val);
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
        length++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */