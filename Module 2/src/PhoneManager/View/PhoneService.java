package PhoneManager.View;

import PhoneManager.Model.Phone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneService {
    public static List<Phone> phones = new ArrayList<>();
    private static PhoneManager.View.CSVHelper<Phone> csvHelper = new CSVHelper<>();
    private static final String path="src\\PhoneManager\\Model\\Mobiles.csv";
    public PhoneService(){
        phones=getAll();
    }
    List<Phone> getAll(){
        phones.clear();
        List<String> lines=csvHelper.read(path);
        for(String line: lines){
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            double price = Double.parseDouble(tmp[2]);
            double quantity= Double.parseDouble(tmp[3]);
            String producer=tmp[4];
            Phone phone = new Phone(id, name, price, quantity, producer);
            phones.add(phone);
        }
        return phones;
    }
     public static void save(Phone phone){
        if (phone.getId()>0){
            int index = phones.indexOf(phone);
            phones.set(index, phone);
        }else {
            phone.setId(phones.size()+1);
            phones.add(phone);
        }
        csvHelper.write(Collections.singletonList(phone), path);
    }
    public static void delete(int id){
        int size= phones.size();
        for (int i = 1; i < size; i++){
            if (id==phones.get(i).getId());
            phones.remove(id);
        }
    }
    public static void show(List<Phone> phones){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s", "ID", "NAME",  "PRICE", "QUANTITY", "PRODUCER\n");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone phone: phones){
            System.out.printf("%-10s %-20s %-20s %-20.2f %-20s\n",phone.getId(), phone.getName(), phone.getPrice(),phone.getQuantity(),phone.getProducer() );
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void show(){
        show(phones);
    }

   public static List<Phone> searchByName(String name){
        return phones.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
    }

   public static List<Phone> searchByID(int id){
        return phones.stream().filter(e->e.getId()>id).collect(Collectors.toList());
    }
}
