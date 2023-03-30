package baiTHucHanh1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filepath) {
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = :" + sum);

        } catch (Exception e) {
            System.err.println("Loi chuoing trinh");
        }
        System.out.println("test xem chuong trinh con chayj sau khi nem exeption  khong4");
    }
}
