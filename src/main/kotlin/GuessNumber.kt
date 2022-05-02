
import java.util.*
import kotlin.math.*

val reader = Scanner(System.`in`)

    fun main(args: Array<String>) {

        System.out.println("Привіт! Якщо  бажаете загадати число введить " + "'+'" + " якщо бажаете  відгати число " + "'-'")
        val playerChoice = reader.nextLine()
        if (playerChoice == "+") guessTheComputer()
        else if (playerChoice == "-") guessThePlayer()

    }

    fun guessTheComputer() {

        val reader = Scanner(System.`in`)
        val compNum = Math.ceil(Math.random() * 100).roundToInt()
        println(compNum)
        System.out.println("Введіть число від 0 до 100: ")
        do {
            val playerGuess = reader.nextInt()
            if (playerGuess < compNum) {
                System.out.println("Загадае число більше (>) ")
            } else if (playerGuess > compNum) {
                System.out.println("Загадане число меньше (<)")
            } else if (playerGuess == compNum) {
                System.out.println("ви вгадали , це число: " + compNum)
                break
            }
        } while (true)
    }

    fun guessThePlayer() {

        var min = 0
        var max = 100
        var mindRange = ((min + max) / 2).toDouble().roundToInt()
        System.out.println(
            "Загадайте число від 0 до 100: я вгадаю його за 7 спроб\n" +
                    "Щоб продовжити, введіть будь-яке значення:"
        );
        var strInput = reader.nextLine();

        while (!strInput.equals("=")) {
            System.out.println(
                "Це число більше, менше чи одно" + mindRange + "? " +
                        "Введіть '+' якщо більше, '-' якщо менше і '=' якщо це воно:"
            );
            strInput = reader.nextLine();
            if (strInput.equals("=")) {
                System.out.println("Чудово! Ваше число " + mindRange + ". Дякуємо за гру ;)");
                break;
            } else if (strInput.equals("+")) {
                min = mindRange
                mindRange = ((min + max) / 2).toDouble().roundToInt()
                if (min == mindRange && mindRange != 100) {
                    mindRange += 1
                }
            } else if (strInput.equals("-")) {
                max = mindRange
                mindRange = ((min + max) / 2).toDouble().roundToInt()

            }
        }
    }


