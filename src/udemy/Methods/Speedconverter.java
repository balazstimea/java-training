package udemy.Methods;

public class Speedconverter {
    public static void main(String[] args) {

        long x = toMilesPerHour(30);
        System.out.println(x);

        printConversion(3);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static double printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h=" + milesPerHour +
                    " mi/h");
        }
        return kilometersPerHour;
    }


}


