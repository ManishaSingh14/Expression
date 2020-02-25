package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class InfixToPostfix {

    static int precedence(String c) {
        switch (c) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
    static ArrayList<Token> infixToPostfix(ArrayList<Token> tokens)
    {

   ArrayList<Token>postfixLIst=new ArrayList<>();

    Stack<Token> stack = new Stack<>();
        for (int i = 0; i<tokens.size(); ++i)
    {

        if (tokens.get(i).getName().matches(Operand.regex)) {
            postfixLIst.add(tokens.get(i));
        }

        else if ("(".equals(tokens.get(i).getName() ))
            stack.push(tokens.get(i));

        else if (")".equals(tokens.get(i).getName()))
        {
            while (!stack.isEmpty() &&  !"(".equals(stack.peek().getName()))
                postfixLIst.add(stack.pop());
            if (!stack.isEmpty() &&  !"(".equals(stack.peek().getName()))
                System.out.print("Invalid Expression");
            else
                stack.pop();
        }
        else
        {
            while (!stack.isEmpty() && precedence(tokens.get(i).getName()) <= precedence(stack.peek().getName())){
                if("(".equals(stack.peek().getName()))
                    System.out.print("Invalid Expression");
                postfixLIst.add(stack.pop());
            }
            stack.push(tokens.get(i));
        }
    }

while (!stack.isEmpty()){
        if("(".equals(stack.peek().getName()))
            System.out.print("Invalid Expression");
        postfixLIst.add(stack.pop());
    }
        return postfixLIst;
}

}
