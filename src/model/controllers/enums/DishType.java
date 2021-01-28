package model.controllers.enums;

public enum DishType {
    
    CAFE_DA_MANHA(1,"Café da Manhã"),
    ENTRADA(2,"Entrada"),
    PRATO_PRICIPAL(3,"Prato Principal"),
    SOBREMESA(4,"Sobremesa"),
    BEBIDAS(5,"Bebidas"),
    LANCHES_SALGADOS(6,"Lanches & Salgados"),
    SANDUICHES(7,"Sanduiches"),
    FAVORITOS(8, "Favoritos");
    
    private final int id;
    private final String type;

    private DishType(int id, String type) {
        this.id = id;
        this.type = type;
    }
    
    public int getId(){
        return id;
    }
    
    public String getType(){
        return type;
    }

    
}
