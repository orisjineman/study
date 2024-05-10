package org.example.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class ObjectTest {
    @Test
    public void objectEqualsTest() {
        // given
        Object obj1 = new Object();

        // when
        Object obj2 = obj1;

        // then
        Assertions.assertEquals(obj1, obj2);
    }

    @Test
    public void memberTest() {
        // given
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        // when

        // then
        Assertions.assertEquals(obj1, obj2);
        Assertions.assertNotEquals(obj1, obj3);
    }

    @Test
    public void studentTest() {
        // given
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        // when
        // then
        Assertions.assertTrue(s1.hashCode() == s2.hashCode() && s1.equals(s2));
    }

    @Test
    public void studentSetTest() {
        // given
        HashSet<Student> hashSet = new HashSet<Student>();
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        Student s3 = new Student(2, "홍길동");

        // when
        hashSet.add(s1);
        hashSet.add(s2);    // s1, s2는 같은 객체이므로 Set에 추가되지 않는다.
        hashSet.add(s3);

        // then
        Assertions.assertEquals(2, hashSet.size());
    }

    @Test
    public void smartPhoneTest() {
        // given
        SmartPhone myPhone = new SmartPhone("Apple", "iOS");

        // when
        String strObj = myPhone.toString();

        // then
        Assertions.assertEquals("Apple, iOS", strObj);
    }

    @Test
    public void recordTest() {
        // given
        PersonRecord p1 = new PersonRecord("오리스", 17);
        PersonRecord p2 = new PersonRecord("기우", 20);
        PersonRecord p3 = new PersonRecord("기우", 20);

        // when
        // then
        Assertions.assertEquals("오리스", p1.name());
        Assertions.assertEquals(17, p1.age());
        Assertions.assertEquals("기우", p2.name());
        Assertions.assertEquals(20, p2.age());
        Assertions.assertEquals(p2.hashCode(), p3.hashCode());
        Assertions.assertEquals(p2, p3);

        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());
        System.out.println("p1.toString(): " + p1.toString());
        System.out.println("p2.toString(): " + p2.toString());
        System.out.println("p3.toString(): " + p3); // 자동으로 toString 결과가 출력되므로 toString 생략 가능
    }
}
