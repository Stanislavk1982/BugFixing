package com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblemInvokeMethodDoesNotWork2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class userClass = User.class.getClass();


//        User user = (User) userClass.newInstance();
        Class user1 = User.class;
        Constructor ctr = user1.getConstructor(String.class);
        User user= (User) ctr.newInstance("1");



        Field field = userClass.getDeclaredField("veryImportantField");
        field.set(user, "newValueForVeryImportantField");
        System.out.println("after changes --->>>> " + user.getVeryImportantField());
    }
}
