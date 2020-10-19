

public class student {
    int rollNumber;
    String Name;
        void display (){
        System.out.println("roll number" + rollNumber);
        System.out.println("name" + Name);
        }
    public static void main(String[] args){
       student ram= new student();
        ram.rollNumber = 1;
        ram.Name ="Ram";
        ram.display();

        student shyam = new student();
        shyam.rollNumber = 2;
        shyam.Name = "shyam";
        shyam.display();
        


    }
    
}