public class Order {
    protected String clientName;
    protected String product;
    protected int qnt;//количество продуктов
    protected int price;//общая цена

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }


    public Order(){

    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Имя клиента: %s\nПродукт: %s\nКоличество: %d\nЦена: %d\n",
                clientName, product, qnt, price);
    }
}
