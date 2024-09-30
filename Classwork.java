public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(delEnd("library",1));
    System.out.println(compareLower("bahahahaha", "ziggs"));
    System.out.println(lengthFirst("I think this should work."));
  }

  public static String firstLastN(String word, int n)
  {
    String output = new String();
    String firstN = word.substring(0, n);
    int indexOfNthToLast = word.length() - n; 
    String lastN =  word.substring(indexOfNthToLast);
    
    output = firstN + lastN; 
    return output;
  }
  public static String delEnd(String word, int n)
  {
    String output = new String();
    int indexLast = word.length() - n ;

    output = word.substring(0,indexLast);
    return output;
  }

  public static int compareLower(String w1, String w2)
  {
    int output;
    output = w1.compareTo(w2);
    return output;
  }

  public static int lengthFirst(String s)
  {
    int output; 
    output = (s.substring(0, (s.indexOf(" ")))).length();
    return output;
  }
}
