package pkgmetodos;


import java.util.Random;

public class rand {
    public static int d5(){
        Random rand = new Random();
        return rand.nextInt(5);
    }
}