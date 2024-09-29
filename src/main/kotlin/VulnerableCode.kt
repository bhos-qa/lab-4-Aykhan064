class VulnerableCode {
    fun insecureLogin(username: String, pass: String): Boolean {
        val password = "password123"
        return pass == password
    }
}
