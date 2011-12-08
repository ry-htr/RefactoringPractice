package chapter2.simpledatabase;

import java.io.*;
import java.util.Iterator;

public class Main {
    public static void main (String[] args) {
        String sCurrentDir = new File(".").getAbsoluteFile().getParent();
        try{
            SimpleDatabase db = new SimpleDatabase(new FileReader(sCurrentDir + "/src/chapter2/simpledatabase/dbfile.txt"));
            Iterator<String> it = db.iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("KEY: \"" + key + "\"");
                System.out.println("VALUE: \"" + db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
