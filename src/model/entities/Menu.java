package model.entities;

import model.controllers.enums.DishType;

public class Menu {
    
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private double tempoPreparo;
    private DishType tipoRefeicao;
    private String enderecoImg;

    public int getId() {
        return id;
    }

    public void setId(int cd_prato) {
        this.id = cd_prato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Double getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(double tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public DishType getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(DishType tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    public String getEnderecoImg() {
        return enderecoImg;
    }

    public void setEnderecoImg(String enderecoImg) {
        this.enderecoImg = enderecoImg;
    }  
    
    public boolean isNomeValido () {
         boolean saida=false;
         if(this.nome.length()<=30) {
             saida=true;
         } 
         return saida;
    }
    
    public boolean isDescricaoValido () {
         boolean saida=false;
         if(this.descricao.length()<100) {
             saida=true;
         }
         return saida;
    }
    
    public boolean isPrecoValido () {
         boolean saida=false;
         if(this.preco < 600) {
             saida=true;
         }
        
         return saida;
    }
    public boolean isTempoPreparoValido () {
         boolean saida=false;
         if(this.tempoPreparo < 120) {
             saida=true;
         }
         return saida;
    }
    
    public boolean consisteTamanhoCampos()
         {boolean saida = false;
         if(this.isNomeValido()==true&&
         this.isDescricaoValido()==true&&
         this.isPrecoValido()==true&&
         this.isTempoPreparoValido()==true)
         {saida = true;}
             
         return saida;}
}
