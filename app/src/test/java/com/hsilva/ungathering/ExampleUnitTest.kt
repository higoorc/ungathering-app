package com.hsilva.ungathering

import com.hsilva.ungathering.domain.model.types.Type
import com.hsilva.ungathering.domain.usecase.quest.CreateMap
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun createMap() {
        val types = listOf(Type.BLACK, Type.RED, Type.BLUE)
        val result = CreateMap().invoke(types, 5)

        assert(result)
    }
}