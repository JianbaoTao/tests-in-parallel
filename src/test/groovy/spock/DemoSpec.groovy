package spock

import demo.Smoke
import spock.lang.Specification

@Smoke
class DemoSpec extends Specification {

    def one() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 100 )
        expect:
        1 == 1
    }

    def two() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 100 )
        expect:
        1 == 1
    }

    def three() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 100 )
        expect:
        1 == 1
    }

    def four() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 100 )
        expect:
        1 == 1
    }

}
