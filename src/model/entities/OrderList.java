package model.entities;

public class OrderList {

    private int id;
    private String name;
    private double price;
    private boolean situation;
    private String date; 

    /**
     *
     * @param id
     * @param name
     * @param price
     */
    public OrderList(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public OrderList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean getSituation(){
        return situation;
    }
    
    public void setSituation(boolean situation){
        this.situation = situation;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return id + ", " + name + ", " + price + "," + situation + ", " + date;
    }
    
    

}
