import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.*;
public class history {
        public void displayQuestionsAndAnswers(String[] historyQ, String[] historyA, int [] score, int players, String [] name) {
    Scanner scan = new Scanner(System.in);
        int ran = ThreadLocalRandom.current().nextInt(1,5);
        int t = 0;
        if(ran == 1){
            int j = 1;
        for (int i = 0; i < j; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10);
            if (historyQ[randomNum].equals("0")) {
                j++;
            } else {
                t = randomNum;
                for(int w = 0; w < players; w++){
                    System.out.println(name[w]);
                System.out.println(historyQ[randomNum]);
                        System.out.println("1 "+ historyA[randomNum * 4]);
                         System.out.println("2 "+ historyA[randomNum * 4 + 1]);
                          System.out.println("3 "+ historyA[randomNum * 4 + 2]);
                           System.out.println("4 "+ historyA[randomNum * 4 + 3]);
                char ans = ' ';
                do{
                ans = scan.nextLine().charAt(0);
                }while(ans != '1' && ans != '2' && ans != '3' && ans != '4' );
                if(ans=='1')
                {
                    score[w] = score[w] + 100;
                }
                else{
                    score[w] = score[w];
                }
            }
            }
        }
        }
            else if(ran == 2){
            int j = 1;
        for (int i = 0; i < j; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10);
            if (historyQ[randomNum].equals("0")) {
                j++;
            } else {
                t = randomNum;
                for(int w = 0; w < players; w++){
                    System.out.println(name[w]);
                System.out.println(historyQ[randomNum]);
                         System.out.println("1 "+ historyA[randomNum * 4 + 1]);
                          System.out.println("2 "+ historyA[randomNum * 4]);
                          System.out.println("3 "+ historyA[randomNum * 4 + 2]);
                           System.out.println("4 "+ historyA[randomNum * 4 + 3]);
                char ans = ' ';
                do{
                ans = scan.nextLine().charAt(0);
                }while(ans != '1' && ans != '2' && ans != '3' && ans != '4' );
                if(ans=='2')
                {
                    score[w] = score[w] + 100;
                }
                else{}
            }
            }
        }
        }
      else if(ran == 3){
            int j = 1;
        for (int i = 0; i < j; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10);
            if (historyQ[randomNum].equals("0")) {
                j++;
            } else {
                t = randomNum;
                for(int w = 0; w < players; w++){
                    System.out.println(name[w]);
                System.out.println(historyQ[randomNum]);
                System.out.println("1 "+ historyA[randomNum * 4 + 3]);
                    System.out.println("2 "+ historyA[randomNum * 4 + 2]);
                    System.out.println("3 "+ historyA[randomNum * 4]);
                    System.out.println("4 "+ historyA[randomNum * 4 + 1]);
                char ans = ' ';
                do{
                ans = scan.nextLine().charAt(0);
                }while(ans != '1' && ans != '2' && ans != '3' && ans != '4' );
                if(ans=='3')
                {
                    score[w] = score[w] + 100;
                }
                else{}
            }
            }
        }
        }
        else if(ran == 4){
            int j = 1;
        for (int i = 0; i < j; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10);
            if (historyQ[randomNum].equals("0")) {
                j++;
            } else {
                t = randomNum;
                for(int w = 0; w < players; w++){
                    System.out.println(name[w]);
                System.out.println(historyQ[randomNum]);
                    System.out.println("1 "+ historyA[randomNum * 4 + 2]);
                    System.out.println("2 "+ historyA[randomNum * 4 + 3]);
                    System.out.println("3 "+ historyA[randomNum * 4 + 1]);
                    System.out.println("4 "+ historyA[randomNum * 4 ]);
                char ans = ' ';
                do{
                ans = scan.nextLine().charAt(0);
                }while(ans != '1' && ans != '2' && ans != '3' && ans != '4' );
                if(ans=='4')
                {
                    score[w] = score[w] + 100;
                }
                else{}
            }
            }
        }
        }
            try {
                // Delay for 5 seconds
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            historyQ[t] = "0";
        System.out.println("The correct answer is "+ historyA[t * 4 ]);
}
}
