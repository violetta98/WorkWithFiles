package Work;

import java.io.*;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Violetta\\Desktop\\WorkWithFiles\\src\\main\\java\\DirectoryWithFiles");
        File[] files = dir.listFiles();
        for (File f : files) {
            if (!f.isDirectory())
                System.out.println(f.getAbsolutePath()); // выводим все пути к файлам, которые лежат в директории
        }
    }

}
