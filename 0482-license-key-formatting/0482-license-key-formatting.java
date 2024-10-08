class Solution {
    public String licenseKeyFormatting(String S, int k) {
        final String str = S.toUpperCase().replace("-","");
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        
        for(int i=str.length()-1; i>=0; --i){
            sb.append(str.charAt(i));
            count++;
            if(count%k == 0 && i != 0){
                sb.append('-');
            }
        }
        return sb.reverse().toString();
    }
}