import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       Quiz myQuiz = new Quiz();


       System.out.println("User, choose a topic:\n1. Science\n2. History\n3. Sports");
       int chosenTopic = scanner.nextInt();


       myQuiz.DetermineTopic(chosenTopic);


       myQuiz.AskQuestion();


       String answer = scanner.next();
       myQuiz.CheckAnswer(answer);
   }
}


class Quiz{
   public int topic;


   public void DetermineTopic(int chosenTopic){
       topic = chosenTopic;
   }


   public void AskQuestion(){
       switch (topic){
           case 1:
               System.out.println("What is the smallest element in the universe?");
               break;
           case 2:
               System.out.println("What year was the First Bulgarian Empire established?");
               break;
           case 3:
               System.out.println("Who has scored the most goals in Football History?");
               break;
       }
   }


   public void CheckAnswer(String answer){
       if(topic == 1 && (answer.equals("Hydrogen") || answer.equals("hydrogen") || answer.equals("H2"))){
           System.out.println("Congrats, you have guessed correctly!");
       }else if(topic == 1){
           System.out.println("Your guess is incorrect, sorry. The answer was Hydrogen");
       }


       if(topic == 2 && answer.equals("681")){
           System.out.println("Congrats, you have guessed correctly!");
       }else if(topic == 2){
           System.out.println("Your guess is incorrect, sorry. The answer was 681");
       }


       if(topic == 3 && (answer.equals("Ronaldo") || answer.equals("CR7") || answer.equals("Cristiano"))){
           System.out.println("Congrats, you have guessed correctly!");
       }else if(topic == 3){
           System.out.println("Your guess is incorrect, sorry. The answer was Ronaldo");
       }
   }
}
