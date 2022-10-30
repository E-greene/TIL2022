package templateCallbackPattern;

public class Soldier {
//    void runContext(Strategy strategy) {
//        System.out.println("전투시작");
//        strategy.runStrategy();
//        System.out.println("전투종료");
//    }

    // 중복제거 리팩토링
    void runContext(String weaponSound) {
        System.out.println("전투시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투종료");
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
