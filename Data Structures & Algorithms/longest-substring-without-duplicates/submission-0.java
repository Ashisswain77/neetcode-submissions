class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();

        int n = s.length();
        int l = 0;
        int maxlen = 0;

        for(int r=0;r<n;r++){
            char curr = s.charAt(r);

            if(seen.containsKey(curr)){
                l = Math.max(l, seen.get(curr)+1);
            }
            seen.put(curr,r);
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}
