package io;

/**
 * Ex04 Tìm học lực học viên:get level (float point) -- Bad (0-4.9),Good (8-10), Pretty good(6.5 - 7.9), Medium(5 - 6.4)
 **/

public class Ex04IfElseElseIf {
    public static void main(String[] args) {

        String level = getLevel(6.8f);
        System.out.println(level);

    }

    private static String getLevel(float score) {
        String result = "";
        if (score > 0 && score < 5) {
            result = "Bad";
        } else if (score < 6.5) {
            result = "Medium";
        } else if (score < 8) {
            result = "pretty good";
        } else {
            result = "good";
        }
        return result;


    }
}
