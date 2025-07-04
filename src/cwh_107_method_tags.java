/**
 * This is a good class
 */

public class cwh_107_method_tags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am a main method");
    }
    /**
     *
     * @param i This is the first number to be added
     * @param j This is the second number to be added
     * @return Sum of two numbers as an integer
     * @throws Exception if i is zero
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception {
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;

    }
}
