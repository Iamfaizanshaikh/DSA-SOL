class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map= new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> list=knowledge.get(i);
            map.put(list.get(0),list.get(1));
        }


        String ans="";
        int bracket=0;
        int count=0;
        String temp="";
        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);

            if(ch=='('){
                ans+=temp;
                temp="";
                count++;
             

            }else if(Character.isLetter(ch)){
                temp+=ch;
            }else{
                if(map.containsKey(temp)){
                    ans+=map.get(temp);
                }else{
                    ans+="?";
                }
                count--;
                temp="";
            }

            }
            return ans+temp;
        }
        
          
    }
