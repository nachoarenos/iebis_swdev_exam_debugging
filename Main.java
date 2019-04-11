import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replace(".", "/");

        Random rand = new Random();
        StringBuffer word = new StringBuffer();
        int number;
        number = rand.nextInt(3);
        switch (number) {
            case 0: word = new StringBuffer("Your");
            case 1: word = new StringBuffer("Four");
            case 2: word = new StringBuffer("Tour");
        }

        System.out.println(word + " " + formattedEmailAddress);
    }
}
