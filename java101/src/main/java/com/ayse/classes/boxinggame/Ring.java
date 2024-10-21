package com.ayse.classes.boxinggame;

public class Ring {

    private final Fighter f1;
    private final Fighter f2;
    private final int minWeight;
    private final int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (f1.getHealth() > 0 && f2.getHealth() > 0) {
                System.out.println("======== NEW ROUND ===========");
                boolean isFirstStart = isFirstPlayerStart();
                boolean isFinish = isFirstStart ? firstStart() : secondStart();
                if (isFinish) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("The weights of the gamers do not match.");
        }
    }

    private boolean checkWeight() {
        int f1Weight = f1.getWeight();
        int f2Weight = f2.getWeight();
        return (f1Weight >= minWeight && f1Weight <= maxWeight) && (f2Weight >= minWeight
                && f2Weight <= maxWeight);
    }

    private boolean isFirstPlayerStart() {
        boolean isFirstStart = (Math.random() < 0.5);
        System.out.println("Start : " + (isFirstStart ? "First" : "Second"));
        return isFirstStart;
    }

    private boolean firstStart() {
        if (hitFirst()) {
            return true;
        }
        return hitSecond();
    }

    private boolean secondStart() {
        if (hitSecond()) {
            return true;
        }
        return hitFirst();
    }

    private boolean hitFirst() {
        f2.setHealth(f1.hit(f2));
        return isWin();
    }

    private boolean hitSecond() {
        f1.setHealth(f2.hit(f1));
        return isWin();
    }


    private boolean isWin() {
        if (f1.getHealth() == 0) {
            System.out.println("Winner : " + f2.getName());
            return true;
        } else if (f2.getHealth() == 0) {
            System.out.println("Winner : " + f1.getName());
            return true;
        }

        return false;
    }

    private void printScore() {
        System.out.println("------------");
        System.out.println(f1.getName() + " Remaining Rights \t:" + f1.getHealth());
        System.out.println(f2.getName() + " Remaining Rights \t:" + f2.getHealth());
    }
}
