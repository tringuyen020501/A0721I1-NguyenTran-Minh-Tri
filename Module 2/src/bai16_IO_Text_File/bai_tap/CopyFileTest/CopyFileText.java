package bai16_IO_Text_File.bai_tap.CopyFileTest;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileText {
    static final String PATH="src/bai16_IO_Text_File/bai_tap/CopyFileTest";

    public static void main(String[] args) {
        String soure =PATH+"\\test.txt";
        String des =PATH+"\\test1.txt";
        try{
            copyFile(soure, des);
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }

    private void copyFileJava7(String sourse, String des){
        Path pathSourse = Paths.get(sourse);
        Path pathDes =Paths.get(des);
    }

    private static void copyFile(String soure, String des) throws IOException{
        FileInputStream sourFile = new FileInputStream(soure);
        FileOutputStream desFile = new FileOutputStream(des);
        byte[] array = new byte[1024];
        sourFile.read(array);
        desFile.write(array);

        sourFile.close();
        desFile.close();
    }

    private static void writeNumberCharacter(String path) throws IOException{
        File file = new File(path);
        if (!file.canRead())
            file.setReadable(true);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        String tmp="";
        while ((line= bufferedReader.readLine())!=null){
            tmp+=line;
        }
        bufferedReader.close();

        int res= tmp.replace(" ", "").length();
        System.out.println(res);

        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write("\nTotal charater in file: "+ res);
        bufferedWriter.close();
    }
}
