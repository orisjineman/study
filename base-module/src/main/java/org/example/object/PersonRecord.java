package org.example.object;

// 레코드
public record PersonRecord(String name, int age) {
    // record로 선언하면, 컴파일시 아래 항목들이 자동으로 추가된다.
    // 1) private final 필드 (레코드 매개변수의 타입과 이름을 이용해서)
    // 2) 생성자
    // 3) Getter 메서드
    // 4) hashCode() 메서드 재정의한 코드
    // 5) equals() 메서드 재정의한 코드
    // 6) toString() 메서드 재정의한 코드
}
