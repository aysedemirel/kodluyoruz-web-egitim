package com.ayse.condition.horoscope;

/**
 * Date of Birth %12 = 0 ➜ Monkey
 * Date of Birth %12 = 1 ➜ Rooster
 * Date of Birth %12 = 2 ➜ Dog
 * Date of Birth %12 = 3 ➜ Pig
 * Date of Birth %12 = 4 ➜ Rat
 * Date of Birth %12 = 5 ➜ Ox
 * Date of Birth %12 = 6 ➜ Tiger
 * Date of Birth %12 = 7 ➜ Rabbit
 * Date of Birth %12 = 8 ➜ Dragon
 * Date of Birth %12 = 9 ➜ Snake
 * Date of Birth %12 = 10 ➜ Horse
 * Date of Birth %12 = 11 ➜ Sheep
 *
 * @author aysedemirel
 */
public enum ChineseZodiacTypes {
    MONKEY(0),
    COCKEREL(1),
    DOG(2),
    PIG(3),
    MOUSE(4),
    OX(5),
    TIGER(6),
    RABBIT(7),
    DRAGON(8),
    SNAKE(9),
    HORSE(10),
    SHEEP(11),
    UNKNOWN(12);

    private final int id;

    ChineseZodiacTypes(int id) {
        this.id = id;
    }

    public static ChineseZodiacTypes getType(int id) {
        for (ChineseZodiacTypes type : values()
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
