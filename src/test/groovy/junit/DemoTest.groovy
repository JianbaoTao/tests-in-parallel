package junit

import org.junit.Test

class DemoTest {
    @Test
    void one() {
        Thread.sleep( 5000 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')

        assert 1 == 1
    }

    @Test
    void two() {
        Thread.sleep( 5000 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')
        assert 1 == 1
    }




}
