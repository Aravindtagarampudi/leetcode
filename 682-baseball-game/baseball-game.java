class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first + second);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}




