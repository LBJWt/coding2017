package com.coding.test;

import com.coding.basic.ArrayList;

/**
 * Created by lenovo on 2017/2/24.
 */
public class ArrayListTest {
    public static void main(String args[]){
//        Integer[] a={1,2,3,4,5};
//        Integer[] b=new Integer[5];
//        System.arraycopy(a,2,b,0,3);
//        System.out.println(Arrays.toString(b));

        ArrayList arrayList=new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add(1,"8");
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
    }

//    @Tes
    public void arrayListTest(){

    }
}
