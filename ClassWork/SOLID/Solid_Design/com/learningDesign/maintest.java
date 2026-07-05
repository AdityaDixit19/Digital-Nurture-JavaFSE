package com.learningDesign;
public class maintest extends book {
    public maintest(String author, String name, String text) {
        super(author, name, text);
    }
    static void main() {
        book book =new book("java program","sunmicro","java is a powerfull prog. lang");
        BookPrinter printer = new BookPrinter();
        printer.printTextToConsole("hello world");
    }

}
