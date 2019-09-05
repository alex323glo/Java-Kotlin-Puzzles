package com.alex323glo.sandbox.rotator.kimpl.functional

const val TESTED_STRING = "abc(de(fa)ac(kl))gh(123)45"
const val EXPECTED_RESULT = "abcklcafaedgh32145"

fun main() {
    val rotatedString = TESTED_STRING.rotate()

    val resultReportString = """
        In:        "$TESTED_STRING"
        Out:       "$rotatedString"
        EXPECTED:  "$EXPECTED_RESULT"
        Actual result is equal to expected: ${EXPECTED_RESULT == rotatedString}
    """.trimIndent()

    println(resultReportString)
}