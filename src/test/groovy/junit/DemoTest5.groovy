package junit

import org.junit.Test

class DemoTest5 {
    @Test
    void one() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 1000 )
        assert 1 == 1
    }

    @Test
    void two() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 1000 )
        assert 1 == 1
    }

    @Test
    void three() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 1000 )
        assert 1 == 1
    }

    @Test
    void four() {
        println System.getProperty('org.gradle.test.worker')
        Thread.sleep( 1000 )
        assert 1 == 1
    }

}
