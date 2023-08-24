public class Exercise_2 {

    public static void main(String[] args) {

        String myName = "Camilo";
        int myAge = 37;
        String theNameOfMyMother = "Ana";
        double myMotherAge = 55.9;
        String theNameOfMyBrother = "Diego";
        short myBrotherAge = 32;
        String myLove = "Dwallace";
        float myLoveAge = 34;

        System.out.println ("My name is " + myName + " these are my family members: " + theNameOfMyMother + " is my mother, " + theNameOfMyBrother + " is my brother and "
        + myLove + " is my wife");
        System.out.println ("I´m " + myAge + " years old. Their ages respectively are: " + myMotherAge + " ," + myBrotherAge + " and " + myLoveAge);



        char c = 'z';
        int c1 = c;
        System.out.println (c1);

        int i = 250;
        long i1 = 250L;
        short i2 = (short) i;

        System.out.println (i1);
        System.out.println (i2);

        double d = 301.067;
        long d1 = (long) d;
        System.out.println (d1);

        int a = 100;
        float a1 = (float) (a + 5000.66);
        System.out.println (a1);

        int b = 737;
        byte b1 = (byte) (b * 100);
        System.out.println (b1);

        double e = 298.638;
        long e1 = (long) (e / 25);
        System.out.println (e1);



    }
}
