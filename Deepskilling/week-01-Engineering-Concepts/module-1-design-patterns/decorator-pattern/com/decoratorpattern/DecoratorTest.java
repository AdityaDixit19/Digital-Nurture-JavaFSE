package com.decoratorpattern;
public class DecoratorTest {
    public static void main(String[] args) {
        // Chain the decorators
        Notifier stack = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));

        // This will trigger Email, then SMS, then Slack
        stack.send("Server is down!");
    }
}