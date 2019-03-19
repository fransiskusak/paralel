Meta:

Narrative:

Sebagai seorang mahasiswa
Saya ingin mengakses Tugas pada matakuliah Jaringan Komputer di eLOK
Sehingga dapat mengetahui apakah terdapat tugas

Scenario: Mengakses dan mengumpulkan tugas pada sebuah matakuliah
GivenStories: stories/Account/Positive/Login.story
GivenStories: stories/Course/Positive/MengenrollDenganEnrollmentKeyValid.story
Given Pengguna berada di Halaman Course Jaringan Komputer
When Pengguna mengeklik tombol Tugas Awal
When Pengguna mengeklik tombol Add Submission
When Pengguna mengeklik tombol Add
When Pengguna mengeklik tombol Recent File
When Pengguna mengeklik tombol Upload a file
When Pengguna mengeklik tombol Browse
When Pengguna mengeklik tombol Upload this File
When Pengguna mengeklik tombol Recent File
When Pengguna mengeklik file yang sudah terupload
When Pengguna mengeklik tombol Select this file
When Pengguna mengeklik tombol overwrite
When Pengguna mengeklik Save changes
Then Pengguna melihat 'Submitted for grading' pada submission statusnya