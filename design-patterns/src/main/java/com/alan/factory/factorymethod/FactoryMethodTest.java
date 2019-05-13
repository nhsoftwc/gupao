package com.alan.factory.factorymethod;

import com.alan.factory.IAnimation;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IAnimationFactory iAnimationFactory = new RiskAnimationFactory();
        IAnimation iAnimation = iAnimationFactory.create();
        iAnimation.watch();

        IAnimationFactory iAnimationFactory2 = new ScienceFictionAnimationFactory();
        IAnimation iAnimation2 = iAnimationFactory2.create();
        iAnimation2.watch();
    }

}
