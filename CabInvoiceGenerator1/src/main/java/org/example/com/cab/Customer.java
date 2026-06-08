package org.example.com.cab;

public class Customer {
    String userId;
    String name;
    String email;
    String password;
    String phone;
    public Customer(String userId, String name, String email, String password, String phone) {
        this.userId=userId;
        this.name=name;
        this.email=email;
        this.password=password;
        this.phone=phone;

    }
    public void display(){
        System.out.println("Customer "+userId+" "+name+" "+email+" "+password+" "+phone);
    }

}
