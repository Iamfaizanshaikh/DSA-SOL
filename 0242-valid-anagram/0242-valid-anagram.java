class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            System.out.println("Strings are not Anagram");
            return false;
        }

        char[] chararray1 = s.toCharArray();
        char[] chararray2 = t.toCharArray();

        Arrays.sort(chararray1);
        Arrays.sort(chararray2);

        return Arrays.equals(chararray1, chararray2);




        
    }
}