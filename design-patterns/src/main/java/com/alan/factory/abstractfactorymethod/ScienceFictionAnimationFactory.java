package com.alan.factory.abstractfactorymethod;

public class ScienceFictionAnimationFactory implements IAnimationFactory {

    @Override
    public IManga createManga() {
        return new ScienceFictionManga();
    }

    @Override
    public ICosplay createCosplay() {
        return new ScienceFictionCosplay();
    }
}
