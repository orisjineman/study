package org.example.object;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    // Object의 toString() 메서드를 재정의해서 제조사와 운영체제가 결합된 문자열을 리턴하도록 한다.
    @Override
    public String toString() {
        return company + ", " + os;
    }
}
