package powerassert.example

import org.junit.Test

class SampleTest {
    @Test
    fun test() {
        Sample::class.constructors.forEach(::println)
        Sample::class.members.forEach(::println)
    }
}
