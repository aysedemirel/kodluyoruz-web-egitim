package com.ayse.condition.travel;

public enum TravelType {
    ONE_WAY(1),
    ROUND_TRIP(2),
    UNKNOWN(3);

    private final int id;

    TravelType(int type) {
        id = type;
    }

    public static TravelType getType(int id) {
        for (TravelType type : values()
        ) {
            if (type.getId() == id) {
                return type;
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return id;
    }
}
