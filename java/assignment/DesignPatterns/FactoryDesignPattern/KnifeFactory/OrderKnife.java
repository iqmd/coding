public class KnifeStore {
    private  KnifeFactory factory = null;

    public KnifeStore(KnifeFactory factory){
        this.factory = factory;
    }

    public Knife orderKnife(String KnifeType){
        Knife knife;

        knife = factory.createKnife(KnifeType);

        knife.sharpen();
        knife.polish();
        knife.package();

        return knife;
    }

}
