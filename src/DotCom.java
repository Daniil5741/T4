import java.util.ArrayList;
import java.util.Arrays;

public class DotCom {
    int numofHits;
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {

            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Вы потопили "+ name+"  :  (");
            } else {
                result = "Попал";
            }
        }

        System.out.println(result);
        return result;
    }


}
