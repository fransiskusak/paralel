Logout
Narrative:
Sebagai seorang mahasiswa
Saya ingin logout pada aplikasi e-LOK
Untuk dapat keluar (logout) dari aplikasi eLOK

GivenStories: stories/Account/Positive/Login.story
Scenario: Logout
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik Logout
Then Pengguna akan melihat deskripsi 'Tentang eLOK'