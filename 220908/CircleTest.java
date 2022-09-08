class Point { // 이 클래스를 기반으로 Circle 클래스 작성 (원의 x y 좌표)
    int xPos, yPos;
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    public void showPointInfo() {
        System.out.println("[" + xPos + ", " + yPos + "]");
    }
}


class Circle { // 좌표상의 위치 정보, 반지름의 길이 정보 저장 기능
    int rad;
    Point center;
    // 왜 여기서 먼저 클래스 변수를 선언했냐면
    // 선언 및 생성으로 메소드 안에서만 해주면
    // 메소드 내에서만 동작할 수 있고 밖에선 사용할 수 없기 때문

    public Circle(int x, int y, int r) { // 이 메소드는 클래스 이름과 같이 만들어 생성자 메소드로 표현하는 것이 좋다.
        // 원래는 setRad 라고 메소드 이름 만들었었음 T-T,,, 아직 익숙하지 않은 것 같다
        center = new Point(x, y); // Point 클래스의 변수에 접근하기 위해서 인스턴스 생성한다는 점이 가장 중요
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public void showCircleInfo() { // 원의 좌표, 반지름 정보 출력하는 메소드
        System.out.println("원의 반지름 : " + rad);
        // 점찍어서 인스턴스의 변수가 아니라 메소드를 호출해야 바른 접근이다.
        center.showPointInfo();
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(14, 6, 8);
        //c.Circle(14,6,8); 나는 바보야..
        c.showCircleInfo();
    }
}