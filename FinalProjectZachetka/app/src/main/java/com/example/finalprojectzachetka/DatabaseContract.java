package com.example.finalprojectzachetka;

import android.provider.BaseColumns;

public class DatabaseContract {


        /** Describes History Table and model. */
        public static class disciplines {

            /** Default "ORDER BY" clause. */
            //сортируем по фамилии в убывающем порядке
            public static final String DEFAULT_SORT = NamesColumns.disc + " DESC";
            //имя таблицы
            public static final String TABLE_NAME = "DISCIPLINES";

            private String discipline;

            private long id;

            private String link;


            //
            // Ниже идут сетеры и гетеры для захвата данных из базы
            //
            public String getDiscipline() {

                return discipline;
            }

            public long getId() {

                return id;
            }

            public String getLink() {

                return link;
            }


            }



            /*
             * (non-Javadoc)
             *
             * @see java.lang.Object#toString()
             */
            @Override
            public String toString() {

                StringBuilder builder = new StringBuilder();
                return builder.toString();
            }

            //Класс с именами наших полей в базе
            public class NamesColumns implements BaseColumns {

                /** Strings */
                public static final String disc = "discipline";
                /** String */
                public static final String link = "link";
                /** String */
            }
        }

