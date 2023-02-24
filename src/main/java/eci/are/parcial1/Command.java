package eci.are.parcial1;

import com.sun.jdi.Value;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Command {
    public String getFields(String command) throws ClassNotFoundException {
        Class<?> c = Class.forName(command);
        Field[] fields = c.getDeclaredFields();
        String fieldsS = "";
        for (Field field : fields) {
            fieldsS += field.getName() + "\n" + "<br>";
        }
        return fieldsS;
    }

    public String getMethods(String command) throws ClassNotFoundException {
        Class<?> c = Class.forName(command);
        Method[] methods = c.getDeclaredMethods();
        String methodsS = "";
        for (Method method : methods) {
            methodsS += method.getName() + "\n" + "<br>";
        }
        return methodsS;
    }

    public String invokeMethod(String className, String methodName, Type type, Value value) throws ClassNotFoundException {

        Class<?> c = Class.forName(className);
        return "hola";
    }
}

