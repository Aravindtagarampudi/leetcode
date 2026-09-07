import java.util.ArrayDeque;

class MinStack {
    ArrayDeque<Integer> st;
    ArrayDeque<Integer> mnSt;

    public MinStack() {
        this.st = new ArrayDeque<>();
        this.mnSt = new ArrayDeque<>();
    }

    public void push(int value) {
        st.push(value);

        if (mnSt.isEmpty()) {
            mnSt.push(value);
        } else {
            mnSt.push(Math.min(value, mnSt.peek()));
        }
    }

    public void pop() {
        st.pop();
        mnSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mnSt.peek();
    }
}