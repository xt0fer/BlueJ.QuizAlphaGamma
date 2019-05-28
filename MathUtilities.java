 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd)
  {
      int answer = baseValue + valueToAdd;
      return answer;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd)
  {
     Double answer = baseValue + valueToAdd;
      return answer;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) 
  {
      Double answer = number / 2.0;
      return answer;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number)
  {
      Boolean answer;
      if ((number % 2) == (0)) //double couldn't be dereferenced when I used .equals()
      {
          answer = false; //even
       }
       else
       {
           answer = true; //odd
        }
      return answer;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) 
  {
      int answer = number * number;
      return answer;
  }

}
