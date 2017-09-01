package Work;

import java.io.*;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main3 {

    // перезаписуем информацию с одного файла "aa.txt" в другой файл "bb.txt" (только тут чтение и запись файла построчно)
    public static void main(String[] args) {
        File fileIn = new File("src\\main\\java\\DirectoryWithFiles\\aa.txt");
        File fileOut = new File("src\\main\\java\\DirectoryWithFiles\\cc.txt");
        Reader reader = null;
        Writer writer = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(fileIn);
            writer = new FileWriter(fileOut);
            br = new BufferedReader(reader); // обрамляем наш reader bufferedReader
            String line;
            while ((line = br.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
