import com.sun.org.apache.xpath.internal.objects.XNull;

public class StringCharacter {

    public  String makeData(String myString) {
       String str=null;
      if(myString !=null){
          int len = myString.length();
           str = myString.substring(len - 3, len);
      }
        return str;
    }
}
