package lesson_6;

import java.io.*;
import java.lang.reflect.Array;

public class Lesson_6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        try {
            File file = new File("newFile.csv");

            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);

            String[] header = {"Value 1; ", "Value 2; ", "Value 3; "};
            for (int a = 0; a < header.length; a++) {
                pw.print(header[a]);
            }
            pw.println();

            int[][] data = {
                    {3, 5, 9},
                    {23, 84, 32}
            };

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    pw.print(data[i][j] + "; ");
                }
                pw.println();
            }
            pw.close();

            br = new BufferedReader(new FileReader("newFile.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("Error: " + e);
        } finally{
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}