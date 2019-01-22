package cheatsheet.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author chenxi <chenxi01@souche.com>
 * @date 2019-01-22
 */
public class FirstCharToLowercaseTest {

    @Test
    public void test() {
        FirstCharToLowercase subject = new FirstCharToLowercase();
        String r = subject.StringUtils_uncapitalize("CAT");
        assertThat(r).isEqualTo("cAT");
    }
}