import java.util.Random;
import java.util.Scanner;

public class Testing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Enter your name: ");
    String name = input.nextLine().toUpperCase();
    System.out.println(name + " Welcome to my maths test");
    System.out.println();
    String[] operators = {"-", "+", "/", "*"};
    int score = 0;
    int Answer = 0;

    for (int i = 1; i <= 5; i++) {
      int num1 = random.nextInt(10) + 1;
      int num2 = random.nextInt(10) + 1;
      String operator = operators[random.nextInt(operators.length)];


      switch (operator) {
        case "-":
          Answer = num1 - num2;
          break;
        case "+":
          Answer = num1 + num2;
          break;
        case "/":
          Answer = num1 / num2;
          break;
        case "*":
          Answer = num1 * num2;
          break;
      }

      System.out.println("Question " + i + ": What is " + num1 + " " + operator + " " + num2 + "?");
      int userAnswer = input.nextInt();
      if (userAnswer == Answer)
        score++;
    }
    if (score < 3)
      System.out.println(name + " your final score is: " + score + " STOP PLAYING AND STUDY MORE");
    else
      System.out.println( name + "Your final score is: " + score);
  }
}
