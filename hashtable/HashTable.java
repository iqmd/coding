public class HashTable{
    class DataItem{
        int key;
        int data;

        DataItem(int key, int data){
            this.key=key;
            this.data=data;
        }
        public int getKey(){
            return key;
        }
        public int getData(){
            return data;
        }
    }

    DataItem[] hashArray;
    DataItem dummy;
    int size;
    HashTable(int size){
        this.size = size;
        hashArray = new DataItem[size];
    }

    public void display(){
        for(int i =0; i < size; i++){
            if(hashArray[i] != null){
                System.out.println("Key : "+hashArray[i].getKey() + "  Data : "+hashArray[i].getData());
            }else{
                System.out.println("***");
            }
        }
    }
    public int hashfun(int key){
        return key%size;
    }
    public void insert(int key, int data){
        DataItem item = new DataItem(key,data);
        int index = hashfun(key);

        while(hashArray[index] != null && hashArray[index].getKey() != -1 ){
            index++;
            index = hashfun(index);
        }
        hashArray[index] = item;
    }
    public void delete(int data){
        for(int i =0; i < size; i++){
            if(hashArray[i] != null && hashArray[i].getData() == data){
                hashArray[i].key = -1;
                hashArray[i].data = -1;
            } 
        }
    }

}
