package singletonPattern;

public class Client {
    public static void main(String[] args) {
        // private 생성자이므로 new를 통해 인스턴스를 생성할 수 없다.
        // Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // 객체 참조 변수 자체를 Sout을 통해 출력하면 참조하고 있는 객체의 toString()이 호출되고
        // 별도로 오버라이딩 하지 않았으면 객체의 고유 값인 hashcode를 반환함.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
