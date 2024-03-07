package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a simple text component
        TextComponent simpleText = new SimpleTextComponent();
        System.out.println("Simple Text: " + simpleText.getText());

        // Decorate it with bold formatting
        TextComponent boldText = new BoldDecorator(simpleText);
        System.out.println("Bold Text: " + boldText.getText());

        // Decorate it with italic formatting
        TextComponent italicText = new ItalicDecorator(simpleText);
        System.out.println("Italic Text: " + italicText.getText());

        // Decorate it with underline formatting
        TextComponent underlinedText = new UnderlineDecorator(simpleText);
        System.out.println("Underlined Text: " + underlinedText.getText());
    }
}