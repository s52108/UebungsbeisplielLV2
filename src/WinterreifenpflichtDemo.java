public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        int temperatur = 5;
        boolean rutschigeFahrbahn = false;

        isWinterreifenPflicht(isWinterreifenPflicht(temperatur, rutschigeFahrbahn));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        if (temperatur < 4) {
            return true;
        } else if (temperatur < 10 && rutschigeFahrbahn) {
            return true;
        } else
            return false;

    }

    public static void isWinterreifenPflicht(boolean info) {

        if (info) {
            System.out.println("Bitte Winterreifen verwenden.");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich.");
        }
    }
}
