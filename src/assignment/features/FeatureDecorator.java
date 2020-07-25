package assignment.features;

public abstract class FeatureDecorator implements IFeature {
    private IFeature feature;

    public FeatureDecorator(IFeature feature) {
        this.feature = feature;
    }

}
