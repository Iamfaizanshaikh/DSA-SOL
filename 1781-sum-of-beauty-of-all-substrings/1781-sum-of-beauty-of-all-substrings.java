class Solution {
    public int beautySum(String s) {

        int total=0;
        for(int i=0; i<s.length(); i++){
            int[] freq= new int[26];

            for(int j=i; j<s.length(); j++){
                int n=s.charAt(j)-'a';
                freq[n]++;

                int max=0;
                int min=Integer.MAX_VALUE;;
                for(int k=0; k<26; k++){
                    if(freq[k]>max){
                        max=freq[k];
                    }
                    if(freq[k]>0){
                        min= Math.min(min,freq[k]);

                    }
                    
                }
                total+=max-min;

            }
        }

        return total;
        
    }
}