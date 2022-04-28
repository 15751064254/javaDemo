package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

    public static void main(String[] args) {
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            hashMap.put(i, "1");
//        }

        test();


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
    }

    private static void test() {
        Map<Person, String> hashMap = new HashMap<Person, String>();
        for (int i = 0; i < 20; i++) {
            hashMap.put(new Person("person_" + i, i), "person_" + i);
        }
        System.out.println(hashMap);

        System.out.println(Objects.hashCode("A"));
        System.out.println(Objects.hashCode(65));
        System.out.println(Objects.hashCode("a"));
        System.out.println(Objects.hashCode(97));
    }

    static class Person {

        private String name;
        private Integer age;

        public Person(String name) {
            this.name = name;
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return this.name.equals(person.name);
        }

        @Override
        public int hashCode() {
            //return 123456;
            return Objects.hashCode(this.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}
