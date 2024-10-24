package com.ayse.loop.atm;

public enum AccountOperations {
    DEPOSIT(0),
    WITHDRAW(1),
    BALANCE_INQUIRY(2),
    EXIT(3);

    int id;

    AccountOperations(int id) {
        this.id = id;
    }

    public static AccountOperations getOperation(int id) {
        for (AccountOperations opr : values()
        ) {
            if (opr.id == id) {
                return opr;
            }
        }
        return EXIT;
    }
}
