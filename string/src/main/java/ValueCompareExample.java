public class ValueCompareExample {
    public static void main(String[] args) {
        // 래퍼 객체 내부 값을 비교하기 위해 ==, != 연산자 사용 불가능
        // 이 연산은 내부의 값을 비교하는 것이 아니라, 래퍼 객체의 번지를 비교하는 것임

        // 예외도 존재!
        // 래퍼 객체의 효율적 사용을 위해 특정 범위의 값을 갖는 포장 객체는 공유된다.
        // 이 범위에 속한 래퍼 객체라면 ==, != 연산자로 비교할 수 있지만,
        // 이때 내부 값을 비교하는 것이 아니라, 객체 번지를 비교한다는 것을 알아야 함.
        // boolean --> true, false
        // char --> \u0000 ~ \u007f
        // byte, short, int --> -128 ~ 127

        // 래퍼 객체에 정확히 어떤 값이 저장될 지 모르는 상황이라면 ==, !=는 사용하지 않는 것이 좋다.
        // 대신 equals() 메서드로 내부 값을 비교할 수 있다.
        // 래퍼 클래스의 equals() 메서드는 내부의 값을 비교하도록 재정의 되어 있음.

        // -128 ~ 127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));
        System.out.println("equals(): " + obj1.equals(obj2));
        System.out.println();

        // -128 ~ 127 범위값일 경우 (상기한 예외 경우에 속함)
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4));
        System.out.println("equals(): " + obj3.equals(obj4));
    }
}
