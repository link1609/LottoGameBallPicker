
public class LottoCount extends LottoGames {

    static int countNumber1 = 0;
    static int countNumber2 = 0;
    static int countNumber3 = 0;
    static int countNumber4 = 0;
    static int countNumber5 = 0;
    static int countNumber6 = 0;
    static int countNumber7 = 0;
    static int countNumber8 = 0;
    static int countNumber9 = 0;
    static int countNumber10 = 0;
    static int countNumber11 = 0;
    static int countNumber12 = 0;
    static int countNumber13 = 0;
    static int countNumber14 = 0;
    static int countNumber15 = 0;
    static int countNumber16 = 0;
    static int countNumber17 = 0;
    static int countNumber18 = 0;
    static int countNumber19 = 0;
    static int countNumber20 = 0;
    static int countNumber21 = 0;
    static int countNumber22 = 0;
    static int countNumber23 = 0;
    static int countNumber24 = 0;
    static int countNumber25 = 0;
    static int countNumber26 = 0;
    static int countNumber27 = 0;
    static int countNumber28 = 0;
    static int countNumber29 = 0;
    static int countNumber30 = 0;
    static int countNumber31 = 0;
    static int countNumber32 = 0;
    static int countNumber33 = 0;
    static int countNumber34 = 0;
    static int countNumber35 = 0;
    static int countNumber36 = 0;
    static int countNumber37 = 0;
    static int countNumber38 = 0;
    static int countNumber39 = 0;
    static int countNumber40 = 0;
    static int countNumber41 = 0;
    static int countNumber42 = 0;
    static int countNumber43 = 0;
    static int countNumber44 = 0;
    static int countNumber45 = 0;
    static int countNumber46 = 0;
    static int countNumber47 = 0;

    /**
     * This function is used to count the amount of occurrences there is for each ball using an enhanced switch
     * statement.
     */
    public static void getBallCount(){

        switch (userBall) {
            case "1" -> countNumber1 += 1;
            case "2" -> countNumber2 += 1;
            case "3" -> countNumber3 += 1;
            case "4" -> countNumber4 += 1;
            case "5" -> countNumber5 += 1;
            case "6" -> countNumber6 += 1;
            case "7" -> countNumber7 += 1;
            case "8" -> countNumber8 += 1;
            case "9" -> countNumber9 += 1;
            case "10" -> countNumber10 += 1;
            case "11" -> countNumber11 += 1;
            case "12" -> countNumber12 += 1;
            case "13" -> countNumber13 += 1;
            case "14" -> countNumber14 += 1;
            case "15" -> countNumber15 += 1;
            case "16" -> countNumber16 += 1;
            case "17" -> countNumber17 += 1;
            case "18" -> countNumber18 += 1;
            case "19" -> countNumber19 += 1;
            case "20" -> countNumber20 += 1;
            case "21" -> countNumber21 += 1;
            case "22" -> countNumber22 += 1;
            case "23" -> countNumber23 += 1;
            case "24" -> countNumber24 += 1;
            case "25" -> countNumber25 += 1;
            case "26" -> countNumber26 += 1;
            case "27" -> countNumber27 += 1;
            case "28" -> countNumber28 += 1;
            case "29" -> countNumber29 += 1;
            case "30" -> countNumber30 += 1;
            case "31" -> countNumber31 += 1;
            case "32" -> countNumber32 += 1;
            case "33" -> countNumber33 += 1;
            case "34" -> countNumber34 += 1;
            case "35" -> countNumber35 += 1;
            case "36" -> countNumber36 += 1;
            case "37" -> countNumber37 += 1;
            case "38" -> countNumber38 += 1;
            case "39" -> countNumber39 += 1;
            case "40" -> countNumber40 += 1;
            case "41" -> countNumber41 += 1;
            case "42" -> countNumber42 += 1;
            case "43" -> countNumber43 += 1;
            case "44" -> countNumber44 += 1;
            case "45" -> countNumber45 += 1;
            case "46" -> countNumber46 += 1;
            case "47" -> countNumber47 += 1;
        }
    }
    /**
     * This function is used to create a list "lottoBallCounts" which contains the amount of times each ball occurrence,
     * so it can be looped on to print the amount of times each ball appears as well as the percentage of probability
     * for each ball occurring
     */
    public static void finalTally(){

        int ballNo = 1;
        int [] lottoBallCounts = new int[]{countNumber1, countNumber2, countNumber3, countNumber4, countNumber5, countNumber6
                , countNumber7, countNumber8, countNumber9, countNumber10, countNumber11, countNumber12, countNumber13, countNumber14,
                countNumber15, countNumber16,
                countNumber17, countNumber18, countNumber19, countNumber20, countNumber21, countNumber22, countNumber23, countNumber24,
                countNumber25, countNumber26, countNumber27,
                countNumber28, countNumber29, countNumber30, countNumber31, countNumber32, countNumber33, countNumber34, countNumber35,
                countNumber36, countNumber37, countNumber38, countNumber39
                , countNumber40, countNumber41, countNumber42, countNumber43, countNumber44, countNumber45, countNumber46, countNumber47};
        for (int lottoBallCount : lottoBallCounts) {
            System.out.printf("Number %d appears: %d Times %.3f%s\n", ballNo, lottoBallCount, (100.0 / (drawAttempts * 6) * lottoBallCount), "%");
            ballNo++;
        }
    }
}
