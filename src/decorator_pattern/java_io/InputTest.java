package decorator_pattern.java_io;

import decorator_pattern.java_io.LowerCaseInputStream;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        File f = new File("test.txt");
        try {
            InputStream in =
                    new LowerCaseInputStream(
                        new BufferedInputStream(
                            new FileInputStream(f)));
            while((c = in.read()) > 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
