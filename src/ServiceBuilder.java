public class ServiceBuilder {
    private String nameService;
    private String nameCustomer;
    private String address;
    private String consumables;
    private int customersPhone;
    private double price;

    public ServiceBuilder nameService(final String nameService){
        this.nameService = nameService;
        return this;
    }
    public ServiceBuilder nameCustomer(final String nameCustomer){
        this.nameCustomer = nameCustomer;
        return this;
    }
    public ServiceBuilder address(final  String address){
        this.address=address;
        return this;
    }
    public ServiceBuilder consumables(final String consumables){
        this.consumables = consumables;
        return this;
    }
    public ServiceBuilder customerPhone(final int customersPhone){
        this.customersPhone = customersPhone;
        return this;
    }
    public ServiceBuilder price(final  double price){
        this.price = price;
        return this;
    }

    public String getNameService() {
        return nameService;
    }
    public String getNameCustomer() {
        return nameCustomer;
    }
    public String getAddress() {
        return address;
    }
    public String getConsumables() {
        return consumables;
    }
    public int getCustomersPhone() {
        return customersPhone;
    }
    public double getPrice() {
        return price;
    }

    public Service build(){
        return new Service(this);
    }
}
