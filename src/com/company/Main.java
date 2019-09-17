package com.company;

import java.io.IOException;
import java.lang.module.FindException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Main {


    public static void main(String[] args) throws IOException {
        String emails = Files.readString(Paths.get("sample.txt"), Charset.forName("windows-1252"));
        HashMap<String, Integer> emailamount = collectemailamount(emails);
        System.out.print(emailamount);

    }

    private static HashMap<String, Integer> collectemailamount(String emails) {
        HashMap<String, Integer> map = new HashMap<>();

        Pattern p = Pattern.compile("\\w+@((?: \\w+\\.)+\\w+)");
        Matcher m = p.matcher(emails);


        while (m.find()){
            String emailDom = m.group(1);
            int count = map.getOrDefault(emailDom, 0);
            map.put(emailDom, count + 1);
        }
        return map;
    }
}



