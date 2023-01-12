public class Comments {
    public static void main(String[] args) {
        // Hi I'm a single line comment

        /* Hello,
        * I am a comment
        * I can be more detailed
        * when necessary
        */


        /** 
         * These two little stars above
         * is to identify that you
         * intends to write a comment
         * at the documentation level.
         * Amazing !!!
         */

    }


    //How not to use comments:

    /*
    * This method was elaborated in a hurry
    * that's why I abbreviated the variable names
    * but look, it has the purpose of adding or multiplying
    * two numbers
    */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r is equal to the result
        if (m == "M"){ // M= multiplication
            r= n * x;
        }else{
            // if not, add it
            r = n + x;
        }
        return r;
    }
}