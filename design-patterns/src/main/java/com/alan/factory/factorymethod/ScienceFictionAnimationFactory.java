package com.alan.factory.factorymethod;

import com.alan.factory.IAnimation;
import com.alan.factory.ScienceFictionAnimation;

public class ScienceFictionAnimationFactory implements IAnimationFactory {
    @Override
    public IAnimation create() {
        return new ScienceFictionAnimation();
    }
}
