package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text,PoemDecorator poemDecorator){
        String textBeautified=poemDecorator.decorate(text);
        System.out.println("Text beautified: "+ textBeautified);
    }
}
