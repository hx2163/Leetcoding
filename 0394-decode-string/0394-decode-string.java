class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        String res = "";
        int idx = 0;

        while(idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int count = 0;
                while(Character.isDigit(s.charAt(idx))){
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }else if (s.charAt(idx) == '['){
                resStack.push(res);
                res = "";
                idx++;

            }else if (s.charAt(idx) == ']'){
                StringBuilder temp = new StringBuilder(resStack.pop());
                int count = countStack.pop();
                for(int i = 0; i < count; i++){
                    temp = temp.append(res);
                }
                res = temp.toString();
                idx++;

            }else{
                res += s.charAt(idx);
                idx++;
            }
        }
        return res;
    }
} 

