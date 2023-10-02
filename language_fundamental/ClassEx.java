public class ClassEx {
    public static void main(String[] args) {
        Student std = new Student();
        std.registrationId=1290;
        std.displayReistrationId();
    }
}

class Student{
    int registrationId;
    public void displayReistrationId(){
        System.out.println("The student registration id is "+registrationId);
    }
}
