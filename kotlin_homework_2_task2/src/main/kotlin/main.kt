fun main() {
    val likes = 31
    val result = if (((likes == 1)||(((likes-1)%10) == 0))&&(likes != 11)&&(((likes - 11)%100) != 0)) "человеку" else "людям"
    println("Понравилось $likes $result ")
}