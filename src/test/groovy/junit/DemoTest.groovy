package junit

import demo.Smoke
import org.junit.Test

@Smoke
class DemoTest {
    @Test
    void one() {
        println 'This is a smoke test method'
        Thread.sleep( 500 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')
        assert 1 == 1
    }

    @Test
    void two() {
        Thread.sleep( 500 )
        println System.getProperty('org.gradle.test.worker') + ": " + new Date().format('HH:mm:ss')
        assert 1 == 1
    }
}
