package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            if (character == 'A' || character == 'a' || character == 'O' || character == 'o' || character == 'U' ||
                    character == 'u' || character == 'I' || character == 'i' || character == 'E' || character == 'e') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
