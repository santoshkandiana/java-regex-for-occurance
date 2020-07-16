package com.tgt.cep.common.util;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.*;



public class TestClass {
    public static void main(String args[]) throws Exception {
        //1st way
        String firstName = "SantoshOneTwoThree".toLowerCase();//This will be INVALID first name
        String firstName1 = "SantoshOneOneTwo".toLowerCase(); //This will be INVALID first name
        String firstName2 = "SantoshOneTwo".toLowerCase();//This will be VALID first name
        String firstName3 = "SanOnetoshOneTwo".toLowerCase(); //This will be INVALID first name


        //Till this point its ur code doing all the REGEX checks .
        if (isValidFirstName(firstName)){
            //Only if isValidFirstName is true then do this additional check otherwise no need .
            List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero");
            AtomicInteger count = new AtomicInteger();
            list.forEach(it -> count.set(count.get() + StringUtils.countOccurrencesOf(firstName3, it)));
            if(count.get() >2 ){
                System.out.println("Invalid first name");
                throw new Exception("Bad First Name Input");
                //Throw Bad Input Exception here.
            }else{
                System.out.println("Valid first name");
            }

        }else{
            //Throw Bad Input Exception here.
            throw new Exception("Bad First Name Input");
        }

    }

    public static boolean isValidFirstName(String firstName){
        //This is ur method with all the regex condition except for this occurrence check
        //This should  ur code here but i am return just true just to show it.
        return true;
    }
}
