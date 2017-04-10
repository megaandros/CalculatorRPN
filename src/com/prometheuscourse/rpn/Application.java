package com.prometheuscourse.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

    public static double parse(String rpnString) {
        Deque<Double> lifo = new LinkedList<Double>();
        String[] parsedString = rpnString.split(" ");
        try {
            for (int i = 0; i < parsedString.length; i++) {
                String temp = parsedString[i];
                if (temp.matches("^-?\\d+(\\.\\d{1,2})?")) {
                    Double variable = Double.valueOf(temp);
                    lifo.push(variable);

                } else {
                    switch (temp) {
                        case "+": {
                            lifo.push(lifo.pop() + lifo.pop());
                            break;
                        }
                        case "-": {
                            lifo.push(-lifo.pop() + lifo.pop());
                            break;
                        }
                        case "*": {
                            lifo.push(lifo.pop() * lifo.pop());
                            break;
                        }
                        case "/": {
                            lifo.push(isNotNullArgument(lifo.pop(), lifo.pop()));
                            break;
                        }
                        default: {
                            throw new RPNParserException();
                        }

                    }
                }
            }
        } catch (ArithmeticException ex) {
            throw new ArithmeticException();
        }  catch (Exception ex) {
            throw new RPNParserException();
        }

        if (lifo.size() > 1) {
            throw new RPNParserException();
        } else{
            System.out.println(lifo.getFirst());
            return lifo.pop();
        }
    }

    private static Double isNotNullArgument(Double pop1, Double pop2) {
        if (Double.isInfinite(pop2 / pop1) || Double.isNaN(pop2 / pop1))
            throw new ArithmeticException("Invalid argument during deviding: " + pop2 + " / " + pop1);
        return pop2 / pop1;
    }

    public static void main(String[] args) {
            parse(args[0]);
    }
}



