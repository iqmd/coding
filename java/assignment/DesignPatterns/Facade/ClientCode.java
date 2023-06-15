public class ClientCode {
    public static void main(String args[]){
        Hotel hotel;

        String menutype = ClientUtil.takeInput();
        HotelKeeper facade = new HotelKeeper();

        hotel = facade.hotelMenu(menutype);

        hotel.menu();

    }
}
