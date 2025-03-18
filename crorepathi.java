import java.util.Scanner;
public class Crorepathi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reward = 1000;
        int questionNumber = 1;
        int lifeline1 = 0, lifeline2 = 0, lifeline3 = 0;
        int correctAnswer;
        System.out.println("Welcome to Crorepati Game");
        System.out.println("You have 3 LifeLines: ");
        System.out.println("1. Audience Phone");
        System.out.println("2. 50-50");
        System.out.println("3. Skip The Question\n");
        while (questionNumber <= 10) {
            System.out.println("Question " + questionNumber + " for ₹" + reward);
            if (questionNumber == 1) {
                System.out.println("Who is the Prime Minister of India?");
                System.out.println("1)Narendra Modi");
                System.out.println("2)Rahul Gandhi");
                System.out.println("3)Arvind Kejriwal");
                System.out.println("4)Sonia Gandhi");
                correctAnswer = 1;
            } 
            else if (questionNumber == 2) {
                System.out.println("What is the capital of India?");
                System.out.println("1)Mumbai");
                System.out.println("2)New Delhi");
                System.out.println("3)Chennai");
                System.out.println("4)Bangalore");
                correctAnswer = 2;
            } 
            else if (questionNumber == 3) {
                System.out.println("Who wrote the Bhagavad Gita?");
                System.out.println("1)Valmiki");
                System.out.println("2)Kalidasa");
                System.out.println("3)Ved Vyasa");
                System.out.println("4)Tulsidas");
                correctAnswer = 3;
            }
            else if (questionNumber == 4) {
                System.out.println("Which planet is known as the Red Planet?");
                System.out.println("1)Jupiter");
                System.out.println("2)Venus");
                System.out.println("3)Mars");
                System.out.println("4)Saturn");
                correctAnswer = 3;
            }
            else if (questionNumber == 5) {
                System.out.println("Who discovered Gravity?");
                System.out.println("1)Isaac Newton");
                System.out.println("2)Albert Einstein");
                System.out.println("3)Nikola Tesla");
                System.out.println("4)Galileo Galilei");
                correctAnswer = 1;
            }
            else if (questionNumber == 6) {
                System.out.println("Which animal is known as the Ship of the Desert?");
                System.out.println("1)Horse");
                System.out.println("2)Donkey");
                System.out.println("3)Camel");
                System.out.println("4)Elephant");
                correctAnswer = 3;
            }
            else if (questionNumber == 7) {
                System.out.println("What is the largest mammal on Earth?");
                System.out.println("1)Elephant");
                System.out.println("2)Blue Whale");
                System.out.println("3)Shark");
                System.out.println("4)Tiger");
                correctAnswer = 2;
            }
            else if (questionNumber == 8) {
                System.out.println("Which is the national bird of India?");
                System.out.println("1)Peacock");
                System.out.println("2)Sparrow");
                System.out.println("3)Eagle");
                System.out.println("4)Pigeon");
                correctAnswer = 1;
            }
            else if (questionNumber == 9) {
                System.out.println("Who was the first man to step on the moon?");
                System.out.println("1)Neil Armstrong");
                System.out.println("2)Kalpana Chawla");
                System.out.println("3)Rakesh Sharma");
                System.out.println("4)Yuri Gagarin");
                correctAnswer = 1;
            }
            else {
                System.out.println("What is the capital of Karnataka?");
                System.out.println("1)Mysore");
                System.out.println("2)Mangalore");
                System.out.println("3)Bangalore");
                System.out.println("4)Hubli");
                correctAnswer = 3;
            }
            System.out.println("\n Do you want to use any lifeline?(y/n)");
            char lifeChoice = sc.next().charAt(0);
            if (lifeChoice == 'y' || lifeChoice == 'Y') {
                System.out.println("Available Lifelines Are: ");
                if (lifeline1 == 0) System.out.println("1.Audience Phone");
                if (lifeline2 == 0) System.out.println("2.50-50");
                if (lifeline3 == 0) System.out.println("3.Skip The Question");
                System.out.print("Enter the lifeline number (1 to 3): ");
                int lifelines = sc.nextInt();
                if (lifelines == 1 && lifeline1 == 0) {
                    System.out.println(" Audience says the answer is: " + correctAnswer);
                    lifeline1 = 1;
                } 
                else if (lifelines == 2 && lifeline2 == 0) {
                    System.out.println("50-50: ");
                    System.out.println("1) " + correctAnswer);
                    System.out.println("2) Random Option");
                    lifeline2 = 1;
                }
                else if (lifelines == 3 && lifeline3 == 0) {
                    System.out.println("Skipping this Question.");
                    lifeline3 = 1;
                    questionNumber++;
                    reward *= 2;
                    continue;
                }
                else {
                    System.out.println(" Already Used This");
                }
            }
            System.out.print("Enter your Answer (1 to 4): ");
            int answer = sc.nextInt();
            if (answer == correctAnswer) {
                System.out.println("Correct Answer And You won ₹" + reward);
                reward *= 2;
            } else {
                System.out.println("Wrong Answer! Game Over.");
                System.out.println(" You Won ₹" + reward/2);
                break;
            }
            questionNumber++;
        }
        System.out.println("Thank you for Playing Crorepati Game");
    }
}
