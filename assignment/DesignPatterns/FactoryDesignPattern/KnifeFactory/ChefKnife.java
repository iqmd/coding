public class ChefKnife extends Knife{

    @Override
    void polish(){
        System.out.println("Chef Polishing Knife");
    }

    @Override
    void sharpen(){
        System.out.println("Chef Sharpening Knife");
    }
    @Override
    void package{
        System.out.println("Chef Packaging Knife");
    }
}
