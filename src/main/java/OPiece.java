public class OPiece extends Piece {

    @Override
    public String getSymbol() {
        return ColorsPiece.ANSI_BLUE + 'O' + ColorsPiece.ANSI_RESET;
    }
}
