package PhoneManager.Model;

public class GenuinePhone extends Phone{
    private String time;
    private String limit;
    public GenuinePhone(int id, String name, double price, double quantity, String producer) {
        super(id, name, price, quantity, producer);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
}
