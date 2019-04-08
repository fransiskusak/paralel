//package com.mycompany.elok.steps;
//import net.thucydides.core.annotations.Steps;
//import org.jbehave.core.annotations.*;
//
//import com.mycompany.elok.steps.serenity.EndUserSteps;
//
//public class Scenario {
//
//    @Steps
//    EndUserSteps endUser;
//
//////////////////////////LOGIN INVALID PASSWORD////////////////////////////
//
//
//    //@When("Pengguna mengetik passwordnya '$invalidpassword'")
//    //public void penggunaMengetikInvalidPassword(String invalidpassword) {endUser.mengetikInvalidPassword(invalidpassword);}
//
//    @Then("Pengguna akan melihat pesan eror yaitu '$erorlogin'")
//    public void akanMelihatErrorLogin(String erorlogin) {endUser.akanLihatPesanErrorLogin(erorlogin);}
//
//////////////////////////////////SEARCH MAKUL BERDASAR KEYWORD////////////////////////////////////////
//
//    @When("Pengguna mengeklik textboxt Search Courses")
//    public void penggunaKlikBoxSearch(){endUser.mengeklikBoxSearch();}
//
//    @When("Pengguna mengetik '$keyword'")
//    public void penggunaKetikBigData(String keyword) {endUser.mengetikKeywordCourse(keyword);}
//
//    @When("Pengguna mengeklik tombol cari")
//    public void penggunaKlikCari(){endUser.mengeklikCariCourse();}
//
//    @Then("Pengguna akan melihat Nama Matakuliah yaitu '$judulMakul'")
//    public void penggunaMelihatNamaMatakuliahNya(String judulMakul){endUser.menemukanTulisanNamaMakulnya(judulMakul);}
//
//
/////////////////////////////ENROLL OPEN MOOC////////////////////////////////////////////////
//
//    @When("Pengguna mengeklik judul Big Data Komputasional")
//    public void penggunaMengeklikBigData(){endUser.mengeklikTulisanNamaMakul();}
//
//    @When("Pengguna klik tombol enroll me")
//    public void penggunaMengeklikEnroll(){endUser.mengeklikEnroll();}
//
//    @Then("Terdapat menu '$tlsunenroll'")
//    public void penggunaMelihatTombolEnroll(String tlsunenroll){endUser.akanLihatTulisanUnenroll(tlsunenroll);}
//
//
////////////////////////////////ENROLL ENROLLMENT KEY/////////////////////////////////
//
//    @When("Pengguna mengeklik judul matakuliah Jaringan Komputer")
//    public void penggunaMengeklikJaringanKomputer(){endUser.mengeklikTulisanJarKom();}
//
//    @When("Pengguna mengeklik textbox untuk memasukkan enrollment key")
//    public void penggunaMengeklikTextboxEnrollmentkey(){endUser.mengeklikTextboxEnrollmentKey();}
//
//    @When("Pengguna mengetik enrollment key '$key'")
//    public void penggunaMengetikEnrollmentKey(String key) {endUser.mengetikEnrollmentKey(key);}
//
//    @When("Pengguna mengeklik tombol enroll me")
//    public void penggunaMengeklikTombolEnrollMeJarkom(){endUser.mengeklikTombolEnrollMe();}
//
//
//    //////////////////////INVALID ENROLL///////////////////////////////
//
//    @Then("Terdapat pesan eror '$erorenroll'")
//    public void terdapatPesanErorIncorrect(String erorenroll){endUser.melihatErorEnroll(erorenroll);}
//
//
//
/////////////////////////////LIHAT PROFIL//////////////////////////////////////////////
//
//    @When("Pengguna mengeklik tombol profil")
//    public void penggunaKlikProfil(){endUser.mengeklikTombolProfil();}
//
//    @Then("Pengguna akan melihat deskripsi '$deskripsiProfil' di halaman profil")
//    public void penggunaAkanMelihatProfilnya(String deskripsiProfil) {endUser.akanLihatProfilnya(deskripsiProfil);}
//
//////////////////////////BATAL GRADE/////////////////////////////////////////
//    @When("Pengguna mengeklik tombol grade")
//    public void penggunaMengeklikTombolGrade() {endUser.mengeklikGrade();}
//
//    @Then("Pengguna akan melihat nilai-nilai nya")
//    public void penggunaAkanMelihatGrade() {endUser.akanLihatGrade();}
//
/////////////////////////////MESSAGE//////////////////////////////////////////////
//
//    @When("Pengguna mengeklik tombol messages")
//    public void penggunaMengeklikTombolMessages() {endUser.mengeklikMessages();}
//
//    @Then("Pengguna akan melihat messages-nya '$isimessages'")
//    public void penggunaAkanMelihatMessagesnya(String isimessages) {endUser.akanLihatMessages(isimessages);}
//
//////////////////////////////MATAKULIAH TERSEDIA/////////////////////////////////////////////
//
//    @When("Pengguna mengeklik tombol Matakuliah")
//    public void penggunaMengeklikTombolMatakuliah() {endUser.mengeklikMatakuliah();}
//
//    @When("Pengguna mengeklik tombol MOOC")
//    public void penggunaMengeklikTombolMOOC(){endUser.mengeklikMOOC();}
//
//    @Then("Pengguna akan melihat salah satu Matakuliah yang tersedia yaitu '$sampleJarkom'")
//    public void penggunaAkanMelihatSampleMatakuliah(String sampleJarkom) {endUser.akanLihatSampleMatakuliah(sampleJarkom);}
//
////////////////////////////REGISTER USER//////////////////////////////////
//
//    @When("Pengguna mengeklik tombol register")
//    public void penggunaMengeklikTombolRegister(){endUser.mengeklikTombolRegister();}
//
//    @When("Pengguna mengklik textbox Username")
//    public void penggunaMengklikTextboxUsername(){endUser.mengeklikTextboxUsername();}
//
//    @When("Pengguna memasukkan username '$registerusername'")
//    public void penggunaMemasukkanUsername(String registerusername){endUser.memasukkanUsername(registerusername);}
//
//    @When("Pengguna mengeklik lock password")
//    public void penggunaMengeklikLockPasword(){endUser.mengeklikLockPassword();}
//
//    @When("Pengguna mengklik textbox Password")
//    public void penggunaMengklikTextboxPassword(){endUser.mengeklikTextboxPassword();}
//
//    @When("Pengguna memasukkan password '$registerpassword'")
//    public void penggunaMemasukkanPassword(String registerpassword){endUser.memasukkanPassword(registerpassword);}
//
//    @When("Pengguna mengeklik textbox Email")
//    public void penggunaMengeklikTextboxEmail(){endUser.mengeklikTextboxEmail();}
//
//    @When("Pengguna memasukkan Email '$email'")
//    public void penggunaMemasukkanEmail(String email){endUser.memasukkanEmail(email);}
//
//    @When("Pengguna mengeklik textbox Email (again)")
//    public void penggunaMengeklikTextboxEmailAgain(){endUser.mengeklikTextboxEmailAgain();}
//
//    @When("Pengguna memasukkan Email (again) '$emailagain'")
//    public void penggunaMemasukkanTextboxEmailAgain(String emailagain){endUser.memasukkanEmailAgain(emailagain);}
//
//    @When("Pengguna mengeklik textbox First name")
//    public void penggunaMengeklikTextboxFirstName(){endUser.mengeklikTextboxFirstName();}
//
//    @When("Pengguna memasukkan First name '$firstname'")
//    public void penggunaMemasukkanFirstName(String firstname){endUser.memasukkanFirstName(firstname);}
//
//    @When("Pengguna mengeklik textbox Surname")
//    public void penggunaMengeklikTextboxSurname(){endUser.mengeklikTextboxSurname();}
//
//    @When("Pengguna memasukkan Surname '$surname'")
//    public void PenggunaMemasukkanSurname(String surname){endUser.memasukkanSurname(surname);}
//
//    @When("Pengguna mengeklik textbox City")
//    public void penggunaMengeklikTextboxCity(){endUser.mengeklikTextboxCity();}
//
//    @When("Pengguna memasukkan City '$city'")
//    public void penggunaMemasukkanCity(String city){endUser.memasukkanCity(city);}
//
//    @When("Pengguna mengeklik textbox Country")
//    public void penggunaMengeklikTextboxCountry(){endUser.mengeklikTextboxCountry();}
//
//    @When("Pengguna mengeklik Negara '$negara'")
//    public void penggunaMengeklikNegaraIndonesia(String negara ){endUser.menselectNegaraIndonesia(negara);}
//
//    @When("Pengguna mengeklik tombol create")
//    public void penggunaMengeklikCreate() {endUser.mengeklikCreateAccount();}
//
//    @Then("Pengguna akan melihat konfirmasi '$berhasil'")
//    public void penggunaAkanMelihatKonfirmasi(String berhasil){endUser.akanMelihatKonfirmasiRegistrasi(berhasil);}
//
//
//
//    //////////////////////////////////////INVALID REGISTER USER///////////////////////////////////////////////////
//
//
//    @Then("Pengguna melihat error message '$eror'")
//    public void penggunaMelihatEror(String eror){endUser.akanLihatEror(eror);}
//
//    //////////////////////////EDIT PROFIL//////////////////////////////////
//
//    @When("Pengguna mengeklik tombol Edit profile")
//    public void penggunaMengeklikEditProfile(){endUser.mengeklikTombolEditProfile();}
//
//    @When("Pengguna mengeklik field First name")
//    public void penggunaMengeklikFieldFirstName(){endUser.mengeklikFieldFirstNameEdit();}
//
//    @When("Pengguna memasukkan '$firstnameedit' ke field First name")
//    public void penggunaMemasukkanFieldFirstName(String firstnameedit ){endUser.memasukkanFirstNameEdit(firstnameedit);}
//
//    @When("Pengguna mengeklik field Surname")
//    public void penggunaMengeklikFieldSurname(){endUser.mengeklikFieldSurnameEdit();}
//
//    @When("Pengguna memasukkan '$surnameedit' ke field Surname")
//    public void penggunaMemasukkanFieldSurname(String surnameedit){endUser.memasukkanFieldSurnameEdit(surnameedit);}
//
//    @When("Pengguna mengeklik field Email address")
//    public void penggunaMengeklikFieldEmailAddress(){endUser.mengeklikFieldEmailEdit();}
//
//    @When("Pengguna memasukkan '$emailedit' ke field Email address")
//    public void penggunaMemasukkanFieldEmailAddress(String emailedit){endUser.memasukkanFieldEmailEdit(emailedit);}
//
//    @When("Pengguna mengeklik field Email display")
//    public void penggunaMengeklikFieldEmailDisplay(){endUser.mengeklikFieldEmailDisplay();}
//
//    @When("Pengguna mengeklik pilihan Allow everyone to see my email address")
//    public void penggunaMengeklikPilihanAllowEveryone(){endUser.memilihFieldEmailDisplay();}
//
//    @When("Pengguna mengeklik field City/Town")
//    public void penggunaMengeklikFieldCity(){endUser.mengeklikFieldCityEdit();}
//
//    @When("Pengguna memasukkan '$citytownedit' ke field City/Town")
//    public void penggunaMemasukkanFieldCity(String citytownedit){endUser.memasukkanFieldCityEdit(citytownedit);}
//
//    @When("Pengguna mengeklik field Country")
//    public void penggunaMengeklikFieldCountry(){endUser.mengeklikFieldCountryEdit();}
//
//    @When("Pengguna mengeklik pilihan Indonesia")
//    public void penggunaMengeklikPilihanIndonesia(){endUser.memilihIsiFieldCountryEdit();}
//
//    @When("Pengguna mengeklik field Timezone")
//    public void penggunaMengeklikFieldTimezone(){endUser.mengeklikFieldTimezoneEdit();}
//
//    @When("Pengguna mengeklik pilihan Server timezone (Asia/Jakarta)")
//    public void penggunaMengeklikPilihanTimezone(){endUser.memilihIsiTimezoneJakarta();}
//
//    @When("Pengguna mengeklik field Description")
//    public void penggunaMengeklikFieldDescription(){endUser.mengelikFieldDescriptionEdit();}
//
//    @When("Pengguna memasukkan '$descedit' ke field Description")
//    public void penggunaMemasukkanFieldDescription(String descedit){endUser.memasukkanFieldDescriptionEdit(descedit);}
//
//    @When("Pengguna mengeklik tombol update profil")
//    public void penggunaMengeklikTombolUpdateProfil(){endUser.mengeklikTombolUpdateProfil();}
//
//    @Then("Pengguna melihat nama akunnya menjadi '$namaakunteredit'")
//    public void penggunaAkanMelihatNamaAkunnyaBerubah(String namaakunteredit ){endUser.akanLihatNamaBaruPengguna(namaakunteredit);}
//
//
//    /////////////////////////////////////////INVALID EDIT PROFIL//////////////////////////
//    @Then("Pengguna melihat pesan eror '$This email address is already registered.'")
//    public void penggunaAkanMelihatErorEditEmail(String eroreditemail) {endUser.akanLihatErorEditEmail(eroreditemail);}
//
//
//
////////////////////////////////////UNENROLL///////////////////////////////////////////////////////////////////////////////////
//    @When("Pengguna mengeklik tombol unenroll")
//    public void penggunaMengeklikUnenroll() {endUser.mengeklikUnenroll();}
//
//    @When("Pengguna mengeklik continue")
//    public void penggunaMengeklikContnue(){endUser.mengeklikContinue();}
//
//    @Then("Pengguna tidak menemukan List Matakuliah bernama '$listbigdata'")
//    public void penggunaTidakMenemukanListMatakuliah(String listbigdata){endUser.tidakMenemukanListMatakuliah(listbigdata);}
//
//
///////////////////////////////////MENGAKSES TUGAS/////////////////////////////////////////////////////////////////
//    @Given("Pengguna berada di Halaman Course Jaringan Komputer")
//    public void penggunaBeradaDiHalamanCourse(){endUser.beradadiHomePageCourse();}
//
//    @When("Pengguna mengeklik tombol Tugas Awal")
//    public void penggunaMengeklikTugasAwal(){endUser.mengeklikTugasAwal();}
//
//    @When("Pengguna mengeklik tombol Add Submission")
//    public void penggunaMengeklikAddSubmission(){endUser.mengeklikAddSubmission();}
//
//    @When("Pengguna mengeklik tombol Add")
//    public void penggunaMengeklikTombolAdd(){endUser.mengeklikAdd();}
//
//    @When("Pengguna mengeklik tombol Upload a file")
//    public void penggunaMengeklikTombolUploadAFile(){endUser.mengeklikUploadAFile();}
//
//    @When("Pengguna mengeklik tombol Browse")
//    public void penggunaMengeklikTombolBrowse(){endUser.mengeklikBrowse();}
//
//    @When("Pengguna mengeklik tombol Upload this File")
//    public void penggunaMengeklikTombolUploadThisFile(){endUser.mengeklikUploadThisFile();}
//
//    @When("Pengguna mengeklik tombol Recent File")
//    public void penggunaMengeklikTombolRecentFile(){endUser.mengeklikRecentFile();}
//
//    @When("Pengguna mengeklik file yang sudah terupload")
//    public void penggunaMengeklikFileYangSudahTerupload(){endUser.mengeklikFileTerupload();}
//
//    @When("Pengguna mengeklik tombol Select this file")
//    public void penggunaMengeklikTombolSelectThisFile(){endUser.mengeklikSelectThisFile();}
//
//    @When("Pengguna mengeklik tombol overwrite")
//    public void penggunaMengeklikTombolOverwrite() {endUser.mengeklikOverwrite();}
//
//    @When("Pengguna mengeklik Save changes")
//    public void penggunaMengeklikSaveChangesTugas(){endUser.mengeklikSaveChanges();}
//
//    @Then("Pengguna melihat '$submissionstatus' pada submission statusnya")
//    public void penggunaMelihatSubmittedForGrading(String submissionstatus){endUser.akanMelihatSubmissionStatus(submissionstatus);}
//
//
////    Then Pengguna melihat menu 'File submissions'
//    @Then("Pengguna melihat menu '$tulisanmenusubmission'")
//    public void penggunaAkanMelihatMenuSubmission(
//            //String tulisanmenusubmission
//            ){
//        //endUser.akanMelihatMenuSubmission(tulisanmenusubmission);
//        }
//
//
////////////////////////////////////////////LIHAT SEMUA MATAKULIAH YANG DIAMBIL//////////////////////////////////
//
//    @Then("Pengguna melihat nama matakuliah '$judulmakul' pada menu Course Overview")
//    public void penggunaMelihatNamaMatakuliahDiCourseOverview(String judulmakul){endUser.akanMelihatMatakuliahYangDiambil(judulmakul);}
//
//
//
////////////////////////////////////////////PERGANTIAN PASSWORD/////////////////////////////////////////////////////
//
//    @When("Pengguna mengeklik tombol Preferences")
//    public void penggunaMengeklikTombolPreferences(){endUser.mengeklikPreferences();}
//
//    @When("Pengguna mengeklik Change password")
//    public void penggunaMengeklikChangePassword(){endUser.mengeklikChangePassword();}
//
//    @When("Pengguna mengeklik textbox Current password")
//    public void penggunaMengeklikTextboxCurrentPassword(){endUser.mengeklikTextboxCurrentPassword();}
//
//    @When("Pengguna memasukkan '$currentPassword' pada textbox Current password")
//    public void penggunaMemasukkanCurrentPassword(String currentPassword){endUser.memasukkanCurrentPassword(currentPassword);}
//
//    @When("Pengguna mengeklik textbox New password")
//    public void penggunaMengeklikTextboxNewPassword(){endUser.mengeklikTextboxNewPassword();}
//
//    @When("Pengguna memasukkan '$newPassword' pada textbox New password")
//    public void ppenggunaMemasukkantextboxNewPassword(String newPassword){endUser.memasukkanNewPassword(newPassword);}
//
//    @When("Pengguna mengeklik textbox New password (again)")
//    public void penggunaMengeklikNewPasswordAgain(){endUser.mengeklikTextboxNewPasswordAgain();}
//
//    @When("Pengguna memasukkan '$newPassAgain' pada textbox New password (again)")
//    public void penggunaMemasukkanNewPasswordAagain(String newPassAgain ){endUser.memasukkanNewPasswordAgain(newPassAgain);}
//
//    @When("Pengguna mengeklik tombol Save changes")
//    public void penggunaMengeklikSaveChanges(){endUser.mengeklikSaveChange();}
//
//    @Then("Pengguna akan melihat pemberitahuan '$passwordChanged'")
//    public void penggunaAkanMelihatPemberitahuanBerhasil(String passwordChanged){endUser.akanMelihatNotifikasiPerubahanPassword(passwordChanged);}
//
//
//
//
//
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////    @AfterScenario
////    public void afterScenario() {
////        driver.quit();
////    }
//}