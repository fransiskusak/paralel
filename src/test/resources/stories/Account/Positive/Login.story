
Scenario: Login pada aplikasi eLOK
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'frans5'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokfrans24.'
When Pengguna mengeklik tombol login
Then Pengguna akan melihat Nama User yaitu 'F A Kristiawan'