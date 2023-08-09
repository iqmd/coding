public class Archer extends GameCharacter {
    private int arrow;

    public Archer(){
    }

    public Archer(Archer archar){
        super(archar);
        if(archar != null)
            this.arrow = archar.arrow;
    }


    public GameCharacter clone(){
       return new Archer(this);
    }

    public int getArrow(){
        return arrow;
    }

    public void setArrow(int arrow){
        this.arrow = arrow;
    }
}
