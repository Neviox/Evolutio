package Evolutio;

import java.util.*;


public class KamenSkarePapir {
    private String player;
    private int playerPoints=0;
    private String input;
    private String computer;
    private int computerPoints;
    boolean playerWon;
    public ArrayList<String> zog = new ArrayList<String>(Arrays.asList("kamen", "skare", "papir"));

    public KamenSkarePapir() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username:");
        player=myObj.nextLine();
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public String getInput() {
        return input;
    }

    public String getComputer() {
        return computer;
    }

    public void play() {
        while (!continuePlay()) {
            setGame();
            printResults();
            resetGame();
        }

    }

    public void setGame() {
        Random rand = new Random();
        int randNumber = rand.ints(0, 3).findAny().getAsInt();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter type(kamen,skare,papir):");
        input = myObj.nextLine();
        computer = zog.get(randNumber);
        if (input.equals("kamen") && computer.equals("skare")) {
            playerPoints++;
            playerWon = true;
        }
        if (input.equals("skare") && computer.equals("papir")) {
            playerPoints++;
            playerWon = true;
        }
        if (input.equals("papir") && computer.equals("kamen")) {
            playerPoints++;
            playerWon = true;
        }
        else{
            playerWon=false;
        }
    }

    public boolean continuePlay() {
        Scanner continuepl = new Scanner(System.in);
        System.out.println("Nastavi igru (da/ne):");
        String result1 = continuepl.nextLine();
        System.out.println("Hvala na odgovoru!");
        return result1.equals("ne");
    }

    public boolean resetGame() {
        Scanner reset = new Scanner(System.in);
        System.out.println("Nova igra (da/ne):");
        String result2 = reset.nextLine();
        System.out.println(result2);
        if (result2.equals("da")) {
            playerPoints = 0;

        }
        return result2.equals("ne");
    }

    public void printResults() {
        System.out.println("Korisnik izabrao: " + getInput());
        System.out.println("Racunalo izabralo: " + getComputer());
        if (playerWon) {
            System.out.println("Pobjeda korisnika-bodovi:" + getPlayerPoints());
        } else {
            System.out.println("Pobjeda racunala");

        }
    }
}
