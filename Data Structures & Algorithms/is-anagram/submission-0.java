class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toLowerCase().toCharArray();
        char[] tChars = t.toLowerCase().toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        boolean anagram = false;
        if(Arrays.equals(sChars, tChars)){
            anagram = true;
        }
        return anagram;
    }
}
