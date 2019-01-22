package cheatsheet.utils

import spock.lang.Specification

/**
 *
 * @author chenxi <chenxi01@souche.com>
 * @date 2019-01-22
 */
class FirstCharToLowercaseSpec extends Specification {

    def "StringUtils_uncapitalize"() {
        def subject = new FirstCharToLowercase()
        expect:
        subject.StringUtils_uncapitalize(input) == output

        where:
        input || output
        "CAT" || "cAT"
        "cat" || "cat"
        null  || null
        ""    || ""
    }
}
