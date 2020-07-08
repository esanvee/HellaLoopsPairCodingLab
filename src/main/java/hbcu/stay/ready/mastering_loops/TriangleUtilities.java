package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {package hbcu.stay.ready.mastering_loops;
public class TriangleUtilities {
    public static String getTriangle(int numberOfRows) {
        String r = "";
        for(int i = 0; i < numberOfRows; i++)
        {
            for(int j = 0; j < numberOfRows; j++)
            {
                r = r + "*";
            }
            System.out.println();
        }
        return r;
    }
    public static String getRow(int numberOfStars) {
        for (int i = 0; i < 10; i++)
        {
            System.out.print("*");
        }
    }
    public static String getSmallTriangle() {
        //
        int i, j;
        for(i = 0; i<4; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return "*";
    }
    public static String getLargeTriangle() {
        int i, j;
        for(i = 0; i<10; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return "*";
    }
}

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int numberOfStars) {
        return null;
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
