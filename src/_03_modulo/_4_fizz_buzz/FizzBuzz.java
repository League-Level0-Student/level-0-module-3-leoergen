
package _03_modulo._4_fizz_buzz;

import java.awt.print.Printable;

import javax.swing.JOptionPane;

/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: 
*
* Instead of saying a number that is divisible by 3, say "Fizz".
* And instead of saying a number that is divisible by 5, say "Buzz".
* For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* Print your results to the console.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 21; i++) {
			 if(i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				}
		
		else if(i%5==0) {
			System.out.println("Buzz");
		}
		else if(i%3==0) {
				System.out.println("Fizz");
		}
		else{
			System.out.println(i);
		}
		}
	}
}
