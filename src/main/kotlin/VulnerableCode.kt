class VulnerableCode {
    fun insecureLogin(username: String, password: String): Boolean {
        val storedPassword = "password123"
        return password == storedPassword
    }
}
