class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i =0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        else{
            return false;
        }
        
    }
}