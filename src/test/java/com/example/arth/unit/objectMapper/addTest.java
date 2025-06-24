package com.example.arth.unit.objectMapper;

import com.example.arth.endpoint.rest.controller.add;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class addTest {
    add subject = new add();
    @Test
    void addTest() {
        Assertions.assertEquals(5, subject.add(2, 3));
    }
}
