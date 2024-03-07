package org.example;

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<i>" + super.getText() + "</i>";
    }
}
