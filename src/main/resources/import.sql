-- School

INSERT INTO school (name) VALUES ('Webtech');

-- Student Group

INSERT INTO student_group (school_id, name) VALUES (1, '3A');

-- Student

INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Florian', 'florian@jetdev.fr', 'Lemaire', 32);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Riri', 'riri@next-u.fr', 'Riri', 24);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Fifi', 'fifi@next-u.fr', 'Fifi', 28);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Loulou', 'loulou@next-u.fr', 'Loulou', 26);

-- Professor
INSERT INTO professor (name, first_name, mail, subject, school_id) VALUES ('Ameaume1', 'Luca1', 'luca1@next-u.fr', 'Cuisine', 1);
INSERT INTO professor (name, first_name, mail, subject, school_id) VALUES ('Ameaume2', 'Luca2', 'luca2@next-u.fr', 'Nehess', 1);

-- Course
INSERT INTO course (name, duration, student_group_id, professor_id) VALUES ('Burgers', 60, 1, 1);
INSERT INTO course (name, duration, student_group_id, professor_id) VALUES ('Comment bien dodo', 90, 1, 2);