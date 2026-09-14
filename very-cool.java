private static final Pattern TOKEN_URL_PARAMETER_PATTERN = Pattern.compile("(\\?|%3F|&|%26)(" + String.join("|", TOKEN_NAMES) + ")" + "(%3D|=)([a-zA-Z\\d-.]*(==)*[a-zA-Z\\d.]*)*");

private static void printTokenUrlParameterPattern() {
    System.out.println("Token URL parameter pattern: " + TOKEN_URL_PARAMETER_PATTERN.pattern());
}

