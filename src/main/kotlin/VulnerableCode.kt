class VulnerableCode {

    // Vulnerable code: a simplistic login function with insecure password handling
    fun insecureLogin(username: String, password: String): Boolean {
        // Simulated weak authentication logic using plaintext password comparison
        val storedPassword = "password123" // Hardcoded password, which is a security flaw

        return password == storedPassword // Vulnerable due to hardcoded password and no hashing
    }
}
