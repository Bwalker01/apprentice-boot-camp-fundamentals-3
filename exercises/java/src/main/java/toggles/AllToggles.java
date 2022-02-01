package toggles;

import java.util.ArrayList;
import java.util.List;

public class AllToggles {
    private List<FeatureToggle> toggles;

    public AllToggles() {
        toggles = new ArrayList<>();
    }

    public boolean isEnabled(String name) {
        for (FeatureToggle toggle : toggles) {
            if (toggle.getName().equals(name)) {
                return toggle.isEnabled();
            }
        }
        return false;
    }

    public List<FeatureToggle> getToggles() {
        return toggles;
    }

    public void addToggle(FeatureToggle newToggle) {
        toggles.add(newToggle);
    }

}
