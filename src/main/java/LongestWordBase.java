public class LongestWordBase {

    public   String findLongestWord(String str) {
        String[] stringSplit = str.split(" ");
        int longestWord = 0;
        String result = "";
        for (String s : stringSplit) {
            if (s.length() > longestWord) {
                longestWord = s.length();
                result = s;
            }
        }
        return "The longest word is: " + result + " and its length is: " + longestWord;
    }
}
