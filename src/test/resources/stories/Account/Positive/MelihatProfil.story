Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat halaman profil saya
Untuk bisa mengetahui informasi mengenai diri saya yang terpampang di halaman profil

Scenario: Melihat profil akun eLOK
GivenStories: stories/Account/Positive/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol profil
Then Pengguna akan melihat deskripsi 'Saya adalah mahasiswa DTETI angkatan 2014' di halaman profil