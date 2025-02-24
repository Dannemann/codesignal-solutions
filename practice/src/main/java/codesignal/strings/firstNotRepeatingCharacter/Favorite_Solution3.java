package codesignal.strings.firstNotRepeatingCharacter;

class Favorite_Solution3 {

    char firstNotRepeatingCharacter(String s) {
        int[] counter = new int[26];

        for (char c : s.toCharArray())
            counter[c - 'a']++;

        for (char c : s.toCharArray())
            if (counter[c - 'a'] == 1)
                return c;

        return '_';
    }

}
