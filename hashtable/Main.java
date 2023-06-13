public class Main{
    public static void main(String args[]){
        HashTable nums = new HashTable(10);
        nums.insert(1,4);
        nums.insert(2,7);
        nums.insert(6,10);
        nums.insert(7,53);
        nums.insert(25, 100);
        nums.insert(7,34);
        nums.display();
        nums.delete(10);
        nums.display();
    }
}

