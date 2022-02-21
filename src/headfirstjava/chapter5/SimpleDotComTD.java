package headfirstjava.chapter5;

public class SimpleDotComTD {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult1 = "неудачно";
        String testResult2 = "неудачно";
        String testResult3 = "неудачно";
        if (result.equals("Попал")) {
            testResult1 = "пройдено";
        }
        System.out.println("Тестирование попадания " + testResult1);
        userGuess = "1";
        result = dot.checkYourself(userGuess);
        if (result.equals("Мимо")) {
            testResult2 = "пройдено";
        }
        System.out.println("Тестирование промаха " + testResult2);
        userGuess = "3";
        result = dot.checkYourself(userGuess);
        userGuess = "4";
        result = dot.checkYourself(userGuess);
        if (result.equals("Потопил")) {
            testResult3 = "пройдено";
        }
        System.out.println("Тестирование потопления " + testResult3);
    }
}