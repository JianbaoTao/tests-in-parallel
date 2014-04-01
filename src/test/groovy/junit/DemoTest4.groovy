package junit

import org.junit.Test

class DemoTest4 {
    @Test
    void one() {
        Thread.sleep( 100 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')
        assert 1 == 1
    }

    @Test
    void two() {
        Thread.sleep( 100 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')
        assert 1 == 1
    }


}
