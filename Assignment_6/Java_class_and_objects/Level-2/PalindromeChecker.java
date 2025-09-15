class PalindromeChecker {
    String text;
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "madam";
        pc.displayResult();
    }
}