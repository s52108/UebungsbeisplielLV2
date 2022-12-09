public class NotenDemo {
    public static void main(String[] args) {
        int punkte = 85;
        System.out.println(getNotentext(punkte));

    }

    public static String getNotentext(int punkte) {
        String notentext = null;
        if (punkte < 50) {
            notentext = "Ungenügend";
        } else if (punkte < 65) {
            notentext = "Genügend";
        } else if (punkte < 78) {
            notentext = "Befriedigend";
        } else if (punkte < 90) {
            notentext = "Gut";
        } else {
            notentext = "Sehr Gut";
        }
        return notentext;


    }
}
