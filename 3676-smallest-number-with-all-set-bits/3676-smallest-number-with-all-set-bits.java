class Solution {
    public int smallestNumber(int n) {

        String str="";
        int count =0;
        while(n>0){
            count++;
            n=n/2;

        }
        int answer = (1 << count) - 1;
        return answer;
        
    }
}