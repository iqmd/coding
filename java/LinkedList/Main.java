public class Main{
    public static void main(String args[]){
        int StudentMarks[] = {45,56,78,89,99,23,12,34,67,35};
        LinkedList marks = new LinkedList();

        System.out.println("Marks of students: ");
        for(int i = 0; i < StudentMarks.length; i++){
            marks.add(StudentMarks[i]);
        }
        marks.print();
        marks.bubblesort();

        System.out.println("Sorted Marks of students: ");

        marks.print();
        
    }
}
