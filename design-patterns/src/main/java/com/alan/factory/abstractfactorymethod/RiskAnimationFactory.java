package com.alan.factory.abstractfactorymethod;

public class RiskAnimationFactory implements IAnimationFactory {
    @Override
    public IManga createManga() {
        return new RiskManga();
    }

    @Override
    public ICosplay createCosplay() {
        return new RiskCosplay();
    }
}
