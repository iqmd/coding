public class PetStore {
    private ArrayList<Pet> pet;


    PetStore(){
        pet = new ArrayList<>();

    }

    public void addPet(Pet mypet){
        pet.add(mypet);
    }
}
