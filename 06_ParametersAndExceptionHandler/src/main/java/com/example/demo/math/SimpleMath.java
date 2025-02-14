package com.example.demo.math;

public class SimpleMath {

	/*soma*/
    public Double sum(double numberOne, double numberTwo)
    {   
        return numberOne + numberTwo;
    }

    /*subtração*/
    public Double sub(double numberOne, double numberTwo)
    {
        return numberOne - numberTwo;
    }
    
    /*mutiplicação*/
    public Double mutp(double numberOne, double numberTwo)
    {
        return numberOne * numberTwo;
    }
    
    /*divisão*/
    public Double div(double numberOne, double numberTwo)
    {
        return numberOne / numberTwo;
    }
    
    /*raiz*/
    public Double raiz(double number)
    {
        return Math.sqrt(number);
    }
}