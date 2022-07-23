import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoGames extends LottoBalls {


    static String lottoGameResult = "You lost, Better Luck Next Time ";
    static int usedBallCount = 0;


    static int matchCount;
    static int previousMatchCount;
    /**
     *  Creates a random Array of 6 numbers for the users draw. Using the lottoNumbers List created from the
     *  createBalls method. An array is used here as items don't need to be added or removed as a draw is always 6
     *  numbers.
     */
    public static void play(){

        for (int j = 0; j < userDraw.length; j++) {


            Random random = new Random();
            int choice = random.nextInt(userLottoNumbers.size());
            userBall = userLottoNumbers.get(choice);
            userLottoNumbers.remove(userBall);
            LottoCount.getBallCount();
            usedBallCount += 1;
            userDraw[j] = Integer.parseInt(userBall);
        }
        System.out.println();
        Arrays.sort(userDraw);
        System.out.println(Arrays.toString(userDraw));
        System.out.println();
    }
    /**
     * This function is for quick pick.  it starts by asking the user how many draws they would like to play.
     * Then creates 2 lists of 47 numbers for the user and computer using the createGameBalls and createBalls method
     * Then it calls the getLottoDraw to get the computers draw which then will be checked agonist the users.
     * If the userLottoNumbers size drops below 6 it is cleared and then the createBalls method is called again so
     * that there are only there are only 47 balls in the list.  The function also keeps track of the amount of
     * current rounds and the used balls by increasing the usedBallCount variable
     *
     * After the draw happens the getMatchCount method is called to get the score. if the score reaches 6 the loop
     * breaks as that is "Jackpot", the other conditions do not contain breaks because the loop would never reach
     * the desired "Draw length" or would never reach "Jackpot".
     */
    public static void lottoQuickPick() {


        Scanner input = new Scanner(System.in);
        System.out.print("How Many Draws Would you like: ");
        int quickPickDraws = input.nextInt();

        System.out.println();
        createGameBalls();
        getLottoDraw();


        for (int i = 1; i <= quickPickDraws; i++) {

            if (userLottoNumbers.size() < 6) {
                userLottoNumbers.clear();
                LottoBalls.createBalls();
            }
            System.out.println("Draw Number: " + i + "\n");
            drawAttempts++;
            play();
            getMatchCount();


            if (matchCount == 6) {
                lottoGameResult = "Congratulations You Won  The JackPot it took: " + i + " Draws";
                break;
            } else if (matchCount == 5) {
                lottoGameResult = "Congratulations You Won 2nd Prize You Matched: " + matchCount + " Balls";
                if (previousMatchCount >matchCount){
                    break;
                }

            } else if(matchCount == 4) {
                lottoGameResult = "Congratulations You Won 3rd Prize You Matched: " + matchCount + " Balls";

            } else if(matchCount == 3) {
                lottoGameResult = "Congratulations You Won 4th Prize You Matched: " + matchCount + " Balls";
            }
        }
    }
    /**
     * This function  creates 2 lists of 47 numbers for the user and computer using the createGameBalls and createBalls method
     * Then it calls the getLottoDraw to get the computers draw and is used so that the user can pick their own numbers manually.
     * This is done in a loop so that
     * the user is asked for 6 numbers which are then added to the userDraw array. The userDraw is then checked
     * against the computer draw in the matchCount which then will print the message from which ever condition is
     * met.
     */
    public static void userPickLottoNumbers(){

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < userDraw.length; i++){
            System.out.print("Enter Number between 1 and 47" + " Ball No: " + i + ": ");
            int userNumber = input.nextInt();

            userDraw[i] = userNumber;
        }
        System.out.println();
        createGameBalls();
        getLottoDraw();
        getMatchCount();

        if (matchCount == 6) {
            System.out.println(Arrays.toString(userDraw));
            System.out.println(Arrays.toString(lottoDraw));
            lottoGameResult = "Congratulations You Win ";

        } else if (matchCount == 5) {
            lottoGameResult = "Congratulations You Won 2nd Prize";

        } else if (matchCount == 4)  {
            lottoGameResult = "Congratulations You Won 3rd Prize";

        } else if (matchCount == 3) {
            lottoGameResult = "Congratulations You Won 4th Prize";
        }
    }
    /**
     * This function is uses 6 loops to count the amount of common numbers there are between the computers and users
     *  draw.  The previousMatchCount is then checked against the matchCount so that if the previousMatchCount is
     *  higher the matchCount is assigned the previousMatchCount's value.  The previousMatchCount is set to zero after
     *  the game ends to prevent the game from ending if replayed.
     */
    public static void getMatchCount(){


        previousMatchCount = 0;
        previousMatchCount = matchCount;
        matchCount = 0;
        for (int j : userDraw) {
            if (j == lottoDraw[0]) {
                matchCount += 1;
            }
        }
        for (int j : userDraw) {
            if (j == lottoDraw[1]) {
                matchCount += 1;
            }
        }
        for (int j : userDraw) {
            if (j == lottoDraw[2]) {
                matchCount += 1;
            }
        }
        for (int j : userDraw) {
            if (j == lottoDraw[3]) {
                matchCount += 1;
            }
        }
        for (int j : userDraw) {
            if (j == lottoDraw[4]) {
                matchCount += 1;
            }
        }
        for (int j : userDraw) {
            if (j == lottoDraw[5]) {
                matchCount += 1;
            }
        }
        if (previousMatchCount > matchCount){
            matchCount = previousMatchCount;
        }
    }
}
