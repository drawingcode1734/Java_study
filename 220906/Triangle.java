class Triangle {

    double base; // 밑변
    double height; // 높이
    double area; // 넓이

    public Triangle(double bs, double ht) {
        base = bs;
        height = ht;
    }


    public double makearea() { // 삼각형 넓이
        area = base * height / 2;
        return area;
    }

    public void showarea() {
        System.out.println("삼각형 넓이 : " + area);
    }

}


class addTriangle {
    public static void main(String[] args) {
        Triangle red = new Triangle(5,20);
        red.makearea();
        red.showarea();

        Triangle yellow = new Triangle(23.4, 8.8);
        yellow.makearea();
        yellow.showarea();
    }

}
