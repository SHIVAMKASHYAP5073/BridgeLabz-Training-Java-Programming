package org.example.com.cab;

public class Validation {


        public boolean validateEmail(String email) {

            return email.matches(
                    "^[A-Za-z0-9+_.-]+@(.+)$");

        }
    public boolean validatePhone(String phone) {

        return phone.matches(
                "[6-9][0-9]{9}");
    }
    public boolean validatePassword(String password) {
            return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");


    }
}
