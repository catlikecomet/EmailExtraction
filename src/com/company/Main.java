package com.company;

import java.io.IOException;
import java.lang.module.FindException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Main {



    public static void main(String[] args) throws IOException{
        String emails = Files.readString(Paths.get("sample.txt"), Charset.forName("windows-1252"));
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("@softwire.com");
        boolean b = m.matches();

        int counter = 0;


       for (int i =0; i < emails.length() - 13; i++){

           if (){


           }

           /*if (emails.substring(i, i + 13 ).equals("@softwire.com")) {
               counter = counter + 1;*/

           }






       }
        System.out.println(counter);
    }


