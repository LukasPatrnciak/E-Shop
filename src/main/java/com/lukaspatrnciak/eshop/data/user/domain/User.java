package com.lukaspatrnciak.eshop.data.user.domain;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;

    public User(String name, String surname, String email, String password) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.trim().isEmpty()) { // trim - odstrani vsetky biele znaky spredu aj zozadu, aj medzeru
            throw new IllegalArgumentException("[ ! ]  Je potrebne zadat email");
        }

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.trim().isEmpty()) { // trim - odstrani vsetky biele znaky spredu aj zozadu, aj medzeru
            throw new IllegalArgumentException("[ ! ]  Je potrebne zadat heslo");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nP O U Z I V A T E L\n" +
                " Meno: " + name + "\n" +
                " Priezvisko: " + surname + "\n" +
                " E-Mail: " + email + "\n" +
                " Heslo: " + password;
    }
}
