package com.xd.github.algo.reverse;

import java.util.List;

public class Reverser {

     public <T> List<T> reverse(List<T> list) {

          if (list == null) {
               throw new IllegalArgumentException("null list");
          } else if (list.isEmpty()) {
               return list;
          }

          int beginIndex = 0;
          int endIndex = list.size() - 1;

          while (beginIndex < endIndex) {

               // swap
               T beginValue = list.get(beginIndex);
               T endValue = list.get(endIndex);
               list.set(beginIndex, endValue);
               list.set(endIndex, beginValue);

               beginIndex++;
               endIndex--;
          }

          return list;
     }
}