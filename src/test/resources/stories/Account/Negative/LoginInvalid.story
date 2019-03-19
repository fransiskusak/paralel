Scenario: Login pada eLOK dengan input bernilai Invalid
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'FRANSISKUSAK'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya ''
When Pengguna mengeklik tombol login
Then Pengguna akan melihat pesan eror yaitu 'Invalid login, please try again'
