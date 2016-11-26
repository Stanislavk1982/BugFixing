package com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionProblem1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class userClass = User.class.getClass();
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

//        Class loadedClass = User.class.getClass();
//        Object object = loadedClass.newInstance();

        Class user1 = User.class;
        Constructor ctr = user1.getConstructor(String.class);
        Object object =ctr.newInstance("1");


        if (object instanceof User) {
            User user = (User) object;
            user.getName();
            System.out.println(user.getName());
            user.getSurName();
           // System.out.println(user.getSurName());
        }

    }

}


