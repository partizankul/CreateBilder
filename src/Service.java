public class Service {
    private final String nameService;
    private final String nameCustomer;
    private final String address;
    private final String consumables;
    private final int customersPhone;
    private final double price;

    Service(final ServiceBuilder serviceBuilder) {
        this.nameService = serviceBuilder.getNameService();
        this.nameCustomer = serviceBuilder.getNameCustomer();
        this.address = serviceBuilder.getAddress();
        this.consumables = serviceBuilder.getConsumables();
        this.customersPhone = serviceBuilder.getCustomersPhone();
        this.price = serviceBuilder.getPrice();
    }

    @Override
    public String toString() {
        return "Service{" +
                "nameService='" + nameService + '\'' +
                "nameCustomer='" + nameCustomer + '\'' +
                ", address='" + address + '\'' +
                ", consumables='" + consumables + '\'' +
                ", customersPhone=" + customersPhone +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {


        final Service service = new ServiceBuilder().nameService("massage").
                nameCustomer("Alex")
                .address("Karskogo 23")
                .consumables("towel").customerPhone(298802951)
                .price(500)
                .build();
        System.out.println(service);

    }
}
