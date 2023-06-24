public class Book {
    private int id;
    private String name;
    private String author;
    private String category;
    private String returnDate;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }
    public String getReturnDate(){
        return returnDate;
    }


    public  void setId(int id){
         this.id = id;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public  void setCategory(String category){
        this.category= category;
    }
    public void  setReturnDate(String date){
         returnDate=date;
    }


}


