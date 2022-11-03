package task_3;
/**
 * Assignment task 3: User Input Validation
 * Author: Aadil Imran, 2022
 */

import static java.lang.System.*;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(in);
	public static void main(String[] args) {
		readInputWithLoop();
	}
	
	public static void readInputWithLoop() {
		double score;
		String grade = "";
		while(true) { //read input with validation
			out.print("Enter a score: ");
			score = Integer.parseInt(input.nextLine());
			if(score >= 0 && score <=100) {
				break;
			} else {
				out.print("Invalid score \n");
			}
		}
		if(score >= 0 && score < 50) {
			grade = "D";
		} else if(score >= 50 && score < 70) {
			grade = "C";
		} else if(score >= 70 && score < 80) {
			grade = "B";
		} else if(score >= 80 && score <= 100) {
			grade = "A";
		}
		out.printf("Score %.1f will recieve grade %s", score, grade);
	}
}
