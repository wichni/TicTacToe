public class XPiece extends Piece {
    @Override
    public String getSymbol() {
        return ColorsPiece.ANSI_RED + 'X' + ColorsPiece.ANSI_RESET;
    }
}
