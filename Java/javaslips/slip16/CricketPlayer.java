import java.util.*;

class CricketPlayer {
    String name;
    int innings, notout, totalruns;
    double bat_avg;

    CricketPlayer(String n, int inn, int no, int runs) {
        name = n;
        innings = inn;
        notout = no;
        totalruns = runs;
        bat_avg = avg(this);
    }

    static double avg(CricketPlayer p) {
        if (p.innings - p.notout == 0)
            return p.totalruns;
        return (double) p.totalruns / (p.innings - p.notout);
    }

    static void sort(CricketPlayer[] p, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].bat_avg < p[j].bat_avg) { // descending order
                    CricketPlayer temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(name + " " + innings + " " + notout + " " + totalruns + " " + bat_avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        CricketPlayer[] p = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, innings, notout, total runs: ");
            String name = sc.next();
            int inn = sc.nextInt();
            int no = sc.nextInt();
            int runs = sc.nextInt();
            p[i] = new CricketPlayer(name, inn, no, runs);
        }

        sort(p, n);
        System.out.println("\nPlayers sorted by batting average:");
        for (CricketPlayer player : p)
            player.display();
    }
}
