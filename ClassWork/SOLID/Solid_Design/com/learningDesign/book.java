package com.learningDesign;
public class book {
    private String name;
    private String author;
    private String text;
    public book(String author, String name, String text) {
        this.author = author;
        this.name = name;
        this.text = text;
    }
    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
        // methods that directly relate to the book properties
        public String replaceWordInText(String word, String replacementWord){
            return text.replaceAll(word, replacementWord);
        }
        public boolean isWordInText(String word){
            return text.contains(word);
        }

}
