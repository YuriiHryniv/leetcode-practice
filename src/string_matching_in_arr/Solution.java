package string_matching_in_arr;

import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (words[j].contains(words[i])) {
                    res.add(words[i]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}