public class Warrior extends GameCharacter {
    private int shield;

    Warrior(Warrior wchar){
        super(wchar);
        if(wchar != null)
            this.shield = wchar.shield;
    }

    public GameCharacter clone(){
       return new Warrior(this);
    }

    public int getShield(){
        return shield;
    }

    public void setShield(int shield){
        this.shield = shield;
    }
}
