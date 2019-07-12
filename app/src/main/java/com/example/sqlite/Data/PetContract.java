package com.example.sqlite.Data;

import android.provider.BaseColumns;

public class PetContract  {
    public class PetEntry implements BaseColumns {


    public static final String TABLE_NAME = "PETS";
    public static final String COLUMN_PET_ID = BaseColumns._ID;
    public static final String COLUMN_PET_NAME = "Name";
    public static final String COLUMN_PET_BREED = "Breed";
    public static final String COLUMN_PET_GENDER = "Gender";
    public static final String COLUMN_PET_WEIGHT = "Weight";

    public static final int GENDER_UNKNOWN = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;

}
}
