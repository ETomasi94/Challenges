package CoderByteIntersection;

/**
 *
 * @author Enrico Tomasi
 * 
 * @OVERVIEW: (Text from CoderByte) Find Intersection 
Have the function FindIntersection(strArr) read the array of strings stored in 
* strArr which will contain 2 elements: the first element will represent a list
* of comma-separated numbers sorted in ascending order, the second element 
* will represent a second list of comma-separated numbers (also sorted). 
* Your goal is to return a comma-separated string containing the numbers that 
* occur in elements of strArr in sorted order. 
* If there is no intersection, return the string false
 */
import java.util.*; 

public class IntersectionCoderByte {

  public static String FindIntersection(String[] strArr) 
  {
    int i = 0,j = 0;

    String[] S1 = strArr[0].split(", ");
    String[] S2 = strArr[1].split(", ");
    
    StringBuilder result = new StringBuilder();
    
    while(i < S1.length && j < S2.length )
    {

      int first = Integer.parseInt(S1[i]);
      int second = Integer.parseInt(S2[j]);

      if(first == second)
      {
        result.append(first).append(",");
        i++;
        j++;
      }
      else if(first < second)
      {
        i++;
      }
      else
      {
        j++;
      }

      if(result.length() == 0)
      {
        return "false";
      }
      else
      {
        String res = result.toString().substring(0,result.toString().length()-1);
        strArr[0] = res;
      }
      
    }

    return strArr[0];
  }

  public static void main (String[] args) 
  {     
    Scanner s = new Scanner(System.in);
    String String1 = s.nextLine();
    String String2 = s.nextLine();
    
    String[] Argumnt = {String1,String2};
    
    String Result = new String();
    
    Result = FindIntersection(Argumnt);
    
    System.out.println("Intersection of strings passed by input: "+Result);
  }

}