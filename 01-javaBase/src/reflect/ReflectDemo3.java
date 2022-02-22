package reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("==================");

        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

        Object person1 = constructor1.newInstance();
        System.out.println(person1);
        constructor1.setAccessible(true);
    }
}
