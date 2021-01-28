package model.entities;

public class Favorites {
    
    private Integer id;
    private String username;
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }
    
    public Menu getMenu(){
        return menu;
    }
    
    public void setMenu(Menu menu){
        this.menu = menu;
    }
    
    
}
