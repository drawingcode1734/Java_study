/*
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] scores = new char[5];
        char js;

        for(int i = 0; i < 5 ; i++) {
            System.out.print("점수를 입력해 주세요 : ");
            int score = sc.nextInt();
                if (score < 0)
                    scores[i] = 'F';
                else if (score <= 60)
                    scores[i] = 'C';
                else if (score <= 80)
                    scores[i] = 'B';
                else if (score <= 100)
                    scores[i] = 'A';
                else if (score > 100)
                    scores[i] = 'F';
        }
        int num = 0;
        while(num < 5) {
            System.out.print(scores[num] + " ");
            num++;
        }
    }

}

*/