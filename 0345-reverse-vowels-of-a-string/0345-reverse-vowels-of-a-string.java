class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        if(s == null) return null;
        
        int i = 0;
        int j = s.length()-1;
        char[] result = new char[s.length()];
        
        while(i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                result[i] = ci;
                i++;
            }else if(!vowels.contains(cj)){
                result[j] = cj;
                j--;
            }else{
                result[i] = cj;
                i++;
                result[j] = ci;
                j--;
            }
        }
        return new String(result);
    }
}