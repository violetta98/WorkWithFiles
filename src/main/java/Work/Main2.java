package Work;

import java.io.*;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main2 {

    // перезаписуем информацию с одного файла "aa.txt" в другой файл "bb.txt" (тут чтение и запись файла посимвольно)
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            File fileIn = new File("src\\main\\java\\DirectoryWithFiles\\aa.txt");
            File fileOut = new File("src\\main\\java\\DirectoryWithFiles\\bb.txt");
            is = new FileInputStream(fileIn);
            os = new FileOutputStream(fileOut);
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
