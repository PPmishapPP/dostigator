CREATE TABLE IF NOT EXISTS users
(
    id   BIGINT       NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE users
    ADD CONSTRAINT uc_users_name UNIQUE (name);

CREATE TABLE IF NOT EXISTS achievkas
(
    id          BIGINT NOT NULL,
    description VARCHAR(255),
    CONSTRAINT pk_achievkas PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users_achievkas
(
    achievkas_id BIGINT NOT NULL,
    user_id      BIGINT NOT NULL
);

ALTER TABLE users_achievkas
    ADD CONSTRAINT fk_useach_on_achievka FOREIGN KEY (achievkas_id) REFERENCES achievkas (id);

ALTER TABLE users_achievkas
    ADD CONSTRAINT fk_useach_on_user FOREIGN KEY (user_id) REFERENCES users (id);