package com.artify;

public class DigitalArt extends ArtWork implements IPurchasable {

    public DigitalArt(String title, String artist, double price) {
        super(title, artist, price);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= getPrice()) {

            // Operator logic: deduct balance
            user.deductAmount(getPrice());

            license();

            System.out.println("Digital art purchased successfully: " + getTitle());
        } else {
            System.out.println("Insufficient balance for Digital Art.");
        }
    }

    @Override
    public void license() {
        licenseType = "Digital Usage License";
        System.out.println("License applied: " + licenseType);
    }
}
