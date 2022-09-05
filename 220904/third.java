public class third {
    public static void main(String[] args) {
        yeonsan(45,7);
        cha(71,238);
        circleN(8);
        circleD(5);

        System.out.println("<< 문제 06-2-2>>");
        System.out.println("1부터 100까지의 소수 출력하기");
        for(int i = 1; i < 100; i++){
            if (pn(i) == true)
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("<< 문제 06-3-1>>");
        System.out.println(NN(10));

        System.out.println("<< 문제 06-3-2>>");
        binary(19);


    }

    public static void yeonsan(int num1, int num2) {
        System.out.println("<< 문제 06-1-1>>");
        System.out.println("두 수의 합 : " + (num1+num2));
        System.out.println("두 수의 차 : " + (num1-num2));
        System.out.println("두 수의 곱 : " + (num1*num2));
        System.out.println("첫 번째 수를 두 번째 수로 나눈 몫 : " + (num1/num2) + ", 나머지 : " + (num1%num2));
    }

    public static void cha(int num1, int num2) {
        System.out.println("<< 문제 06-1-2>>");
        System.out.println("두 수의 차의 절대값 : " + Math.abs(num1 - num2));
    }

    public static void circleN(int num1) {
        System.out.println("<< 문제 06-2-1>>");
        System.out.println("원의 넓이 : " + (num1*num1*Math.PI));
    }

    public static void circleD(int num1) {
        System.out.println("<< 문제 06-2-1>>");
        System.out.println("원의 둘레 : " + (2*num1*Math.PI));
    }

    public static boolean pn(int num) { //<< 문제 06-2-2>>
        int i;
        for(i = 2; i < num; i++) {
            if (num % i == 0)
                break;
        }
        if (num == i)
            return true;
        else
            return false;
    }

    public static int NN(int num) { // << 문제 06-3-1>>
        int result;
        if(num==1)
            return 2;
        else
            return 2 * NN(num-1);
    }


    public static int binary(int num) { //<< 문제 06-3-2>>
        int result;
        if(num==0 || num==1) {
            System.out.print(num);
        }
        else {
            binary(num / 2);
            System.out.print(num % 2); // 나머지 출력
        }
        return 0;

    }

    public static int binary222(int num) { // 훨씬 간단한 형태
        if(num > 1)
            binary222(num/2);
        System.out.print(num%2);
        return 0;

    }

}