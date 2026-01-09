package com.artify;

public class PrintArt extends ArtWork implements IPurchasable {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= getPrice()) {

            // Operator logic: deduct balance
            user.deductAmount(getPrice());

            license();

            System.out.println("Print art purchased successfully: " + getTitle());
        } else {
            System.out.println("Insufficient balance for Print Art.");
        }
    }

    @Override
    public void license() {
        licenseType = "Limited Print License";
        System.out.println("License applied: " + licenseType);
    }
}
