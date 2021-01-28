package model.entities;

public class User {

    private String cpf;
    private String name;
    private String email;
    private int birthdate;
    private String gender;
    
    public User(String name, String cpf, String email, int birthdate, String gender){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
