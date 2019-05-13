package com.alan.factory.factorymethod;

import com.alan.factory.IAnimation;
import com.alan.factory.RiskAnimation;

public class RiskAnimationFactory implements IAnimationFactory {

    @Override
    public IAnimation create() {
        return new RiskAnimation();
    }

}
