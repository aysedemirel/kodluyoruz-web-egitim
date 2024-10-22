package com.ayse.condition.calculator;

enum Operations {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    UNKNOWN(' ');
    private final char operation;

    Operations(char operation) {
        this.operation = operation;
    }

    public static Operations getOperationEnum(char value) {
        for (Operations ch : values()) {
            if (ch.getOperation() == value) {
                return ch;
            }
        }
        return Operations.UNKNOWN;
    }

    private char getOperation() {
        return operation;
    }
}

