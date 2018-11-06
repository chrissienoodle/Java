public class Main {

    public static void main(String[] args) {

        //déclaration des variables
        final int LENGTH = (int)(Math.random()*100);
        final int HEIGHT = (int)(Math.random()*100);
        final char WALL = '#';
        final char PATH = ' ';
        final char START = '>';
        final char END = 'X';
        final char PLAYER = 'x';
        char board[][] = new char[HEIGHT][LENGTH];

        
        //affichage du plateau
        for (char dim1[]:board
             ) {
            for (char display:dim1
                 ) {
                System.out.print(display);
            }
            System.out.println();
        }
    }
}
