CREATE TABLE RECIPE (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(200),
     directions VARCHAR(100000),
     time VARCHAR(20),
     ingredients VARCHAR(30000),
     category_id VARCHAR(30),
     img VARCHAR(100000),
     likes INT
);

CREATE TABLE CATEGORY (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    description VARCHAR(1000),
    img VARCHAR(100000)
);

