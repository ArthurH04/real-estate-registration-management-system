CREATE TABLE persons (
    address_id BIGINT,
    person_id BIGINT NOT NULL AUTO_INCREMENT,
    document VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    occupation VARCHAR(255) NOT NULL,
    marital_status ENUM('DIVORCED', 'MARRIED', 'SINGLE') NOT NULL,
    type ENUM('INDIVIDUAL', 'LEGAL_ENTITY') NOT NULL,
    PRIMARY KEY (person_id)
);
