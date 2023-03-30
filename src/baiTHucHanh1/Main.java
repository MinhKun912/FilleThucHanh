package baiTHucHanh1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        ReadFileExample rf =new ReadFileExample();
        rf.readFileText(path);
    }




    }
