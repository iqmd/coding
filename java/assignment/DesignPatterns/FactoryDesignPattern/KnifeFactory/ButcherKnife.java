public class ButcherKnife extends Knife{

    @Override
    void polish(){
        System.out.println("Butcher Polishing Knife");
    }

    @Override
    void sharpen(){
        System.out.println("Butcher Sharpening Knife");
    }
    @Override
    void package{
        System.out.println("Butcher Packaging Knife");
    }
}
