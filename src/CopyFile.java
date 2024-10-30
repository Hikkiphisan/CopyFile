import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("Input.txt");
            out = new FileOutputStream("output.txt");
          int c;
          while ((c = in.read()) != -1) { //chua den cuoi luong thi vong lap se tiep tuc , thoa man dieu kien while thi vong lap se tiep tuc.
              out.write(c);
          }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
