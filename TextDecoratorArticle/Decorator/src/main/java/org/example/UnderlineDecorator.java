package org.example;

class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<u>" + super.getText() + "</u>";
    }
}