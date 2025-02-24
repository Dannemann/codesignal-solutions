package codesignal.strings.firstNotRepeatingCharacter;

class Solution2 {

    char firstNotRepeatingCharacter(String s) {
        for (char c : s.toCharArray())
            if (s.indexOf(c) == s.lastIndexOf(c))
                return c;

        return '_';
    }

}
