package headfirstjava.chapter7.monsters;

public class Vampire extends Monster {
    boolean frighten(byte b) {
        System.out.println("Укусить?");
        return true;
    }
}
