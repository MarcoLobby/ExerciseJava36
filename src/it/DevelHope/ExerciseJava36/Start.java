package it.DevelHope.ExerciseJava36;

public class Start {
    public static void main(String[] args) {
        String string = "x3z ? xYz ! R1 && __";
        String string2 = string.replaceAll("[a-z]|[0-9]", "*");

        System.out.println(string2);
    }
}
/*
    You have a string with the following value: x3z ? xYz ! R1 && __
    with a regular expression, change into * every occurrence of a lowercase letter or of a digit between 0 and 9
    print the result
*/