package com.alex323glo.sandbox.rotator.jimpl;

public class Rotator {

    private static final String OPEN_SIGN = "(";
    private static final String CLOSE_SIGN = ")";

    private Rotator() {
    }

    public static String rotateString(String text) {
        if (!text.contains(OPEN_SIGN) || !text.contains(CLOSE_SIGN)) {
            return text;
        }

        int firstIndexOfClose = text.indexOf(CLOSE_SIGN);

        String rightPart = text.substring(firstIndexOfClose + 1);
        String leftAndCentralPart = text.substring(0, firstIndexOfClose);

        int lastIndexOfOpenBeforeClose = leftAndCentralPart.lastIndexOf(OPEN_SIGN);

        String centralPart = leftAndCentralPart.substring(lastIndexOfOpenBeforeClose + 1);
        String leftPart = leftAndCentralPart.substring(0, lastIndexOfOpenBeforeClose);

        String reversedCentralPart = new StringBuilder(centralPart).reverse().toString();
        String newText = leftPart + reversedCentralPart + rightPart;

        return rotateString(newText);
    }
}
