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
    private static final int costOfMovement = 1;
    private static final int costOfBadEnd = 10;

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
        if (itemOne == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkItemTwo() {
        if (itemTwo == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkItemThree() {
        if (itemThree == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkItemFour() {
        if (itemFour == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPartOne() {
        if (partOne == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPartTwo() {
        if (partTwo == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkPartThree() {
        if (partThree == true) {
            return true;
        } else {
            return false;
        }
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
}

