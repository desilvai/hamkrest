package com.natpryce.hamkrest.internal

import com.natpryce.hamkrest.assertThat
import com.natpryce.hamkrest.delimit
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class Utilities {
    @Test
    public fun splits_identifier_into_words() {
        val cases = listOf(
                "identifier" to listOf("identifier"),
                "an_identifier" to listOf("an", "identifier"),
                "anIdentifier" to listOf("an", "identifier"),
                "farenheit451" to listOf("farenheit", "451"),
                "i_got_99_problems" to listOf("i", "got", "99", "problems")
        )

        for ((identifier, words) in cases) {
            assertThat("${delimit(identifier)} to words", identifierToWords(identifier), equalTo(words))
        }
    }
}