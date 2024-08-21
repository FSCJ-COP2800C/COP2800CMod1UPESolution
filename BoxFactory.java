// BoxFactory.java
// Iam A. Programmer
// 6/21/22
// Program which represents a box factory

public class BoxFactory {

    // constants
    public static final int NUMBER_OF_BOXES = 3;
    public static final String COL_RED = "RED";
    public static final String COL_GREEN = "GREEN";
    public static final String COL_BLUE = "BLUE";

    public static void main(String[] args) {
        // print box factory attributes
        System.out.println("Box Factory contains " + 
                            NUMBER_OF_BOXES + " boxes.");
        System.out.println("First box is a " + COL_RED + " box.");
        System.out.println("Second box is a " + COL_GREEN + " box.");
        System.out.println("Third box is a " + COL_BLUE + " box.");
    }
}
