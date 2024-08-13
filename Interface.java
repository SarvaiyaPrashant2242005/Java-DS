public class Interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        King k1 = new King();

        q1.moves();
        k1.moves();
    }

}

interface ChessPlayer{
    public void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println(" > moving freely up and down on any file and left and right on any ran");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println(" > The king can move only one square horizontally, vertically, or diagonally");
    }
}