package com.example.myquizapp;

public class QuestionAnswer {

    public static String question[] ={
            "What is the data type of a variable that stores a number between 0 and 255 ?",
            "What is the keyword used to create a new object ?",
            "What is the keyword used to call a method on an object ?",
            "What is the keyword used to check if a condition is true ?",
            "What is the keyword used to loop through a collection of elements ?",
            "What is the keyword used to create a new class ?",
            "What is the keyword used to access a member of a class ?",
            "What is the keyword used to throw an exception ?",
            "What is the keyword used to catch an exception ?",
            "What is the keyword used to define a method parameter ?"

    };

    public static String choices[][] = {
            {"byte","short","int","long"},
            {"new","create","object","instantiate"},
            {"call","do","method","invoke"},
            {"if","else","else if","boolean"},
            {"for","foreach","while","do while"},
            {"class","type","object","instance"},
            {"dot","colon","period","member"},
            {"throw","raise","error","fail"},
            {"catch","handle","exception","try"},
            {"parameter","argument","input","type"}
    };

    public static String correctAnswers[] = {
            "byte",
            "new",
            "invoke",
            "if",
            "foreach",
            "class",
            "dot",
            "throw",
            "handle",
            "input"
    };
}
