package org.example;

class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>";
    }
}