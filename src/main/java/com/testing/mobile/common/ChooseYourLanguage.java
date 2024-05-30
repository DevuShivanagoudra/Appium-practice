package com.testing.mobile.common;

public enum ChooseYourLanguage {

    ENGLISH("Select English"),
    HINDI("हिंदी चुनें"),
    TAMIL("தமிழைத் தேர்ந்தெடு"),
    TELUGU("తెలుగుని ఎంచుకోండి"),
    KANNADA("ಕನ್ನಡ ಆಯ್ಕೆಮಾಡಿ");

    private final String language;

    ChooseYourLanguage(final String language) {
        this.language = language;
    }

    /**
     * Gets language.
     *
     * @return language
     */
    public String getLanguage() {
        return language;
    }

}
