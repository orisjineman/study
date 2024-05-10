package org.example.object;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) { // obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
            return id.equals(target.id);
        }
        return false;
    }
}
