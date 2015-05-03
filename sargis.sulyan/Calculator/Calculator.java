
import sun.invoke.empty.Empty;

import java.util.Scanner;

/**
 * Created by Saqo on 5/3/2015.
 */

public class Calculator {

    public static void main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Expression myExpression = getExpression(expression);
        System.out.println(executeExpression(myExpression));


    }



    public static boolean isNumber(String number) throws Exception{

        try
        {
            int d = Integer.parseInt(number);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }

        return true;

    }

    public static Expression getExpression(String expression) throws Exception {

        if(expression == null) {
            throw new NullPointerException("Your expression is Null");
        }

        if (expression.length() == 0) {
            throw new EmptyStringException("Your String is Empty");
        }
        Expression exp = new Expression();

        int lengthOfExp = expression.length();
        int flag = 0;
        for(int j=0;j<lengthOfExp;j++) {
            String a = expression.substring(j,j+1);
            if(isNumber(a) && flag == 0){
                exp.firstNumber += a;
            }

            if(isNumber(a) && flag == 1){
                exp.secondNumber+=a;
            }

            if("".equals(a)) {
                continue;

                }

            if(!isNumber(a)) {
                exp.symbol += a;
                flag = 1;
            }
        }
        return exp;
    }

    public static Integer executeExpression(Expression expression) throws Exception{

        if("+".equals(expression.symbol)) {

            return Integer.parseInt(expression.firstNumber) + Integer.parseInt(expression.secondNumber);
        }

        if("-".equals(expression.symbol)) {

            return Integer.parseInt(expression.firstNumber) - Integer.parseInt(expression.secondNumber);
        }

        if("*".equals(expression.symbol)) {

            return Integer.parseInt(expression.firstNumber) *  Integer.parseInt(expression.secondNumber);
        }

        if("/".equals(expression.symbol)) {

            return Integer.parseInt(expression.firstNumber) / Integer.parseInt(expression.secondNumber);
        }

        throw new Exception("Invalid Operation");
    }


}

 class EmptyStringException extends Exception {

    public EmptyStringException(String message){
        super(message);
    }

}

class Expression {

    String firstNumber;
    String secondNumber;
    String symbol;

    {
        firstNumber="";
        secondNumber="";
        symbol = "";
    }

    public Expression() {}


}
