import java .util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] entertainmentQ = new String [10];
        String [] entertainmentA = new String [40];
        String [] historyQ = new String [10];
        String [] historyA = new String [40];
        String [] scienceAndNatureQ = new String [10];
        String [] scienceAndNatureA = new String [40];
        String [] sportsAndLeisureQ = new String [10];
        String [] sportsAndLeisureA = new String [40];
        String [] geographyQ = new String [10];
        String [] geographyA= new String [40];
        String [] name = new String [4];
        int [] score = new int[4];
        score [0] = 0;
        score [1] = 0;
        score [2] = 0;
        score [3] = 0;


        questions1 questions1 = new questions1();
        questions1.q(entertainmentQ,entertainmentA,historyQ,historyA,scienceAndNatureQ,scienceAndNatureA,sportsAndLeisureQ,sportsAndLeisureA,geographyQ,geographyA);
        int players = 0;
        do{
            System.out.println("Type the number of players 1-4");
            players = sc.nextInt();
        }while(players != 1 && players != 2 && players != 3 && players != 4 );

        sc.nextLine();
        for(int w = 0; w< players; w++)
        {
            System.out.println("Player " + (w + 1) + " enter your name");
            name[w] = sc.nextLine();
        }
        for(int q=1; q<13; q++){
            int q1 = ThreadLocalRandom.current().nextInt(5);
        int q2 = ThreadLocalRandom.current().nextInt(5);
            char choice2 = ' ';
          char choice = ' ';
          if(players==1){
            System.out.println(name[0]);
          }
          if(players == 2){
            if(q%2 == 0){
                System.out.println(name[1]);
            }
            else if(q%2 == 1){
                System.out.println(name[0]);
            }
          }
          if(players==3){
            if(q%3==0){
                System.out.println(name[2]);
            }
            else if(q%3==2)
            {
                System.out.println(name[1]);
            }
            else{
                System.out.println(name[0]);
            }
          }
          if(players==4){
            if(q%4==0)
            {
                System.out.println(name[3]);
            }
            else if(q%4==3)
            {
                System.out.println(name[2]);
            }
            else if(q%4==2)
            {
                System.out.println(name[1]);
            }
            else{
                System.out.println(name[0]);
            }
          }
        int a = 1;
       for(int i = 0; i<a; i++)
       {
        if(q1 == q2)
        {
            q2 = ThreadLocalRandom.current().nextInt(4);
            a++;
        }
        else{}

       }
       if(q1==0)
       {
        System.out.println("Press A for Entertainment ");
       }
           else if(q1==1)
       {
        System.out.println("Press A for History ");
       }
          else  if(q1==2)
       {
        System.out.println("Press A for Sports and Leisure ");
       }
          else  if(q1==3)
       {
        System.out.println("Press A for Science and Nature ");
       }
          else  if(q1==4)
       {
        System.out.println("Press A for Geography ");
       }


              if(q2==0)
       {
        System.out.println("Press D for Entertainment");
       }
           else if(q2==1)
       {
        System.out.println("Press D for History");
       }
          else  if(q2==2)
       {
        System.out.println("Press D for Sports and Leisure");
       }
          else  if(q2==3)
       {
        System.out.println("Press D for Science and Nature");
       }
            if(q2==4)
       {
        System.out.println("Press D for Geography");
       }


       if(q1==0)
       {
do {
    choice = sc.nextLine().charAt(0);
} while (choice != 'A' && choice != 'a' && choice != 'D' && choice != 'd');

        
        if(choice=='A' || choice =='a'){
                    entertainment entertainment = new entertainment();
  entertainment.displayQuestionsAndAnswers(entertainmentQ, entertainmentA, score, players, name);
              for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
        else if(choice=='D'|| choice=='d'){
            choice2 = 'D';
        }
       }
           else if(q1==1)
       {
do {
    choice = sc.nextLine().charAt(0);
} while (choice != 'A' && choice != 'a' && choice != 'D' && choice != 'd');

        if(choice=='A' || choice =='a'){
         history history = new history();
        history.displayQuestionsAndAnswers(historyQ, historyA, score, players, name);
                    for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
        else if(choice=='D'|| choice=='d'){
            choice2 = 'D';
        }
       }
          else  if(q1==2)
       {
do {
    choice = sc.nextLine().charAt(0);
} while (choice != 'A' && choice != 'a' && choice != 'D' && choice != 'd');

        if(choice=='A' || choice =='a'){
sportsandleisure sportsandleisure = new sportsandleisure();
sportsandleisure.displayQuestionsAndAnswers(sportsAndLeisureQ, sportsAndLeisureA, score, players, name );
            for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
        else if(choice=='D'|| choice=='d'){
            choice2 = 'D';
        }
       }
          else  if(q1==3)
       {
do {
    choice = sc.nextLine().charAt(0);
} while (choice != 'A' && choice != 'a' && choice != 'D' && choice != 'd');

        if(choice=='A' || choice =='a'){
scienceandnature scienceAndNature = new scienceandnature();
scienceAndNature.displayQuestionsAndAnswers(scienceAndNatureQ, scienceAndNatureA, score, players, name);
            for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
        else if(choice=='D'|| choice=='d'){
            choice2 = 'D';
        }
       }
          else  if(q1==4)
       {
do {
    choice = sc.nextLine().charAt(0);
} while (choice != 'A' && choice != 'a' && choice != 'D' && choice != 'd');

        if(choice=='A' || choice =='a'){
            geography geography = new geography();
            geography.displayQuestionsAndAnswers(geographyQ, geographyA, score, players, name);
                        for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
        else if(choice=='D'|| choice=='d'){
            choice2 = 'D';
        }
       }


              if(q2==0)
       {
        if(choice2 == 'D')
        {
            entertainment entertainment = new entertainment();
  entertainment.displayQuestionsAndAnswers(entertainmentQ, entertainmentA,score,players, name);
              for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
       }
           else if(q2==1)
       {
         if(choice2 == 'D')
        {
        history history = new history();
        history.displayQuestionsAndAnswers(historyQ, historyA, score, players, name);
                    for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
       }
          else  if(q2==2)
       {
         if(choice2 == 'D')
        {
            sportsandleisure sportsandleisure = new sportsandleisure();
            sportsandleisure.displayQuestionsAndAnswers(sportsAndLeisureQ, sportsAndLeisureA, score, players, name);
                        for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
       }
          else  if(q2==3)
       {
         if(choice2 == 'D')
        {
            scienceandnature scienceAndNature = new scienceandnature();
            scienceAndNature.displayQuestionsAndAnswers(scienceAndNatureQ, scienceAndNatureA, score, players, name);
                        for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
       }
            if(q2==4)
       {
         if(choice2 == 'D')
        {
            geography geography = new geography();
            geography.displayQuestionsAndAnswers(geographyQ, geographyA, score, players, name);
            for(int g = 0; g<players; g++)
            {
                System.out.println(name[g] + " score " + score[g]);
            }
        }
       }
         try {
                // Delay for 5 seconds
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    System.out.println("Game Over" );
    for(int h = 0; h < players; h++)
    {
        System.out.println(name[h] + " score " +score[h]);
    }
    try {
                // Delay for 5 seconds
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    sc.close();
    }
}
    
