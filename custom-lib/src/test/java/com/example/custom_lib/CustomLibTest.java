package com.example.custom_lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomLibTest {

  @Test
  public void test_identifierIsCorrect() {
    //In Junit5 assertions are assertEquals(expected, actual, [message])
    assertEquals("I'm a String from a custom library.", CustomLib.identifier);
  }
}
