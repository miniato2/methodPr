public class Application {
    public static void main(String[] args) {



        Application app = new Application();

        app.checkMethod();

        System.out.println("1부터 10까지의 합 : " + app.sum1to10());

        app.checkMaxNumber(10,20);

        System.out.println("10과 20의 합은 : " + app.sumTwoNumber(10, 20));

        System.out.println("10과 5의 차는 : " + app.minusTwoNumber(10, 5));



    }

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        return 1+2+3+4+5+6+7+8+9+10;
    }

    public void checkMaxNumber(int a, int b){
        System.out.println("두 수 중 큰수는 " + ((a>b)? a:b) + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return a - b;
    }


}
