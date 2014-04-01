package spock

import spock.lang.Specification

class DemoSpec extends Specification {

    def one() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 5000 )
        expect:
        1 == 1
    }

    def two() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 5000 )
        expect:
        1 == 1
    }

    def three() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 5000 )
        expect:
        1 == 1
    }

    def four() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 5000 )
        expect:
        1 == 1
    }

}
