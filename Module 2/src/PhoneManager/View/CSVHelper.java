package PhoneManager.View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper<T> {
  public  List<String> read(String path){
        List<String> res = new ArrayList<>();
        try {
            File file= new File(path);
            if (file.exists())
                file.createNewFile();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line=bufferedReader.readLine())!=null);
            {
                res.add(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return res;
    }
  public void write(List<T> tlist, String path){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(path))) {
            for(T t:tlist)
                bufferedWriter.write(t.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
