package com.company;


import java.util.ArrayList;
import java.util.Stack;

public class ExprTree {
    private static Node root;

    boolean isOperator(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }

    static void inorder(Node t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.value + " ");
            inorder(t.right);
        }
    }
    public static void constructTree(ArrayList<Token> postfix) {
        MyStack<Node> stack = new MyStack(postfix.size());
        Node t, t1, t2;
        for (int i = 0; i < postfix.size(); i++) {
            // If operand, simply push into stack
            if (postfix.get(i).getName().matches(Operand.regex)) {
                t = new Node(postfix.get(i).getName());
                stack.push(t);
            } else // operator
            {
                t = new Node(postfix.get(i).getName());

                if(!stack.isEmpty())
                {t1 = stack.peek();
                    stack.pop();
                    t2 = stack.peek();
                    stack.pop();

                    t.right = t1;
                    t.left = t2;

                    stack.push(t);}
            }
        }

        t = stack.peek();
        root = t;
        inorder(root);
        stack.pop();
    }
    public Node getroot()
    {
        return root;
    }
}



