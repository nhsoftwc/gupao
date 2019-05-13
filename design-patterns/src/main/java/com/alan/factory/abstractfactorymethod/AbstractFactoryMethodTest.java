package com.alan.factory.abstractfactorymethod;

public class AbstractFactoryMethodTest {

    public static void main(String[] args) {

        IAnimationFactory iAnimationFactory = new ScienceFictionAnimationFactory();
        IManga iManga = iAnimationFactory.createManga();
        iManga.draw();
        ICosplay iCosplay = iAnimationFactory.createCosplay();
        iCosplay.cos();

        iAnimationFactory = new RiskAnimationFactory();
        iManga = iAnimationFactory.createManga();
        iManga.draw();
        iCosplay = iAnimationFactory.createCosplay();
        iCosplay.cos();

    }

}
