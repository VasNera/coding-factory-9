package gr.aueb.cf.cf9.ch11;

public class Product {

    private long id;
    private String name;
    private String description;
    private int price;
    private int quantity;
    private boolean stock;

    public Product(){

    }
    public Product(long id, String name, String description, int price, int quantity, boolean stock){

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public boolean isStock() {

        return stock;
    }

    public void setStock(boolean stock) {

        this.stock = stock;
    }


}
