import java.util.*;

public class Main{
    public static void main(String[] args) {

        List<GameCharacter> characters = new ArrayList<>();
        List<GameCharacter> characterCopy = new ArrayList<>();
        Archer archer = new Archer();
        archer.setName("Green Arrow");
        archer.setHealth(10);
        archer.setAttackPower(20);
        archer.setArrow(100);

        characters.add(archer);

        GameCharacter character = (Archer) archer.clone();

    }
}
