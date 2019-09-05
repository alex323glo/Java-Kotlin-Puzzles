package com.alex323glo.sandbox.rotator.jimpl;


public class Runner {
    private static final String TESTED_STRING = "abc(de(fa)ac(kl))gh(123)45";
    private static final String EXPECTED_RESULT = "abcklcafaedgh32145";

    public static void main(String[] args) {
        String rotatedString = Rotator.rotateString(TESTED_STRING);

        System.out.println("In:        \"" + TESTED_STRING + "\"");
        System.out.println("Out:       \"" + rotatedString + "\"");
        System.out.println("EXPECTED:  \"" +EXPECTED_RESULT + "\"");
        System.out.println("Actual result is equal to expected: " + (EXPECTED_RESULT.equals(rotatedString)));
    }
}
