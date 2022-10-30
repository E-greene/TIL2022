package templateCallbackPattern;
 // 내부 전략을 사용하는 클라이언트
public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        // 중복 제거 리팩토링
        rambo.runContext("총! 총! 총!");

        System.out.println();

        rambo.runContext("칼! 칼! 칼!");

        System.out.println();

        rambo.runContext("도끼! 도끼! 도끼!");
//        rambo.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("총! 총! 총!");
//            }
//        });
//
//        System.out.println();
//
//        rambo.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("칼! 칼! 칼!");
//            }
//        });
//
//        System.out.println();
//
//        rambo.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("도끼 ! 도끼! 도끼!");
//            }
//        });


    }
}
