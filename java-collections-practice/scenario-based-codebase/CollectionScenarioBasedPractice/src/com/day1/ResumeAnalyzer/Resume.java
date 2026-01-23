package com.day1.ResumeAnalyzer;

public class Resume {

    private String email;
    private String phone;
    private int keywordCount;

    Resume(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    @Override
    public String toString() {
        return "Email: " + email +
               ", Phone: " + phone +
               ", Skill Score: " + keywordCount;
    }

	

}
