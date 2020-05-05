package com.example.final125;

public class PlayerInfo {
    private static boolean itemOne;
    private  static boolean itemTwo;
    private static boolean itemThree;
    private static boolean itemFour;
    private static boolean partOne;
    private static boolean partTwo;
    private static boolean partThree;
    private static boolean partFour;
    private static int oxygenPercentage = -1000;
    private static int costOfMovement;
    private static int costOfBadEnd;

    PlayerInfo() {
        itemOne = false;
        itemTwo = false;
        itemThree = false;
        itemFour = false;
        partOne = false;
        partTwo = false;
        partThree = false;
        partFour = false;
        oxygenPercentage = 100;
    }

    public static void obtainedItemOne() {
        itemOne = true;
    }

    public static void obtainedItemTwo() {
        itemTwo = true;
    }

    public static void obtainedItemThree() {
        itemThree = true;
    }

    public static void obtainedItemFour() {
        itemFour = true;
    }

    public static void obtainedPartOne() {
        partOne = true;
    }

    public static void obtainedPartTwo() {
        partTwo = true;
    }

    public static void obtainedPartThree() {
        partThree = true;
    }

    public static boolean checkItemOne() {
        return itemOne;
    }

    public static boolean checkItemTwo() {
        return itemTwo;
    }

    public static boolean checkItemThree() {
        return itemThree;
    }

    public static boolean checkItemFour() {
        return itemFour;
    }

    public static boolean checkPartOne() {
        return partOne;
    }

    public static boolean checkPartTwo() {
        return partTwo;
    }
    public static boolean checkPartThree() {
        return partThree;
    }
    public static boolean checkPartFour() {
        return partFour;
    }


    public static boolean movement() {
        if (oxygenPercentage - costOfMovement <= 0) {
            return false;
        } else {
            oxygenPercentage = oxygenPercentage - costOfMovement;
            return true;
        }
    }

    public static boolean badEnd() {
        if (oxygenPercentage - costOfBadEnd <= 0) {
            return false;
        } else {
            oxygenPercentage -= costOfBadEnd;
            return true;
        }
    }

    public static int checkOxygenPercentage() {
        return oxygenPercentage;
    }

    public static void easyMode() {
        costOfMovement = 1;
        costOfBadEnd = 5;
    }

    public static void mediumMode() {
        costOfMovement = 2;
        costOfBadEnd = 15;
    }

    public static void hardMode() {
        costOfMovement = 3;
        costOfBadEnd = 30;
    }

    public static void resetOxygenPercentage() {
        oxygenPercentage = -1000;
    }
}

