package com.example.tool;

import java.io.*;

public class read_file {
    public static String read_file(String file_path)throws Exception{
        String encoding = "UTF-8";
        File file = new File(file_path);
        Long filelength = file.length();
        byte[] file_content = new byte[filelength.intValue()];
        try{
            FileInputStream in = new FileInputStream(file);
            in.read(file_content);
            in.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            return new String(file_content,encoding);
        }catch (UnsupportedEncodingException e){
            System.out.println("this is"+encoding);
            e.printStackTrace();
            return null;
        }
    }
}
