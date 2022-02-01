package toggles;

public class FeatureToggle {
    private String featureName;
    private boolean enabled;

    public FeatureToggle(String name, boolean state) {
        this.featureName = name;
        this.enabled = state;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getName() {
        return featureName;
    }
}
