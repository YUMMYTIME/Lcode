package lcode;

import java.util.HashMap;

public class validAnagrams {
    public boolean isAnagrams(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            int cnt = 0;
            if(map.containsKey(cur)){
                cnt = map.get(cur);
            }
        map.put( cur,++cnt);
        }

        for(int i = 0; i < t.length(); i++) {
            char cur= t.charAt(i);
            if(!map.containsKey(cur)){
                return false;
            }
            int cnt = map.get(cur) - 1;
            if (cnt == 0){
                map.remove(cur);
            } else {
                map.put(cur, cnt);
            }
        }

        if(map.size() == 0){
            return true;
        }
        return false;
    }
}
