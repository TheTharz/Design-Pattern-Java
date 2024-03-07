package org.example;

abstract class TextDecorator implements TextComponent{
    protected TextComponent textComponent;

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    public String getText() {
        return textComponent.getText();
    }
}
