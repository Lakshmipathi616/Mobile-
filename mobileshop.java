import java.util.Scanner;

public class MobileShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want a phone? (yes or no): ");
        String wantPhone = scanner.nextLine().toLowerCase().trim();

        if (wantPhone.equals("yes")) {
            System.out.println("Which brand do you prefer?");
            System.out.println("Options: Samsung, Apple, Xiaomi, OnePlus, Google, Sony, Vivo");
            System.out.print("Enter brand name: ");
            String brand = scanner.nextLine().trim();

            switch (brand.toLowerCase()) {
                case "samsung":
                    displaySamsungModels();
                    break;
                case "apple":
                    displayAppleModels();
                    break;
                case "xiaomi":
                    displayXiaomiModels();
                    break;
                case "oneplus":
                    displayOnePlusModels();
                    break;
                case "google":
                    displayGoogleModels();
                    break;
                case "sony":
                    displaySonyModels();
                    break;
                case "vivo":
                    displayVivoModels();
                    break;
                default:
                    System.out.println("Invalid brand. Please choose from the listed options.");
                    scanner.close();
                    return;
            }

            System.out.print("Choose a model: ");
            String model = scanner.nextLine().trim();

            System.out.print("Choose a color (White or Black): ");
            String color = scanner.nextLine().trim();

            // Final selection
            System.out.println("\nYour chosen phone details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);

        } else if (wantPhone.equals("no")) {
            System.out.println("Maybe next time!");
        } else {
            System.out.println("Invalid input. Please restart the program and try again.");
        }

        scanner.close();
    }

    private static void displaySamsungModels() {
        System.out.println("\nAvailable Samsung Models (2011–2025):");
        System.out.println("2011: Samsung Galaxy S II");
        System.out.println("2012: Samsung Galaxy S III");
        System.out.println("2013: Samsung Galaxy S4");
        System.out.println("2014: Samsung Galaxy S5");
        System.out.println("2015: Samsung Galaxy S6");
        System.out.println("2016: Samsung Galaxy S7");
        System.out.println("2017: Samsung Galaxy S8");
        System.out.println("2018: Samsung Galaxy S9");
        System.out.println("2019: Samsung Galaxy S10");
        System.out.println("2020: Samsung Galaxy S20");
        System.out.println("2021: Samsung Galaxy S21");
        System.out.println("2022: Samsung Galaxy S22");
        System.out.println("2023: Samsung Galaxy S23");
        System.out.println("2024: Samsung Galaxy S24");
        System.out.println("2025: Samsung Galaxy S25");
    }

    private static void displayAppleModels() {
        System.out.println("\nAvailable Apple Models (2011–2025):");
        System.out.println("2011: iPhone 4S");
        System.out.println("2012: iPhone 5");
        System.out.println("2013: iPhone 5S");
        System.out.println("2014: iPhone 6");
        System.out.println("2015: iPhone 6S");
        System.out.println("2016: iPhone 7");
        System.out.println("2017: iPhone 8");
        System.out.println("2018: iPhone XS");
        System.out.println("2019: iPhone 11");
        System.out.println("2020: iPhone 12");
        System.out.println("2021: iPhone 13");
        System.out.println("2022: iPhone 14");
        System.out.println("2023: iPhone 15");
        System.out.println("2024: iPhone 16");
        System.out.println("2025: iPhone 17");
    }

    private static void displayXiaomiModels() {
        System.out.println("\nAvailable Xiaomi Models (2011–2025):");
        System.out.println("2011: Xiaomi Mi 1");
        System.out.println("2012: Xiaomi Mi 2");
        System.out.println("2013: Xiaomi Mi 3");
        System.out.println("2014: Xiaomi Mi 4");
        System.out.println("2015: Xiaomi Mi 5");
        System.out.println("2016: Xiaomi Mi 6");
        System.out.println("2017: Xiaomi Mi 6X");
        System.out.println("2018: Xiaomi Mi 8");
        System.out.println("2019: Xiaomi Mi 9");
        System.out.println("2020: Xiaomi Mi 10");
        System.out.println("2021: Xiaomi Mi 11");
        System.out.println("2022: Xiaomi 12");
        System.out.println("2023: Xiaomi 13");
        System.out.println("2024: Xiaomi 14");
        System.out.println("2025: Xiaomi 15");
    }

    private static void displayOnePlusModels() {
        System.out.println("\nAvailable OnePlus Models (2011–2025):");
        System.out.println("2011: OnePlus One");
        System.out.println("2012: OnePlus Two");
        System.out.println("2013: OnePlus X");
        System.out.println("2014: OnePlus One (2014)");
        System.out.println("2015: OnePlus 2");
        System.out.println("2016: OnePlus 3");
        System.out.println("2017: OnePlus 5");
        System.out.println("2018: OnePlus 6");
        System.out.println("2019: OnePlus 7");
        System.out.println("2020: OnePlus 8");
        System.out.println("2021: OnePlus 9");
        System.out.println("2022: OnePlus 10");
        System.out.println("2023: OnePlus 11");
        System.out.println("2024: OnePlus 12");
        System.out.println("2025: OnePlus 13");
    }

    private static void displayGoogleModels() {
        System.out.println("\nAvailable Google Models (2011–2025):");
        System.out.println("2011: Google Nexus S");
        System.out.println("2012: Google Nexus 4");
        System.out.println("2013: Google Nexus 5");
        System.out.println("2014: Google Nexus 6");
        System.out.println("2015: Google Nexus 5X");
        System.out.println("2016: Google Pixel");
        System.out.println("2017: Google Pixel 2");
        System.out.println("2018: Google Pixel 3");
        System.out.println("2019: Google Pixel 4");
        System.out.println("2020: Google Pixel 5");
        System.out.println("2021: Google Pixel 6");
        System.out.println("2022: Google Pixel 7");
        System.out.println("2023: Google Pixel 8");
        System.out.println("2024: Google Pixel 9");
        System.out.println("2025: Google Pixel 10");
    }

    private static void displaySonyModels() {
        System.out.println("\nAvailable Sony Models (2011–2025):");
        System.out.println("2011: Sony Xperia Arc");
        System.out.println("2012: Sony Xperia Z");
        System.out.println("2013: Sony Xperia Z1");
        System.out.println("2014: Sony Xperia Z2");
        System.out.println("2015: Sony Xperia Z3");
        System.out.println("2016: Sony Xperia Z5");
        System.out.println("2017: Sony Xperia XZ");
        System.out.println("2018: Sony Xperia XZ2");
        System.out.println("2019: Sony Xperia 1");
        System.out.println("2020: Sony Xperia 5 II");
        System.out.println("2021: Sony Xperia 1 III");
        System.out.println("2022: Sony Xperia 1 IV");
        System.out.println("2023: Sony Xperia 1 V");
        System.out.println("2024: Sony Xperia 1 VI");
        System.out.println("2025: Sony Xperia 1 VII");
    }

    private static void displayVivoModels() {
        System.out.println("\nAvailable Vivo Models (2011–2025):");
        System.out.println("2011: Vivo X1");
        System.out.println("2012: Vivo X3");
        System.out.println("2013: Vivo X5");
        System.out.println("2014: Vivo Xshot");
        System.out.println("2015: Vivo X5Pro");
        System.out.println("2016: Vivo X6");
        System.out.println("2017: Vivo V5");
        System.out.println("2018: Vivo V9");
        System.out.println("2019: Vivo V15");
        System.out.println("2020: Vivo V20");
        System.out.println("2021: Vivo V21");
        System.out.println("2022: Vivo V23");
        System.out.println("2023: Vivo V25");
        System.out.println("2024: Vivo X200");
        System.out.println("2025: Vivo X201");
    }
}
