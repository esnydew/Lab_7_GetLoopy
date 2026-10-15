public class Task6ShrinkingAsteriskSquare {
    static void main(String[] args) {
        for(int row = 5; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                if(col < row) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}