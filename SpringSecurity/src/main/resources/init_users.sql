CREATE TABLE users(
    username text primary key,
    password text,
    enabled int
);

CREATE TABLE authorities(
    username text,
    authority text,
    FOREIGN KEY (username) REFERENCES users(username)
);

INSERT INTO users(username, password, enabled) VALUES
('Anton', '{noop}anton', 1),
('Masha', '{noop}anton', 1),
('Elena', '{noop}anton', 1);


INSERT INTO authorities(username, authority) VALUES
('Anton', 'ROLE_EMPLOYEE'),
('Elena', 'ROLE_HR'),
('Masha', 'ROLE_HR'),
('Masha', 'ROLE_MANAGER');
