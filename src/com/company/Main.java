package com.company;

import java.io.IOException;
import java.lang.module.FindException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Main {



    public static void main(String[] args) throws IOException{
        String emails = Files.readString(Paths.get("sample.txt"), Charset.forName("windows-1252"));
        Pattern p = Pattern.compile("@softwire\\.com");
        Matcher m = p.matcher(emails);
        boolean b = m.matches();

        int counter = 0;


       while (m.find()){
           counter = counter + 1;

           }
        System.out.println(counter);

       }

    }


