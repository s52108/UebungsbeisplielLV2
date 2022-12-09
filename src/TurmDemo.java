public class TurmDemo {
    public static void main(String[] args) {
        int i = 2;
        int j = 9;
        int sum = 2;

        while (i < j) {

            System.out.println(sum + " * " + i + " = " + sum * i);
            sum = sum * i;
            i++;
        }
    }
}
