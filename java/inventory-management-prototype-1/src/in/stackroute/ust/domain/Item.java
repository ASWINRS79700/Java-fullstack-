package in.stackroute.ust.domain;

public class Item {

    // class used to represent the items in the inventory
    public int  Id;
   public String Name;
    public String Description;
    public int Price;
    public int Quantity;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Item(int id, String name, String des, int price, int qua){
        this.Id=id;
        this.Name=name;
        this.Description=des;
        this.Price=price;
        this.Quantity=qua;
    }
}
