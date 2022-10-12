import com.example.spock.SpockTestsApplication
import spock.lang.Specification
import spock.lang.Unroll

class SpockTestCases extends Specification {

    SpockTestsApplication obj = new SpockTestsApplication();

    def "This is a simple spock test"() {
        expect:
        1 == 1
    }

    def "Test case to check labels"() {
        var c = obj.addition(10, 20)

        expect:
        c == 30
    }

    def "Test case to check exception"() {
        given:
        int a = 10
        int b = 0

        when:
        var c = obj.divide(a, b)

        then:
        thrown(ArrayIndexOutOfBoundsException)
    }

    @Unroll("We are adding #a + #b")
    def "Test case for Data pipes"() {
        when:
        var c = obj.addition(a, b)

        then:
        c == a + b

        where:
        a << [1, 2, 3, 4, 5]
        b << [6, 7, 8, 9, 10]

        
    }

    @Unroll("We are adding #a + #b")
    def "Test case for Data tables"() {

        when:
        var c = obj.addition(a, b)

        then:
        c == result

        where:
        a   | b     || result
        1   | 6     || 7
        2   | 7     || 10
        3   | 8     || 11
        4   | 9     || 13
        5   | 10    || 15



    }

    def "Test case to check helper methods"() {
        given:
        int a = 4
        int b = 2

        when:
        var c = obj.divide(a, b)

        then:

    }

}
