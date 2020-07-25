package assignment.features;

import assignment.models.IUser;

public interface IFeature {

    boolean isValid(String condition, IUser user);
}
