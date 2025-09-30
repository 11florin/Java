
public class Beer {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            sing(i);
        }
        
    }
    /**
     * Method name: sing.
     * 
     * @param i (int)
     * 
     * Inside Method:
     * <i> bottles of beer on the wall, <i> bottles of beer!
     * take one down, pass it around <i-1>, bootles of beer on the wall!
     */
    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take one down, pass it around, " + (i-1) + " bottles of beer on the wall!"); 

    }
}
