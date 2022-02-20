package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemotest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectDemotest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");

        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> cls = Class.forName(className);


        Object obj = cls.getConstructor().newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
