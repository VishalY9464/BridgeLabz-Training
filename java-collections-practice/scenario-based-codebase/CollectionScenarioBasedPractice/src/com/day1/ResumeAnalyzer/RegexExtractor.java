package com.day1.ResumeAnalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtractor {

    public static String extractEmail(String text) throws Exception {

        Pattern pattern = Pattern.compile(
            "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}"
        );

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        } else {
            throw new Exception("Email not found");
        }
    }

    public static String extractPhone(String text) throws Exception {

        Pattern pattern = Pattern.compile("(\\+91[- ]?)?[6-9][0-9]{9}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        } else {
            throw new Exception("Phone number not found");
        }
    }

    public static int countSkill(String text) {

        String[] skills = {"Java", "Python", "C++"};
        int count = 0;

        for (String skill : skills) {
            Pattern pattern = Pattern.compile(skill, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {   // 🔥 FIX
                count++;
            }
        }
        return count;
    }


}
