package com.company;

import java.util.*;
import java.util.StringTokenizer;
public class Tokenizer {

    ArrayList<Token> tokens=new ArrayList<Token>();


    public void getExpression(String expr) {
        {
            StringTokenizer st = new StringTokenizer(expr, "+-*/(){}[]", true);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                Token tk=new Token(token);

                tokens.add(tk);
            }


        }
    }



    public ArrayList<Token> getTokens() {
        return tokens;
    }
}























 /* Tokenizer t = new Tokenizer();
        String[] in_array;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string");
        String input = sc.next();
        in_array = input.split("");

        for (int k = 0; k < in_array.length; k++) {
            System.out.print(" " + in_array[k]);
        }
    }
*/