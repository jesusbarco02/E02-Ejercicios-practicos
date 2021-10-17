CREATE sequence hibernate_sequence
start with 1
increment by 1

CREATE TABLE product (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price REAL        NOT NULL,
    image TEXT,
    description TEXT,
    PRIMARY KEY (id)
);
