package com.alex323glo.sandbox.rotator.kimpl.functional

private const val OPEN_SIGN = '(';
private const val CLOSE_SIGN = ')';

/**
 * Root function, used to dive into recursion.
 */
fun String.rotate(): String =
    if (this.canRotate()) this.doLocalRotation() else this

/**
 * Checks if string can be rotated (if it contains parts separated with brackets)
 */
private fun String.canRotate(): Boolean =
    this.contains(OPEN_SIGN) && this.contains(CLOSE_SIGN)

/**
 * Splits text into 3 parts (the central one is the first "atomic" part separated with brackets),
 * reverses the central one and recursively tries to repeat rotation by calling root function.
 */
private fun String.doLocalRotation(): String = this
    .splitIntoThreeParts()
    .let { (leftPart, centralPart, rightPart) ->
        leftPart + centralPart.reversed() + rightPart
    }
    .rotate()

/**
 * Splits text into 3 parts:
 *  1. part of text, which is before the opening bracket of central part
 *  2. formatted central part (without brackets) - the first "atomic" part of text separated by brackets
 *  3. part of text, which is after the closing bracket of central part
 */
private fun String.splitIntoThreeParts(): Triple<String, String, String> = this
    .let { it.excludeCharAndSplit(it.indexOf(CLOSE_SIGN)) }
    .let { (leftAndCentralPart, rightPart) ->
        leftAndCentralPart
            .excludeCharAndSplit(leftAndCentralPart.lastIndexOf(OPEN_SIGN))
            .let { (leftPart, centralPart) -> Triple(
                leftPart, centralPart, rightPart
            )}
    }

/**
 * Splits text into 2 parts by a char, which position is proposed as argument
 * (this char is excluded from both result parts).
 */
private fun String.excludeCharAndSplit(charPosition: Int) = Pair(
    this.substring(0 until charPosition),
    this.substring(charPosition + 1)
)
