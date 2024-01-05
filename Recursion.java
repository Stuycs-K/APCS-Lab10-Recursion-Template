public class Recursion{
  
  
  /*Print all words that are made of the characters in the array of letters.
    *There may not be consecutive equal letters, so:
    *aax is not allowed, but axa is allowed.
    *@param length : the length of the words that are to be printed
    *@param letters: the letters you should be using
    *@precondition: letters contains at least 2 characters, and has no duplicates.
    */
    public static void printNoDoubleLetterWords(int length,String letters){
      //do not change this method
      printNoDoubleLetterWords(length,"",letters);
    }

    /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
    *aax is not allowed, but axa is allowed.
    *@param length : either how many more letters need to be
    *@param word   : the partial word so far.
    *@param letters: the letters you should be using
    */
    public static void printNoDoubleLetterWords(int length,String word, String letters){
      //WRITE THIS METHOD
    }

    /*Convert the integer to a String containing English words that are used to say the number.
    * toWords(0) returns "zero"
    * toWords(340) returns "three hundred and forty"
    * toWords(1000430) returns: "one million four hundred and thirty"
    * toWords(-2101000442) returns: "negative two billion one hundred one million four hundred and forty-two"
    */
    public static String toWords(int n){

    }
}
