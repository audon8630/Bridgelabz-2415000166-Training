import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        HashMap<String, Integer> votes = new HashMap<>();

        String[] simulatedVotes = {
            "A", "B", "A", "C", "A", "B", "C", "A", "B", "A"
        };

        for (String candidate : simulatedVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = "";
        int max = 0;

        for (String key : votes.keySet()) {
            if (votes.get(key) > max) {
                max = votes.get(key);
                winner = key;
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println("Vote count: " + votes);
    }
}
