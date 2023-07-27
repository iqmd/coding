public class KnifeFactory {
    public Knife createKnife(String KnifeType){
        Knife knife;

        switch(KnifeType){
            case "chef":
                knife = new ChefKnife();
                break;
            case "butcher":
                knife = new ButcherKnife();
                break;
        }

        return knife;
    }
}
