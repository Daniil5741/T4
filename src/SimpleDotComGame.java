import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numofGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = new DotCom();
        one.setName("Go2.com");
        System.out.println("Ваша цель потопить три сайта ");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов ");
        for (DotCom dotComToSet :
                dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);

        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String input = helper.getUserInput("Сделайте ход");
            checkUserGuess(input);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numofGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
              dotComList.remove(dotComToTest);
              break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну!!!");
        if(numofGuesses<=18){
            System.out.println("Это заняло у тебя всего "+ numofGuesses+" попыток. Красавччик");
        }else {
            System.out.println("Это заняло у тебя всего "+ numofGuesses+" попыток. Нуууу неплохо.....");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDotComGame game=new SimpleDotComGame();
        game.setUpGame();
        game.startPlaying();
    }
}
