class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n= arr.length;
         long sum = 0;
        int mod = 1000000007;
        int[] left= new int[n];
        int[] right= new int[n];

        Stack<Integer> stack = new  Stack<>();

        for(int i=0; i<arr.length; i++){

            while(!stack.isEmpty()  && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=stack.peek();
            }
            stack.push(i);
            
        }
        stack.clear();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i]=n;

            }else{
                right[i]= stack.peek();
            }

            stack.push(i);
        }
        for(int i=0; i<n; i++){
            long l= i-left[i];
            long r= right[i]-i;

            long contribution= (l*r)% mod;

            contribution= (contribution * arr[i])%mod;

            sum= (sum+contribution) %mod;
        }

        return (int)sum;
        
    }
}