public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(zeroFuel(100, 50, 1));
    }

    static String[] stringToArray(String s){
        return s.split("\\s");
    }

    static int Liters (double time) {
        return (int)Math.floor(time * .5);
    }

    static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft){
        return (boolean)((distanceToPump/mpg) <= fuelLeft);
    }
}
