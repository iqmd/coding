public class HotelKeeper implements HotelKeeperInterface{
    public Hotel hotelMenu(String menu){
        if(menu.equalsIgnoreCase("veg")){
            return new Veg();
        }else if(menu.equalsIgnoreCase("nonveg")){
            return new NonVeg();
        }else if (menu.equalsIgnoreCase("vegnonboth")){
            return new VegNonBoth();
        }else{
            return null;
        }

    }
}
