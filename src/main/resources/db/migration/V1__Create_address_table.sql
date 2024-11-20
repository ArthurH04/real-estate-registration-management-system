CREATE TABLE addresses (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cep VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    house_number VARCHAR(255) NOT NULL,
    neighborhood VARCHAR(255) NOT NULL,
    state VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
