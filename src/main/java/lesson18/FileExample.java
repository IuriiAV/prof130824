package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileExample {

    public static void main(String[] args) throws Exception {

        String path = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\lesson18\\text.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        StringBuilder sb = new StringBuilder();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            sb.append((char) data);
        }
        System.out.println(sb);
        fileInputStream.close();

        String pathOut = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\lesson18\\text2.txt";
        String example = "Java Java";
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
        for (int i = 0; i < example.length(); i++) {
            char temp = example.charAt(i);
            fileOutputStream.write(temp);
        }
        fileOutputStream.close();


    }

}
