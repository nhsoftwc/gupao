package com.alan.factory.abstractfactorymethod;

public class AbstractFactoryMethodTest {

    public static void main(String[] args) {

        IAnimationFactory iAnimationFactory = new ScienceFictionAnimationFactory();
        iAnimationFactory.createManga().draw();
        iAnimationFactory.createCosplay().cos();

        iAnimationFactory = new RiskAnimationFactory();
        iAnimationFactory.createManga().draw();
        iAnimationFactory.createCosplay().cos();

    }

}
