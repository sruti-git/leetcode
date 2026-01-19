import java.util.*;

class Solution {
    Map<Character, String> map = new HashMap<>();
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;

        map.put('2',"abc"); map.put('3',"def");
        map.put('4',"ghi"); map.put('5',"jkl");
        map.put('6',"mno"); map.put('7',"pqrs");
        map.put('8',"tuv"); map.put('9',"wxyz");

        backtrack("", digits, 0);
        return res;
    }

    private void backtrack(String combination, String digits, int index) {
        if (index == digits.length()) {
            res.add(combination);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            backtrack(combination + c, digits, index + 1);
        }
    }
}
