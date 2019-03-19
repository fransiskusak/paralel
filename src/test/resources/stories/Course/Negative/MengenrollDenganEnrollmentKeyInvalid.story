Narrative:
Sebagai seorang mahasiswa peserta matakuliah Jaringan Komputer
Saya ingin enroll pada matakuliah Jaringan Komputer  di e-LOK menggunakan enrollment key
Untuk dapat mengakses konten pembelajaran Jaringan Komputer

Scenario: Enroll pada sebuah matakuliah dengan enrollment key bernilai invalid
GivenStories: stories/Account/Positive/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Jaringan Komputer'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik judul matakuliah Jaringan Komputer
When Pengguna mengeklik textbox untuk memasukkan enrollment key
When Pengguna mengetik enrollment key 'jarkom'
When Pengguna mengeklik tombol enroll me
Then Terdapat pesan eror 'Incorrect enrolment key, please try again'