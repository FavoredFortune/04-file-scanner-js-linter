import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanerLinter {
    public static void main(String[] args) {

        //set file name to scan
        String filename = "gates.js";

        //tell program to create new instance of filename to evaluate
        // as a file using scanner method
        File file   = new File(filename);

        int line = 0;
        String lineHolder = "";

        try{
            Scanner scannerJS = new Scanner(file);
            while(scannerJS.hasNextLine()){

                //store content/token of next for evaluation with this variable
                lineHolder = scannerJS.nextLine();
                line++;
                if ((!lineHolder.contains("{") && !lineHolder.contains("}") && !lineHolder.contains("if") &&
                        !lineHolder.contains("else") && !lineHolder.contains("//") && !lineHolder.isEmpty())){
                    System.out.println("Line " + line + ": Missing semicolon");
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
