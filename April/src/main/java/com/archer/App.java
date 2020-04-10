package com.archer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Student s1 = new Student();
        Class c1 = s1.getClass();
        System.out.println(c1.getName());

        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());

        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());
    }
}
