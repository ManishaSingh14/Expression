package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression to be evaluated");
        String expr = sc.nextLine();
        Tokenizer t = new Tokenizer();
        t.getExpression(expr);
        ArrayList<Token> tokens = t.getTokens();

        for (Token each:tokens)
            System.out.println(each.getName());

        ExprTree ex = new ExprTree();
        InfixToPostfix i = new InfixToPostfix();
        ArrayList<Token> postfix= new ArrayList();
        postfix = i.infixToPostfix(tokens);
        for (Token each:postfix)
            System.out.print(each.getName()+" ");
        System.out.println("");
        ExprTree.constructTree(postfix);
        ExprTree etr=new ExprTree();
        Evaluator e = new Evaluator();
        System.out.print("\n\nresult:"+e.evaluate(etr.getroot()));






        //e.calculateExpression(tokens);



       // ex.createExprTree(postfix);
        //ex.inorder(root);
        //System.out.println(ex);

//


    }

}

