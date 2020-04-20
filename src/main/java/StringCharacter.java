public class StringCharacter {

    public  String makeData(String myString) {
        int len = myString.length();
        String str = myString.substring(len - 3, len);
        return str;
    }
}
