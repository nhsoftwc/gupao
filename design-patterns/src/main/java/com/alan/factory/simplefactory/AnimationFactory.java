package com.alan.factory.simplefactory;

import com.alan.factory.IAnimation;

public class AnimationFactory {

//    public IAnimation create(String name) {
//        if ("ScienceFiction".equals(name)) {
//            return new ScienceFictionAnimation();
//        } else {
//            return null;
//        }
//    }

//    public IAnimation create(String className) {
//
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (IAnimation) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    public IAnimation create(Class clazz) {

        try {
            if (null != clazz) {
                return (IAnimation) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
