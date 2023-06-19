public class ClientCode {
    public static void main(String args[]){
        Hotel hotel;

        String menutype = args[0];
        HotelKeeper facade = new HotelKeeper();

        hotel = facade.hotelMenu(menutype);

        hotel.menu();

    }
}
