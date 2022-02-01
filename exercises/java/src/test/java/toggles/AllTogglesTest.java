package toggles;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AllTogglesTest {
    private AllToggles allToggles;

    @Before
    public void setUp() {
        allToggles = new AllToggles();
        FeatureToggle enabledToggle = new FeatureToggle("enabledToggle", true);
        FeatureToggle disabledToggle = new FeatureToggle("disabledToggle", false);
        allToggles.addToggle(enabledToggle);
        allToggles.addToggle(disabledToggle);
    }

    @Test
    public void checkingDisabledToggle() {
        assertThat(allToggles.isEnabled("disabledToggle")).isFalse();
    }

    @Test
    public void checkingEnabledToggle() {
        assertThat(allToggles.isEnabled("enabledToggle")).isTrue();
    }

    @Test
    public void checkingForFalseOnInvalidToggle() {
        assertThat(allToggles.isEnabled("invalidToggleName")).isFalse();
    }
}
