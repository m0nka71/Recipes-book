CREATE TABLE RECIPE (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(200),
     directions VARCHAR(1000),
     time VARCHAR(20),
     ingredients VARCHAR(300),
     category_id VARCHAR(30),
     img VARCHAR(100000)
);

CREATE TABLE CATEGORY (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(30),
    description VARCHAR(1000),
    category_img VARCHAR(100000)
);

