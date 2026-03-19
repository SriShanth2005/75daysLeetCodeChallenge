class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase().trim();
        int i=0;
        String t="";
       for(int k=0;k<st.length();k++){
        char ch=st.charAt(k);
        if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
            t=t+ch;
        }
       }
           int j=t.length()-1;
       while(i<j){
        if(t.charAt(i)!=t.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}