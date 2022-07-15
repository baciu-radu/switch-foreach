public class Consonants {
    private static boolean removeVowels(int c) {
        switch(c) {
            case 'a': System.out.println("a");
            break;
            case 'e': System.out.println("e");
                break;
            case 'i': System.out.println("i");
                break;
            case 'o': System.out.println("o");
                break;
            case 'u': System.out.println("u");
                break;
        }
        return false;
    }

    public static void main(String []args) {
        "avada kedavra".chars()
                .filter(Consonants::removeVowels)
                .forEach(ch -> System.out.printf("%c", ch));
    }


}
