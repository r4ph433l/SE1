package uebung1;

public class Client extends RomanNumberTransformer {
    public void printTransformation(int number) {
        String result = "" + super.transformNumber(number);
        System.out.println("Die römische Schreibweise der Zahl " + number + " ist: " + result);
    }

}
