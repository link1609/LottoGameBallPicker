import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoBalls {
    static int drawAttempts = 0;


    static String userBall;
    
    static String lottoBall;
    static List<String> lottoNumbers = new ArrayList<>();
    static int[] userDraw = new int[6];
    static int[] lottoDraw = new int[6];
    static List<String> userLottoNumbers = new ArrayList<>();
    /**
     * Creates a List of 47 numbers for the user.  Using a loop so numbers don't need to manually be added.
     * Which will later be used to pick random numbers.
     * A list is used here so that balls can later be removed to avoid duplicates and then be recreated when needed
     * to avoid out of bounds errors.
     */

    public static void createBalls(){


        for (int i = 1; i <= 47; i++){
            userLottoNumbers.add(i + "");
        }
    }
    /**
     * Creates a list of 47 numbers for the computer, to pick random numbers.  List is used to remove numbers to
     * avoid duplicates
     */
    public static void createGameBalls(){

        for (int i = 1; i <= 47; i++){
            lottoNumbers.add(i + "");
        }
    }
    /**
     *  Creates a random Array of 6 numbers for the computers draw. Using the lottoNumbers List created from the
     *  createGameBalls method. An array is used here as items don't need to be added or removed as a draw is always 6
     *  numbers.
     */
    public static void getLottoDraw(){


        System.out.println("Draw Numbers");
        Random random = new Random();
        for (int i = 0; i < lottoDraw.length; i++){
            int gameGameChoice = random.nextInt(lottoNumbers.size());
            lottoBall = lottoNumbers.get(gameGameChoice);
            lottoDraw[i] = Integer.parseInt(lottoBall);
            System.out.println("Ball Number " + i + ": " + lottoDraw[i]);
            lottoNumbers.remove(gameGameChoice);
        }
        Arrays.sort(lottoDraw);
        System.out.println(Arrays.toString(lottoDraw));
    }
}
