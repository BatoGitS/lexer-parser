package ru.mirea;

import java.util.List;

public class main {
    public static void main(String[] args){
        Lexer test = new Lexer();
        List<Token> tokens = test.process("x  = x 2 x + 237");
        for (Token token : tokens)
            System.out.println(token);

        Parser p = new Parser();
        System.out.println(p.parse(tokens));
    }
}
