package com.alex323glo.sandbox.rotator.kimpl.procedural

private const val OPEN_SIGN = '(';
private const val CLOSE_SIGN = ')';

fun rotateString(text: String): String {
    if (!text.contains(OPEN_SIGN) || !text.contains(CLOSE_SIGN)) {
        return text
    }

    val firstIndexOfClose = text.indexOf(CLOSE_SIGN)

    val rightPart = text.substring(firstIndexOfClose + 1)
    val leftAndCentralPart = text.substring(0 until firstIndexOfClose)

    val lastIndexOfOpenBeforeClose = leftAndCentralPart.lastIndexOf(OPEN_SIGN)

    val centralPart = leftAndCentralPart.substring(lastIndexOfOpenBeforeClose + 1)
    val leftPart = leftAndCentralPart.substring(0 until lastIndexOfOpenBeforeClose)

    val newText = leftPart + centralPart.reversed() + rightPart

    return rotateString(newText)
}