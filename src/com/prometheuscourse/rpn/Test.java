package com.prometheuscourse.rpn;

/**
 * Created by donna on 09.04.17.
 */
public class Test {
    public static void main(String[] args) {

        String[] testArgs;
        String testExpression;
        String rightAnswer;

        try {
            testExpression = "-10 20 30.0 * -";
            rightAnswer = "-610";
            System.out.println("Test case: " + "-10 20 30.0 * -");
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20 30.0 * -";
            rightAnswer = "-590";
            System.out.println("Test case: " + "10 20 30.0 * -");
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "25 0 /";
            rightAnswer = "ArithmeticException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }
        try {
            testExpression = "10 20 /";
            rightAnswer = "0.5";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }
        try {
            testExpression = "10 + 30 * 40";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }


        try {
            testExpression = "10 20 + 30 40 + *";
            rightAnswer = "2100";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20 30.0 * +";
            rightAnswer = "610";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20 30 () +";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20 Е * +";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }


        try {
            testExpression = "10 20 + 30 40 + ";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "10 20 + + ";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }

        try {
            testExpression = "+ + ";
            rightAnswer = "RPNParserException";
            System.out.println("Test case: " + testExpression);
            System.out.println("Right answer: " + rightAnswer);
            testArgs = new String[] {testExpression};
            System.out.print("Your answer: ");
            Application.main(testArgs);
        } catch (Exception e) {
            System.out.println("Вылетело исключение: " + e);
        }


    }
}