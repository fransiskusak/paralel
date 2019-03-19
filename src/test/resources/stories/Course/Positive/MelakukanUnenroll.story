
GivenStories: stories/Account/Positive/Login.story
Scenario: Unenroll dari sebuah matakuliah
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Big Data Komputasional'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik judul Big Data Komputasional
When Pengguna mengeklik tombol unenroll
When Pengguna mengeklik continue
Then Pengguna tidak menemukan List Matakuliah bernama 'Big Data Komputasional'