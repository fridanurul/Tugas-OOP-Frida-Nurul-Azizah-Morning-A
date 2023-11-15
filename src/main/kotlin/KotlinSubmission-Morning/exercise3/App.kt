package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */

    val score = 90 // Ganti nilai sesuai kebutuhan

    val result: String = when {
        score >= 90 -> "Selamat Frida Nurul Aziah! Anda mendapatkan nilai A."
        score in 80..90 -> "Anda mendapatkan nilai B."
        score in 70..79 -> "Anda mendapatkan nilai C."
        score in 60..69 -> "Anda mendapatkan nilai D."
    }
    println(result)

}