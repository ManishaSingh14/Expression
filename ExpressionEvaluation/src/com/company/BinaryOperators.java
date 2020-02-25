package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryOperators implements Operator {
    List<String> binary = new ArrayList<>();
    String type = "binary";

    public double eval(Node l, Node r) {
        return 0;
    }
}















//    BinaryOperators b = new BinaryOperators();
//        b.binary.add("+");
//        b.binary.add("-");
//        b.binary.add("*");
//        b.binary.add("/");
//        b.binary.add("%");
//
//
//    public double binaryOperations(double num1, double num2) {
//        for (String operator : binary) {
//            if (operator.equals("+")) {
//                return num1 + num2;
//            } else if (operator == "-") {
//                return num1 - num2;
//            } else if (operator == "*") {
//                return num1 * num2;
//            } else if (operator == "/") {
//                return num1 / num2;
//            } else try {
//                throw new CustomException("invalid operator");
//            } catch (CustomException e) {
//                e.getMessage();
//            }
//            return num1;
//
//        }
////    }



