import java.util.Scanner;
import java.util.TreeSet;

public class EmailList {

    static int checkMail(String userInput){
        String startEmailName = " ";
        String endEmailName = "@";
        String emailName = userInput.substring(userInput.indexOf(startEmailName) + 1, userInput.indexOf(endEmailName));
        String endAddress = ".";
        String address = userInput.substring(userInput.indexOf(endEmailName) + 1, userInput.indexOf(endAddress));
        String end = userInput.substring(userInput.indexOf(endAddress) + 1, userInput.length());
        String fullAddress = emailName + "@" + address + "." + end;
        String userInputEmail = userInput.substring(userInput.indexOf(startEmailName) + 1, userInput.length());

        if(fullAddress.equals(userInputEmail)) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        TreeSet<String> setNames = new TreeSet<>();
        while (true) {
            System.out.print("Команды(ADD, LIST)\nДобавить почту(ADD example@mail.com):");
            String userInput = new Scanner(System.in).nextLine();
            int num = checkMail(userInput);
            if (userInput.contains("ADD")) {
                if (num == 1) {
                    setNames.add(userInput + "\n");
                }
            }
            if (userInput.equals("LIST")) {
                for (String currentEmail : setNames) {
                    System.out.print(currentEmail);
                }
            }
        }
    }
}