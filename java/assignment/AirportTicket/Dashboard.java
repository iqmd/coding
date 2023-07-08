import java.util.ArrayList;
public class Dashboard {
    private ArrayList<String> option;

    Dashboard(){
        option = new ArrayList<>();
        addOption("verify Reservation");
        addOption("Get Preferences");
        addOption("Check Baggage");
        addOption("Boarding Pass");
    }



    public void options(){
        for(int i = 0 ; i < option.size(); i++){
            System.out.println(option.get(i));
        }
    }

    public void addOption(String option){
        int len = this.option.size()+1;
        String st = len + " " + option;
        this.option.add(st);
    }

    public void  selectedOption(int num){
        switch(num){
            case 1:
                Reservation stat = new Reservation();
                stat.printIssueStatus();
                break;

            case 2:
                Preferences prefs = new Preferences();
                prefs.getAllPreferences();
                break;

            case 3:
                Baggage bggs = new Baggage();
                bggs.checkBaggage();
                break;
            case 4:
                BoardingPass pass = new BoardingPass();
                System.out.println(pass.getBoardingPass());
        }
    }

}
