class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
           if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int A =st.peek();
                st.pop();
                int B= st.peek();
                st.pop();
                switch(ch){
                    case "+":
                        st.push(B+A);
                        break;
                   case "-":
                       st.push(B-A);
                       break;
                   case "*":
                       st.push(B*A);
                       break;
                  case "/":
                      st.push(B/A);
                      break;
                  default:
                  return -1;
                }
            }
            else
            st.push(Integer.parseInt(ch));
        }
        return st.peek();
    }
}