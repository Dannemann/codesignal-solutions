package codesignal.strings.firstNotRepeatingCharacter;

class Solution1 {

    char firstNotRepeatingCharacter(String s) {
        return (char) s.chars().filter(v -> s.indexOf(v) == s.lastIndexOf(v)).findFirst().orElse('_');
    }

}
