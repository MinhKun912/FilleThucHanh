package bai2;

import java.awt.*;
import java.util.List;

public class Main {
    static final String PATH_NUMBERS_FILE = "C:\\Users\\MinhKun\\Desktop\\MD3\\fileISO\\src\\bai2\\numbers";

    static final String PATH_RESULT = "C:\\Users\\MinhKun\\Desktop\\MD3\\fileISO\\src\\bai2\\result1";
    static ReadAndWriteFile  readAndWriteFile = new ReadAndWriteFile();


    public static void main(String[] args) {
        List<Integer> listNum = readAndWriteFile.readFile(PATH_NUMBERS_FILE);
        Integer max = findMax(listNum);
        readAndWriteFile.writeFile(PATH_RESULT, max);
    }

    public static int findMax(List<Integer> list){
     Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
