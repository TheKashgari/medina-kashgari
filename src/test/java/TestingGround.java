import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestingGround {


    @Test
    public void getStringCharacter(){
        StringCharacter testStringChar=new StringCharacter();
        String expected="llo";
        String actual= testStringChar.makeData("Hello");
        System.out.println("The expected chars are: "+actual);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getListOfInteger(){
        ListOfInteger testNumbers=new ListOfInteger();
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(0);
        myNumbers.add(-9);
        myNumbers.add(7);
      System.out.println("The list of non-negative numbers are: "+ testNumbers.numbers(myNumbers));
    }

    @Test
    public void getLongestWord(){
        LongestWordBase getLongest=new LongestWordBase();
        String str= getLongest.findLongestWord("Medina has never been to Mississippi");
        String expected= "The longest word is: Mississippi and its length is: 11";
        System.out.println(str);
        Assert.assertEquals(expected,getLongest.findLongestWord(str));
    }

    @Test
    public void getShortestWord(){
        String shortestWord = "I love Programming";
        List<String> words = Arrays.asList(shortestWord.split(" "));
        String getShortestWord = words.stream().min(
                Comparator.comparing(
                        word -> word.length()))
                .get();
        System.out.println("The shortest word is: " +getShortestWord);
        Assert.assertEquals("I",getShortestWord);
    }
    }

