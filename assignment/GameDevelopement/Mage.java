public class Mage extends GameCharacter {
    private int wand;

    Mage(Mage mchar){
        super(mchar);
        if(mchar != null)
            this.wand = mchar.wand;
    }

    public GameCharacter clone(){
       return new Mage(this);
    }

    public int getWand(){
        return wand;
    }

    public void setWand(int wand){
       this.wand = wand;
    }
}
