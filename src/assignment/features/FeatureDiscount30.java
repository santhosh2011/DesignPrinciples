package assignment.features;

import assignment.models.IUser;

public class FeatureDiscount30 extends FeatureDecorator {
    public FeatureDiscount30(IFeature feature) {
        super(feature);
    }

    public boolean isValid(String condition, IUser user) {
        // TODO: Yet to implement the function
        return true;
    }
}
