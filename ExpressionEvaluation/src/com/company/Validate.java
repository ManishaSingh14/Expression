package com.company;

import java.util.*;

public class Validate {

    public boolean Validate(List<String> tokens) {
        int i = tokens.size();
        String str=tokens.get(i);
    if(str.equals("-")||str.equals("+")||str.equals("*")||str.equals("/")){
        return true;
    }   else
        return false;
    }

}

