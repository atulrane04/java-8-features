package com.demo.features.lambada;

public class ColourReference
{
    public static void ColourCode() {
        System.out.println("This is green colour");
    }

    public static void main(String[] args) {
        Colour colour = ColourReference::ColourCode;
        colour.fillColour();
    }
}
