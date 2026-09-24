class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        String str="";

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);   
        }
        while(!map.isEmpty()){
            char maxchar=' ';
            int maxfreq=0;
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue() > maxfreq){
                    maxchar=entry.getKey();
                    maxfreq= entry.getValue();

                }

            }
            for(int i=0; i<maxfreq; i++){
                str+=maxchar;
            }
            map.remove(maxchar);

        }


        return str;
        
    }
}