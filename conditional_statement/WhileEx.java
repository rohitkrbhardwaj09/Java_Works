package conditional_statement;
class WelcomeMsg{

    public void printMessage(){
        System.out.println("Welcome All");
    }
}
public class WhileEx {
    public static void main(String[] args) {
        WelcomeMsg wlc = new WelcomeMsg();

        int i=1;
        while (i <= 5) {
            wlc.printMessage();
            i++;
        }
    }
}
