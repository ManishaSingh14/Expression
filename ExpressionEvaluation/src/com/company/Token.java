package com.company;

public class Token {
    public final String name;
    private String type;
    private String value;
    private String precedenceGroup;

    public Token(String name) {
        super();
        this.type = type;
        this.value = value;
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public String getType() {

        return this.type;
    }


    public Double getTokenValue() {
        if (this.type == "operand")
            return Double.parseDouble(this.name);
        return 0.0;
    }

    public String getPrecedenceGroup() {

        return this.precedenceGroup;
    }
}

