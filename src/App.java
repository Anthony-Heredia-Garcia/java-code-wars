public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(switchItUp(8));
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        garage.park(car1);
    }

    static String[] stringToArray(String s) {
        return s.split("\\s");
    }

    static int Liters(double time) {
        return (int) Math.floor(time * .5);
    }

    static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (boolean) ((distanceToPump / mpg) <= fuelLeft);
    }

    public static String switchItUp(int number) {
        String response = "";
        switch (number) {
            case 1:
                response = "One";
                break;
            case 2:
                response = "Two";
                break;
            case 3:
                response = "Three";
                break;
            case 4:
                response = "Four";
                break;
            case 5:
                response = "Five";
                break;
            case 6:
                response = "Six";
                break;
            case 7:
                response = "Seven";
                break;
            case 8:
                response = "Eight";
                break;
            case 9:
                response = "Nine";
                break;
            case 0:
                response = "Zero";
                break;

            default:
                break;
        }
        return response;
    }

    
}
