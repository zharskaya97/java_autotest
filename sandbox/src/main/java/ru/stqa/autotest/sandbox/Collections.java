package ru.stqa.autotest.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args){
        String[] langs = {"Java","C#", "Python","PHP"};
        for (String l : langs){
            System.out.println("Я хочу выучить " + l);
        }


        List<String> language = Arrays.asList("Java","C#", "Python","PHP");

        for (String l : language){
            System.out.println("Я хочу выучить " + l);
        }
/*        for (int i = 0; i<language.size(); i++){
            System.out.println("Я хочу выучить " + language.get(i));
        }*/

    }
}
