package com.xd.github.algo.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
     private static final Reverser reverser = new Reverser();
     
     @Test
     public void testPass() {
          List<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 4, 8));
          List<Integer> output = reverser.reverse(input);
          List<Integer> expected = new ArrayList<>(Arrays.asList(8, 4, 7, 3, 5, 1));
          Assert.assertEquals(expected, output);
     }
     
     @Test
     public void testPass2() {
          List<Integer> input = new ArrayList<>(Arrays.asList(1, -15, 3, 7, 4, 8));
          List<Integer> output = reverser.reverse(input);
          List<Integer> expected = new ArrayList<>(Arrays.asList(8, 4, 7, 3, -15, 1));
          Assert.assertEquals(expected, output);
     }
}
