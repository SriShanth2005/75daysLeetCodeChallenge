class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String st="";
        st=st+arr[arr.length-1];
        return st.length();
    }
}