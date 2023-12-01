-- School

INSERT INTO school (name) VALUES ('Webtech');

-- Student Group

INSERT INTO student_group (school_id, name) VALUES (1, '3A');

-- Student

INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Florian', 'florian@jetdev.fr', 'Lemaire', 32);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Riri', 'riri@next-u.fr', 'Riri', 24);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Fifi', 'fifi@next-u.fr', 'Fifi', 28);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Loulou', 'loulou@next-u.fr', 'Loulou', 26);



