CREATE TABLE product (
    id VARCHAR(32) PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    description TEXT
);

CREATE TABLE users (
    id VARCHAR(32) PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE product_reviews (
    id VARCHAR(32) PRIMARY KEY,
    rating INTEGER NOT NULL,
    description TEXT,
    product_key VARCHAR(32) REFERENCES product(id),
    user_key VARCHAR(32) REFERENCES users(id)
);