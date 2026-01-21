

//custom exception
package exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}


//Validation Logic
package validation;

import exceptions.InvalidAgeException;
import exceptions.InvalidDeptException;

public class Validator {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid Age: " + age);
        }
    }

    public static void checkDept(String dept) throws InvalidDeptException {
        if (!(dept.equals("CSE") || dept.equals("ICT") || dept.equals("EEE"))) {
            throw new InvalidDeptException("Invalid Department: " + dept);
        }
    }
}
//Main Class + Module Test
module StudentValidation {
    exports validation;
    exports exceptions;
}
//main class
package main;

import validation.Validator;
import exceptions.InvalidAgeException;
import exceptions.InvalidDeptException;

public class TestValidation {
    public static void main(String[] args) {

        try {
            Validator.checkAge(17);
            Validator.checkDept("BBA");
            System.out.println("Validation Successful");
        }
        catch (InvalidAgeException | InvalidDeptException e) {
            System.out.println(e.getMessage());
        }
    }
}

