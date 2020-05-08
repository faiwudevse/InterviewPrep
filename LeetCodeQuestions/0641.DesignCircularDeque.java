class MyCircularDeque {

    int size;
    int capacity;
    DoubleListNode head;
    DoubleListNode tail;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        head = new DoubleListNode(-1);
        tail = new DoubleListNode(-1);
        head.next = tail;
        tail.pre = head;
        this.capacity = k;
        this.size = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        DoubleListNode node = new DoubleListNode(value);
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        DoubleListNode node = new DoubleListNode(value);
        node.pre = tail.pre;
        tail.pre.next = node;
        tail.pre = node;
        node.next = tail;
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        head.next.next.pre = head;
        head.next = head.next.next;
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        tail.pre.pre.next = tail;
        tail.pre = tail.pre.pre;
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        return head.next.val;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        return tail.pre.val;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return capacity == size;
    }

    class DoubleListNode {
        DoubleListNode pre;
        DoubleListNode next;
        int val;

        public DoubleListNode(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */