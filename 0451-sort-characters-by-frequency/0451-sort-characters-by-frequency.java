class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!map.isEmpty()){
            char maxfreq=' ';
            int max=0;
            for(char key:map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    maxfreq=key;
                }
            }
            for(int i=0;i<max;i++){
                ans.append(maxfreq);
            }
            map.remove(maxfreq);
        }
        return ans.toString();
    }
}