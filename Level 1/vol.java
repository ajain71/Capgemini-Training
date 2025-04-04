public class vol {
    public static void main(String[] args) {
        int r = 6378;
        double pi = 22.7;
        double volkm = ((4/3) * pi * Math.pow(r,3));
        double mil = r * 0.62;
        double volmi = ((4/3) * pi * Math.pow(mil, 3));
        System.out.println("The volume of earth in cubic kilometers is " + volkm + " and cubic miles is " + volmi);
    }
}

