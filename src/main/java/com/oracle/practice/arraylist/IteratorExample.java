package com.oracle.practice.arraylist;

import java.util.*;

public class IteratorExample {
        public static void main(String[] args) {
                ArrayList<Integer> array = new ArrayList<>();
                for (int loop = 0; loop < 10; loop++) {
                        Random random = new Random();
                        array.add(random.nextInt(100));
                }

                //using For-Loop => remove operation may result in NULL pointer exception
/*                for(int loop=0; loop<10; loop++){
                        System.out.print(  array.get(loop) +" ");
                        //ArrayBoundException..
                        array.remove(array.get(loop));
                }*/

                //It will result in concurrent Modification Exception
              /*  for(Integer integer: array){
                        System.out.print(  integer +" ");
                        //ArrayBoundException..
                        array.remove(2);
                }*/

                //Using Iterators.
                Iterator<Integer> iterator = array.iterator();
                for (; iterator.hasNext(); ) {
                        System.out.println(iterator.next());
                        iterator.remove();
                }

                //NO ERROR..>>
                System.out.println(array);

                array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100));
                System.out.println(array);

                for (ListIterator listIterator = array.listIterator(5); listIterator.hasPrevious(); ) {
                        System.out.print(" " + listIterator.previous());
                        listIterator.remove();          //call it only once per iteration remove() and remove() will cause exception
                }


        }
}
