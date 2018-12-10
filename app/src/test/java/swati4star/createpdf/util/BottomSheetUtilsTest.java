package swati4star.createpdf.util;

import android.app.Activity;
import android.support.design.widget.BottomSheetBehavior;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import swati4star.createpdf.activity.MainActivity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)
public class BottomSheetUtilsTest {

    Activity activity;
    BottomSheetUtils bottomSheetUtils;
    BottomSheetBehavior behavior;

    @Before
    public void setUp() throws Exception {
        activity = Mockito.mock(MainActivity.class);
        bottomSheetUtils = new BottomSheetUtils(activity);
        behavior = new BottomSheetBehavior();
    }

    @Test
    public void test_showHideSheet_when_state_is_expanded() {
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        assertThat(behavior.getState(), is(BottomSheetBehavior.STATE_EXPANDED));
        bottomSheetUtils.showHideSheet(behavior);
        assertThat(behavior.getState(), is(BottomSheetBehavior.STATE_COLLAPSED));
    }

    @Test
    public void test_showHideSheet_when_state_is_collapsed() {
        behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        assertThat(behavior.getState(), is(BottomSheetBehavior.STATE_COLLAPSED));
        bottomSheetUtils.showHideSheet(behavior);
        assertThat(behavior.getState(), is(BottomSheetBehavior.STATE_EXPANDED));
    }
}