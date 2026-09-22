class MyCircularDeque {
    int[] q;
    int capacity;
    int front;
    int rear;
    int size; 

    public MyCircularDeque(int k) {
        this.capacity = k;
        front = 0;
        rear = 0;
        size = 0;
        this.q = new int[capacity];
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        front = (front - 1 + capacity) % capacity;
        q[front] = value;
        size++;

        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        q[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;

        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return q[front];
    }
    
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return q[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}