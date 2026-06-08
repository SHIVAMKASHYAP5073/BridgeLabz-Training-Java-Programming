package org.example;

import org.example.com.cab.Validation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {

    Validation v = new Validation();

    @Test
    void emailTest() {

        assertTrue(v.validateEmail(
                "abc@gmail.com"));
    }

    @Test
    void phoneTest() {

        assertTrue(v.validatePhone(
                        "9876543210"));
    }
    @Test
    void passwordTest() {

        assertTrue(v.validatePassword("Admin123"));
    }
}