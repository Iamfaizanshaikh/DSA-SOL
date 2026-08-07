class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int j=numbers.length-1;
        int[] num= new int[2];
        int sum;

        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum== target){
                num[0]=i+1;
                num[1]=j+1;
                break;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }

        return num;
        
    }
}