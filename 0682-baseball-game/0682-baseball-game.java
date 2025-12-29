class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> stack = new Stack<>();
         for(String op: operations){
            if(op.equals("+")){
                int last = stack.pop();
                int lasti = stack.peek();
                stack.push(last);
                stack.push(last+lasti);
            }
            else if (op.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
            }
         }
         int sum=0;
         for(int no:stack){
            sum+=no;
         }
         return sum;
    }
}