Narrative:
Sebagai seorang mahasiswa
Saya ingin menggunakan fitur search pada aplikasi e-LOK
Untuk dapat menemukan matakuliah yang saya inginkan dengan cepat

GivenStories: stories/Account/Positive/Login.story
Scenario: Mencari sebuah matakuliah
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Big Data Komputasional'
When Pengguna mengeklik tombol cari
Then Pengguna akan melihat Nama Matakuliah yaitu 'Big Data Komputasional'