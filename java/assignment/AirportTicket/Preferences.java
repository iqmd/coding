
public class Preferences {
    private String pref1 = "p1";
    private String pref2 = "p2";

    public void getAllPreferences(){
        System.out.println(pref1);
        System.out.println(pref2);
    }
    public void printBP(){
        BoardingPass bp = new BoardingPass();
        bp.getBoardingPass();
    }
    public void travelDocuments(){
        System.out.println("All documents listed here ");
    }
}
