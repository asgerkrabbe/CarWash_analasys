package CarWash;

import java.util.Scanner;

public class Wash {
    private int washselect;
    private String washtype;
    private int time;
    private int price;
    private int economy = 50;
    private int standard = 80;
    private int deLuxe = 120;
    WashType washType = new WashType();
    Scanner scanner = new Scanner(System.in);
    StopCarWash stopCarWash = new StopCarWash();

    public int getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public int getEconomy() {
        return economy;
    }

    public int getStandard() {
        return standard;
    }

    public int getDeLuxe() {
        return deLuxe;
    }

    public void wash() {
        washType.type();

        System.out.println("Choose wash type:\n");
        washType.type();
        int washTypeSelection = scanner.nextInt();

        if (washTypeSelection == 1){
            System.out.println("Economy wash chosen " + getEconomy() + ",- will be conducted from your washcard balance.");
        }
        if (washTypeSelection == 2){
            System.out.println("Standard wash chosen " + getStandard() + ",- will be conducted from your washcard balance.");
        }
        if (washTypeSelection == 3){
            System.out.println("DeLuxe wash chosen " + getDeLuxe() + ",- will be conducted from your washcard balance.");
        }
        stopCarWash.run();
        System.out.println("Wash complete, remember your washcard!");
    }

    public void Wash() {
    }


    @Override
    public String toString() {
        return null;
    }
}
