package swati4star.createpdf.util;

import com.itextpdf.text.Font;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class PDFUtilsTest {

    @Test
    public void test_getStyleValueFromName_for_different_names() {
        assertThat(PDFUtils.getStyleValueFromName("BOLD"), is(Font.BOLD));
        assertThat(PDFUtils.getStyleValueFromName("ITALIC"), is(Font.ITALIC));
        assertThat(PDFUtils.getStyleValueFromName("UNDERLINE"), is(Font.UNDERLINE));
        assertThat(PDFUtils.getStyleValueFromName("NORMAL"), is(Font.NORMAL));
        assertThat(PDFUtils.getStyleValueFromName("BOLDITALIC"), is(Font.BOLDITALIC));
        assertThat(PDFUtils.getStyleValueFromName("STRIKETHRU"), is(Font.STRIKETHRU));
        assertThat(PDFUtils.getStyleValueFromName("NOTHING"), is(Font.NORMAL));
    }

    @Test
    public void test_getStyleNameFromFont_for_different_fonts() {
        assertThat(PDFUtils.getStyleNameFromFont(Font.BOLD), is("BOLD"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.UNDERLINE), is("UNDERLINE"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.ITALIC), is("ITALIC"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.NORMAL), is("NORMAL"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.BOLDITALIC), is("BOLDITALIC"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.STRIKETHRU), is("STRIKETHRU"));
        assertThat(PDFUtils.getStyleNameFromFont(Font.UNDEFINED), is("NORMAL"));
    }
}