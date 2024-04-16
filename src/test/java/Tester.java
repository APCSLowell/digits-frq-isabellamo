

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      Digits test1 = new Digits(15704);
      String result = new String("[1, 5, 7, 0, 4]");
      assertEquals(result,test1.toString());
      Digits test2 = new Digits(0);
      result = new String("[0]");
      assertEquals(result,test2.toString());
   }
   @Test
   public void partB(){
      Digits test1 = new Digits(7);
      boolean result = test1.isStrictlyIncreasing();
      assertEquals(result,true);
      Digits test2 = new Digits(1356);
      result = test2.isStrictlyIncreasing();
      assertEquals(result,true);
      Digits test3 = new Digits(1336);
      result = test3.isStrictlyIncreasing();
      assertEquals(result,false);
      Digits test4 = new Digits(1536);
      result = test4.isStrictlyIncreasing();
      assertEquals(result,false);
      Digits test5 = new Digits(65310);
      result = test5.isStrictlyIncreasing();
      assertEquals(result,false);
   }


}
