package reflect;

import domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method eatMethod = personClass.getMethod("eat");
        Person p = new Person();
        eatMethod.invoke(p);


        Method eatMethod2 = personClass.getMethod("eat", String.class);
        eatMethod2.invoke(p, "饭");
        System.out.println("=================");


        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            method.setAccessible(true);
        }
        String className = personClass.getName();
        System.out.println(className);
    }
}
