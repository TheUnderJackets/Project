package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob, Hudson
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
      Random rn = new Random();
      String answer = "";
      Boolean notused = true;
      int[] used = new int[input.length()];
      int j = 0;
      while (j < used.length) {
      	used[j] = j;
      	j++;
      }
      int k = 0;
      for (int i = used.length - 1; i > 0; i--) {
          int index = rn.nextInt(i + 1);
          int a = used[index];
          used[index] = used[i];
          used[i] = a;
          }
      while (k < input.length()) {
      	answer = answer + input.charAt(used[k]);
      	k++;
      }
	return answer;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
