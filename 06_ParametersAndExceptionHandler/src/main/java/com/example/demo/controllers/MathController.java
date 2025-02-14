package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.NumberConverter;
import com.example.demo.math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
    /*soma*/
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.sum(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }

    /*subtração*/
    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.sub(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));    }
    
    /*mutiplicação*/
    @RequestMapping(value="/mutp/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mutp(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.mutp(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }
    
    /*divisão*/
    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.div(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }
    
    /*raiz*/
    @RequestMapping(value="/raiz/{number}", method=RequestMethod.GET)
    public Double raiz(@PathVariable("number") String number) throws Exception 
    {
        if (!NumberConverter.isNumeric(number)) 
        {
            throw new Exception();
        }
        return math.raiz(NumberConverter.covertToDouble(number));
    }
    
}