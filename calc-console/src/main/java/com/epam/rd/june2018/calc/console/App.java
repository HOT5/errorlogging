package com.epam.rd.june2018.calc.console;


import com.epam.rd.spring2019.calc.core.CalcImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER_ERROR = LoggerFactory.getLogger(App.class);
    private static final Logger LOGGER_WARNING = LoggerFactory.getLogger(App.class);
    private static final Logger LOGGER_INFO = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {


        LOGGER_INFO.info("Application Calculator Started!");
        LOGGER_INFO.info("Version: 0.1");



        /*if (args.length != 3) {
            CalcImpl calc = new CalcImpl();
            switch(args[2]) {
                case "+":
                    //logger.error(String.valueOf(calc.addition(Integer.parseInt(args[0]), Integer.parseInt(args[1]))));
                    break;
                case "-":
                    break;
                case "/":
                    break;
                case "*":
                    break;
                    default:
                        System.out.println("not a valid operator");
            }
        } else {
            LOGGER_ERROR.error("Incorrect number of arguments: "+ args.length+ "Expected 3");
            LOGGER_ERROR.error("Use structure -[ number1 number2 operator ]-");
            LOGGER_INFO.info("Use structure -[ number1 number2 operator ]-");

        }*/
    }
}
