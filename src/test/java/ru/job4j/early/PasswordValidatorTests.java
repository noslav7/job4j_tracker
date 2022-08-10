package ru.job4j.early;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTests {

       @Test
       public void whenPasswordNullThanNullException () {
              NullPointerException nullPointerException
                      = assertThrows(NullPointerException.class,
                      () -> PasswordValidator.validate(null));

              assertTrue(nullPointerException.getMessage()
                      .contains("The password may not be null."));
       }

       @Test
       public void whenPasswordLengthOutBoundsThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("hello"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("The password length should not be inferior to 8 or exceed 32."));
       }

       @Test
       public void whenNoUppercaseThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("helloworld"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("At least one password letter should be an uppercase."));
       }

       @Test
       public void whenNoLowercaseThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("HELLOWORLD"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("At least one password letter should be a lowercase."));
       }

       @Test
       public void whenNoDigitsThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("helloWorld"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("At least one password letter should be a digit."));
       }

       @Test
       public void whenNoSpecialCharactersThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("helloWorld39"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("At least one password symbol should be a special character."));
       }

       @Test
       public void whenTooSimpleThanIllegalException () {
              IllegalArgumentException illegalArgumentException
                      = assertThrows(IllegalArgumentException.class,
                      () -> PasswordValidator.validate("pAssWorD@987"));

              assertTrue(illegalArgumentException.getMessage()
                      .contains("The password may not contain overly simple substrings."));
       }
}