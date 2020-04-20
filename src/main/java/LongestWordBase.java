public class LongestWordBase {

    public String findLongestWord(String myString) {
        String[] stringSplit = myString.split(" ");
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

