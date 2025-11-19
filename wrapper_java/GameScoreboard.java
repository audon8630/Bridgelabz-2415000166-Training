public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 250, null, 300, 150};

        int notPlayed = 0;
        int total = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total += score;
            }
        }

        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total valid scores: " + total);
    }
}
