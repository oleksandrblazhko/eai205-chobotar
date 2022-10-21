CREATE TABLE user(
id_user SERIAL PRIMARY KEY,
nickname varchar,
password int,
phone_number int,
mail varchar,
id_psychically_result int references mental_health(id_psychically_result) ON DELETE CASCADE,
id_water_result int references water(id_water_result) ON DELETE CASCADE
);

CREATE TABLE water(
id_water_result SERIAL PRIMARY KEY,
amount int,
time int,
date date
);

CREATE TABLE mental_health(
id_psychically_result SERIAL PRIMARY KEY,
mental_condition int,
time int,
date date
);


CREATE TABLE information(
id_information SERIAL PRIMARY KEY,
video char,
news char,
article char,
id_course int references course(id_course) ON DELETE CASCADE
);

CREATE TABLE course(
id_course SERIAL PRIMARY KEY,
id_user int references user(id_user) ON DELETE CASCADE,
description char,
id_lecturer int references lecturer(id_lecturer) ON DELETE CASCADE
);


CREATE TABLE lecturer(
id_lecturer SERIAL PRIMARY KEY,
surname char(20),
name char,
qualification int
);

ALTER TABLE lecturer ADD CONSTRAINT surname
    CHECK (regexp_like(surname, 
	           '^([a-z0-9_-]+)$');

