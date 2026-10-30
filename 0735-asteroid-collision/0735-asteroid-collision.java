class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>  stack = new Stack<>();

        for(int num : asteroids){

            boolean alive= true;
            
          
                while(alive && !stack.isEmpty() && stack.peek()>0 && num<0){
                    if(stack.peek()< Math.abs(num)){
                        stack.pop();

                    }   
                    else if(stack.peek()== Math.abs(num)){
                        stack.pop();
                        alive= false;

                    }
                    else{
                        alive = false;

                    }
                               
                               
                }
                if(alive){
                    stack.push(num);
                }
            
        }

        int[] arr= new int[stack.size()];
        for(int i=arr.length-1; i>=0; i--){
            arr[i]= stack.pop();
        }

        return arr;
        
    }
}