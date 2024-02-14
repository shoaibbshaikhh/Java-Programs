/* Q.1) Write a Java program to display all the alphabets between ‘A’ to ‘Z’ after every 2
seconds. */

public class AlphabetDisplay {
    public static void main(String[] args) {
        int startAscii = 65;
        int endAscii = 90;

        while (startAscii <= endAscii) {
            char alphabet = (char) startAscii;
            System.out.print(alphabet + " ");

            startAscii++;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Watch Full Setup on YouTube @S2CoderZ link in the Bio.
