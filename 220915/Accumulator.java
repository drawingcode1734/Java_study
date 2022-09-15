public class Accumulator {
    static int sum;

    public static void main(String[] args) {
        for(int i = 0; i<10; i++)
            Accumulator.add(i);
        Accumulator.showResult();
    }

    static int add(int num) {
        // 클래스 내에 정의된 메소드에 static 선언을 하면 클래스 메소드가 된다.
        // 인스턴스  생성 이전부터 접근이 가능하며 어느 인스턴스에도 속하지 않음.
        sum += num;
        return sum;
    }

    static void showResult() {
        System.out.println(sum);
    }

}