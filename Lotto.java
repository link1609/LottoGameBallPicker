import java.util.Arrays;
import java.util.Scanner;

public class Lotto extends LottoGames {
    /**
     * the main method is used to ask the user if they want to play and then asked do they want to pick their own numbers
     * or choose quick pick.  if the user picks quick pick the lottoQuickPick method gets called.  After completing
     * the game the user can choose to see the count for each number.
     *
     * If the number chooses to pick their own numbers, they can enter "play" which will then call the play method.
     * if the user inputs anything apart from "play" or "quick" the game will end.
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean play = true;
        while (play){
            System.out.println(LotteryArt.art);
            System.out.print("Do you want to do the Lotto: ");
            String playGame = input.nextLine();
            if (playGame.equalsIgnoreCase("Yes") || playGame.equalsIgnoreCase("y")){
                System.out.print("What Game would you like to play? Type 'Play' to pick your numbers or 'Quick' for Quick Pick Good Luck: ");
                String gameChoice = input.nextLine();

                if (gameChoice.equalsIgnoreCase("quick") || gameChoice.equalsIgnoreCase("q")){
                    previousMatchCount = 0;
                    lottoQuickPick();
                    System.out.println(lottoGameResult);
                    System.out.println("Drawn Numbers: " + Arrays.toString(lottoDraw));
                    System.out.println();
                    System.out.print("Do you Want to see the Final Tally: ");
                    String seeFinalTally = input.nextLine();
                    if (seeFinalTally.equalsIgnoreCase("Y") || seeFinalTally.equalsIgnoreCase("yes")){
                        LottoCount.finalTally();
                    }
                } else if (gameChoice.equalsIgnoreCase("play")|| gameChoice.equalsIgnoreCase("p")) {

                    userPickLottoNumbers();
                    System.out.println(lottoGameResult);
                } else {
                    System.out.println("Not a valid Option");
                    play = false;
                }
            } else{
                play = false;
                System.out.println(LotteryArt.bye);
            }
        }
    }
}


