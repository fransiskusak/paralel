package com.mycompany.elok;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();

        //storyPaths.add("stories/Course/Positive/MengaksesTugas.story");

        //storyPaths.add("stories/Account/Positive/MengeditProfileValid.story");
        //storyPaths.add("stories/Account/Positive/MengeditPasswordValid.story");

        //storyPaths.add("stories/Account/Positive/MendaftarAkunElokValid.story");
        storyPaths.add("stories/Account/Positive/Login.story");
        storyPaths.add("stories/Account/Positive/Logout.story");
        //storyPaths.add("stories/Course/Negative/MengenrollDenganEnrollmentKeyInvalid.story");
//        storyPaths.add("stories/Account/Negative/LoginInvalid.story");
//        storyPaths.add("stories/Account/Positive/MelihatProfil.story");
        //storyPaths.add("stories/Course/Positive/MencariCourse.story");
        //storyPaths.add("stories/Course/Positive/MengenrollTanpaEnrollmentKey.story");
        //storyPaths.add( "stories/Course/Positive/MelihatSemuaMatakuliah.story" );
        //storyPaths.add("stories/Course/Positive/MengenrollDenganEnrollmentKeyValid.story");
        //storyPaths.add("stories/Course/Positive/MelihatSemuaMatakuliahYangDiambil.story");
        //storyPaths.add("stories/Course/Positive/MelakukanUnenroll.story");

        //storyPaths.add("stories/Account/Negative/MendaftarAkunElokInvalid.story");
        //storyPaths.add("stories/Account/Negative/MengeditProfileInvalid.story");
        return storyPaths;
    }

}
