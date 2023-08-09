public abstract class GameCharacter {
    private String name;
    private int health;
    private int attack_power;

    public GameCharacter(){}

    public GameCharacter(GameCharacter gchar){
        this.name = gchar.name;
        this.health = gchar.health;
        this.attack_power = gchar.attack_power;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }
    public int getAttackPower(){
        return attack_power;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public void setAttackPower(int attack_power){
        this.attack_power = attack_power;
    }


    public abstract GameCharacter clone();
}
