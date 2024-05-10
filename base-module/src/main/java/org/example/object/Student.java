package org.example.object;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        // 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴(번호와 이름이 같으면 동일한 해시코드가 생성됨)
        return no + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            // 학생 번호와 이름이 같으면 true 리턴
            return no == target.getNo() && name.equals(target.getName());
        }
        return false;
    }
}
