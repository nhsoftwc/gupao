package com.alan.factory.simplefactory;

import com.alan.factory.IAnimation;
import com.alan.factory.RiskAnimation;
import com.alan.factory.ScienceFictionAnimation;

public class SimpleFactoryTest {

    public static void main(String[] args) {

//        IAnimation iAnimation = AnimationFactory.create("ScienceFiction");
//        IAnimation iAnimation = AnimationFactory.create("com.alan.factory.ScienceFictionAnimation");
        IAnimation iAnimation = AnimationFactory.create(ScienceFictionAnimation.class);
        iAnimation.watch();
        iAnimation = AnimationFactory.create(RiskAnimation.class);
        iAnimation.watch();

    }

}
