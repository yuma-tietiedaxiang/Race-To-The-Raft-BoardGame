package comp1110.ass2;
import comp1110.ass2.Square;
import comp1110.ass2.Colour;
import comp1110.ass2.Location;

public class BigBoard {
    /*
    this is the big board formed by 4 island board.
    It records states of current game
     */

    int maxRow;
    int maxColumn;
    Location location;
    Square[][] squares = new Square[maxRow][maxColumn];//2D

    public BigBoard(int maxRow, int maxColumn){
        //initialization
    }

    public BigBoard changeState(Location location,Colour colour, boolean hasCat, boolean hasFire){
//        squares[location.getRow()][location.getColumn()].colour = colour;
    }
    public String toString(){}


}
