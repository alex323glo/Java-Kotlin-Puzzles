package com.alex323glo.sandbox.rotator.kimpl.procedural

const val TESTED_STRING = "abc(de(fa)ac(kl))gh(123)45"
const val EXPECTED_RESULT = "abcklcafaedgh32145"

fun main() {

    val rotatedString = rotateString(TESTED_STRING)

    println("In:        \"$TESTED_STRING\"")
    println("Out:       \"$rotatedString\"")
    println("EXPECTED:  \"$EXPECTED_RESULT\"")
    println("Actual result is equal to expected: ${EXPECTED_RESULT == rotatedString}")
}