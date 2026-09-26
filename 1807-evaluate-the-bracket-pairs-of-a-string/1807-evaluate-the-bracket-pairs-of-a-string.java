class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>(knowledge.size());
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }

        StringBuilder result = new StringBuilder();

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '(') {
                int index=s.indexOf(')',right+1);
                String key=s.substring(right+1,index);

                result.append(map.getOrDefault(key,"?"));

                right=index;
                

            }
            else {
                result.append(s.charAt(right));

            }

        }

        return result.toString();
    }

}
