
/**This class is represents a PieceScoobyDoo Piece to be used in our final project
        * The ScoobyDoo can befriend, get entangled but cannot attack.
        */

public class PieceScoobyDoo {

    private String symbol;
    private String teamColor;
    private int numBefriended;
    private int numScoobySnacks;
    private boolean hidden ;
    private boolean canMove;
    private boolean original;

    public PieceScoobyDoo(String symbol, String teamColor, int numBefriended,
                          int numScoobySnacks, boolean hidden, boolean canMove, boolean original) {
        this.symbol = symbol;
        this.teamColor = teamColor;
        this.numBefriended = numBefriended;
        this.numScoobySnacks = numScoobySnacks;
        this.hidden = hidden;
        this.canMove = canMove;
        this.original = original;
    }

    public PieceScoobyDoo() {
        this("S","NON", 0,0,
                false,true,true);
    }

    public String getSymbol() {
        return symbol;
    }

   public String getTeamColor() {
        return teamColor;
    }

    
    public int getNumBefriended(){
        return this.numBefriended;
    }

    public int getNumScoobySnacks() {
        return numScoobySnacks;
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isOriginal() {
        return original;
    }

    public boolean isEntangled() {
        return !canMove;
    }

    public boolean canSpawn() {
        return original;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public void setNumBefriended(int numBefriended)    {
        this.numBefriended = numBefriended;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void entangle() {
        this.canMove = false;
    }
    public void speak() {
        System.out.println("Scooby-Dooby-Doo!");
    }

    private void eatScoobySnack(){
        if (this.numScoobySnacks > 0){
            this.numScoobySnacks -= 1;
            this.canMove = true;
        }
    }

    public void collectScoobySnacks(int numSnacks){
        if (numSnacks >= 0) {
            this.numScoobySnacks += numSnacks;
            eatScoobySnack();
        }
    }
    
    public boolean validPath(int firstSpaceRow, int firstSpaceCol,
                             int secondSpaceRow, int secondSpaceCol) {
        // We will implement the code for valid paths in a later step
        // it will be different code for every type of piece
        return false;
    }

    public void befriend(int fromRow, int fromCol, int toRow, int toCol){
        System.out.println("befriend");
    }

    public PieceScoobyDoo spawn(){
        PieceScoobyDoo scrappy = new PieceScoobyDoo(
                "SD".toLowerCase(),
                this.teamColor,
                this.numBefriended,
                this.numScoobySnacks,
                false,
                true,
                false);
        return scrappy;
    }

}
