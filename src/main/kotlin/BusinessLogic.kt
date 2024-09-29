class BusinessLogic {

    // 1. Method to calculate area of a rectangle
    fun calculateArea(length: Int, width: Int): Int {
        return length * width
    }

    // 2. Method to check if a string contains only letters
    fun isAlphabetic(input: String?): Boolean {
        return input?.all { it.isLetter() } ?: false
    }

    // 3. Method to multiply two numbers
    fun multiplyTwoNumbers(a: Int, b: Int): Int {
        return a * b
    }

    // 4. Method to generate a farewell message
    fun getFarewellMessage(name: String): String {
        return "Goodbye, $name!"
    }

    // 5. Method to calculate interest on a given amount
    fun calculateInterest(amount: Double, rate: Double): Double {
        return amount * rate / 100
    }

    // 6. Method to check if a number is even
    fun isEven(number: Int): Boolean {
        return number % 2 == 0
    }

    // 7. Method to reverse a string
    fun reverseString(input: String): String {
        return input.reversed()
    }

    // 8. Method to check if two strings are anagrams
    fun areAnagrams(str1: String, str2: String): Boolean {
        return str1.toLowerCase().toList().sorted() == str2.toLowerCase().toList().sorted()
    }

    // 9. Method to calculate the nth Fibonacci number
    fun calculateFibonacci(n: Int): Int {
        return if (n <= 1) n else calculateFibonacci(n - 1) + calculateFibonacci(n - 2)
    }

    // 10. Method to generate an API key (vulnerable code)
    fun generateApiKey(username: String): String {
        return "${username}_APIKEY" // Vulnerable as it uses a weak, predictable pattern
    }
}
