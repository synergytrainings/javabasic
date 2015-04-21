public class Triangles {

    public static final char SYMBOL = '*';
    public static final int LENGTH = 2;
    public static final char SYMBOLS_SEPERATOR = ' ';
    public static final double GO_TO_NEXT_ROW = 0.5;

    public static void main(String[] args) {

        int triangleLength = 15;
        printTriangle(triangleLength);


    }

    public static void printTriangle(int triangleLength) {

        double start = (double) triangleLength/2 - GO_TO_NEXT_ROW;
        int  count = 1;
        while(start >= 0) {


            for(int i=0 ;i<start*LENGTH ;i++) {
                for (int j=0;j<LENGTH;j++ ) {
                    System.out.print(SYMBOLS_SEPERATOR);

                }
            }
            for (int i=0;i<count;i++) {
                System.out.print(SYMBOL);
                for (int j=0;j<LENGTH+1;j++ ) {
                    System.out.print(SYMBOLS_SEPERATOR);
                }
            }
            System.out.println();
            start -= GO_TO_NEXT_ROW;
            count++;
        }

    }
}
