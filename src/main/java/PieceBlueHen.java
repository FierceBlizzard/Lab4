
/**This class is represents a PieceBlueHen Piece to be used in our final project
 * The Blue Hen can attack, can befriend and can fly.
 */
public class PieceBlueHen {
    private int numAttacked;
    private int numBefriended;
    private boolean flies;  // represents whether the piece can fly
    private String symbol;
    private String teamColor;
    private boolean hidden ;
    private boolean original;

    final public int MAX_NUM_ATTACKED = 3;

    public PieceBlueHen (String symbol, String teamColor,int numAttacked, int numBefriended, boolean hidden, boolean original){
        this.symbol = symbol;
        this.teamColor = teamColor;
        this.numAttacked = numAttacked;
        this.numBefriended = numBefriended;
        this.hidden = hidden;
        this.original = original;
        updateFly();
    }

    public PieceBlueHen ()  {
        this("BH","NON", 0,0,false,true);
    }

    public String getSymbol() {
        return symbol;
    }

   public String getTeamColor() {
        return teamColor;
    }

    public int getNumAttacked()    {
        return this.numAttacked;
    }

    public int getNumBefriended(){
        return this.numBefriended;
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isOriginal() {
        return original;
    }

    public boolean canFly()    {
        return this.flies;
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
    public void setNumAttacked(int numAttacked)    {
        this.numAttacked = numAttacked;
        updateFly();
    }

    public void setNumBefriended(int numBefriended)    {
        this.numBefriended = numBefriended;
        updateFly();
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

     public void speak(){
        System.out.println("Go UD!");
    }

    private void updateFly()    {
        if (this.numAttacked < MAX_NUM_ATTACKED){
            this.flies = true;
        }
        else if (this.numBefriended < 1){
            this.flies = true;
        }
        else {
            this.flies = false;
        }
    }
    

    public boolean validPath(int firstSpaceRow, int firstSpaceCol,
                                      int secondSpaceRow, int secondSpaceCol) {
        // We will implement the code for valid paths in a later step
        // it will be different code for every type of piece
        return true;
    }

    public void attack(int fromRow, int fromCol, int toRow, int toCol){
        System.out.println("attack");
    }

    public void befriend(int fromRow, int fromCol, int toRow, int toCol){
        System.out.println("befriend");
    }

    public PieceBlueHen spawn()    {
        PieceBlueHen copyHen = new PieceBlueHen("BH".toLowerCase(),
                this.teamColor,
                this.numAttacked,
                this.numBefriended,
                false,
                false);
        return copyHen;
    }
}