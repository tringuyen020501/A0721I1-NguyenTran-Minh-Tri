package QuanLiSach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper<T> {
//    List<String>  read(String path) {
//        List<String> res = new ArrayList<>();
//        try{
//            File file = new File(path);
//            if (file.exists())
//                file.createNewFile();
//            BufferedReader bufferedReader = new BufferedReader(new  FileReader(path));
//            String line;
//            while ((line = bufferedReader.readLine())!=null)
//            {
//                res.add(line);
//            }
//            bufferedReader.close();
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return res;
//    }
//    void write(List<T> tList, String path){
//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
//            for (T t:tList)
//                bufferedWriter.write(t.toString());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
public List<String> read(String path){
        List<String> res = new ArrayList<>();
        try {
            File file = new File(path);
            if (file.exists())
                file.createNewFile();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line ;
            while ((line=bufferedReader.readLine())!=null)
            {
                res.add(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return res;
    }
    public void write(List<T> tList, String path){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (T t:tList)
                bufferedWriter.write(t.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
