package com.learning.core.day4;
import java.util.Scanner; 

public class D04P02 {
    private String pName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public D04P02(String playerName, float critic1, float critic2, float critic3) {
        this.pName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        this.avgRating = (critic1 + critic2 + critic3) / 3;
        this.coins = calculateCoins();
    }

    private String calculateCoins() {
        if (avgRating >= 8) {
            return "Gold";
        } else if (avgRating >= 6) {
            return "Silver";
        } else {
            return "Bronze";
        }
    }

    public String getpName() {
        return pName;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public String getCoins() {
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        System.out.println("Enter critic 1 rating:");
        float critic1 = scanner.nextFloat();
        System.out.println("Enter critic 2 rating:");
        float critic2 = scanner.nextFloat();
        System.out.println("Enter critic 3 rating:");
        float critic3 = scanner.nextFloat();

        D04P02 player = new D04P02(playerName, critic1, critic2, critic3);
        System.out.println("Player Name: " + player.getpName());
        System.out.println("Average Rating: " + player.getAvgRating());
        System.out.println("Coins: " + player.getCoins());
        
        scanner.close();
    }
}