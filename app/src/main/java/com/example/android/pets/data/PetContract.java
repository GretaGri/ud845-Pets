package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Greta Grigutė on 2018-06-10.
 */
public final class PetContract {

    public static final class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER= "gender";
        public static final String COLUMN_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNDEFINED = 0;
    }
}
