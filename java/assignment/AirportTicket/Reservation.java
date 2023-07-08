public class Reservation {
    private boolean issueStatus = true;

    private AirportTravelAgency messg = new AirportTravelAgency();

    public boolean getIssueStatus(){
        return issueStatus;
    }

    public void printIssueStatus(){
        if(getIssueStatus()==true){
            System.out.println("Reservation Ok");
        }else{
            messg.display();
        }
    }

    public void setIssueStatus(boolean flag){
        this.issueStatus = flag;
    }

}
