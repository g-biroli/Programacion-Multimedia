package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String gender, email, phone;

    public Usuario(){

    }

    public Usuario(String email, String gender, String phone) {
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    public void mostrarDatos(){
        System.out.println("gender = " + gender);
        System.out.println("email = " + email);
        System.out.println("gender = " + email);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
