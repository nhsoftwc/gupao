package com.alan.factory.simplefactory;

import com.alan.factory.IAnimation;
import com.alan.factory.RiskAnimation;
import com.alan.factory.ScienceFictionAnimation;

public class SimpleFactoryTest {

    public static void main(String[] args) {

//        IAnimation iAnimation = new ScienceFictionAnimation();
//        iAnimation.watch();

        AnimationFactory animationFactory = new AnimationFactory();
//        IAnimation iAnimation = animationFactory.create("ScienceFiction");
//        IAnimation iAnimation = animationFactory.create("com.alan.factory.ScienceFictionAnimation");
        IAnimation iAnimation = animationFactory.create(ScienceFictionAnimation.class);
        iAnimation.watch();
        iAnimation = animationFactory.create(RiskAnimation.class);
        iAnimation.watch();

    }

}
