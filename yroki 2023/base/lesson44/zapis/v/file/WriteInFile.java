package base.lesson44.zapis.v.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Иришка чудо пепс");
        pw.println("И, немножко, жепс");
        pw.close();

    }
}
