package templateMethodPattern;

public class Dog extends Animal {
    @Override
    // 추상 메서드 오버라이딩
    void play() {
        System.out.println("멍! 멍!"  );
    }

    @Override
    // Hook 메서드 오버라이딩
    void runSomething() {
        System.out.println("멍! 멍! 꼬리 살랑~");
    }
}
