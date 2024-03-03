INSERT INTO product (id, product_name, price, description)
VALUES
    ('P1', 'Widget A', 49.99, 'High-quality widget for everyday use'),
    ('P2', 'Gizmo B', 29.95, 'Compact gizmo with advanced features'),
    ('P3', 'Thingamajig C', 79.50, 'Versatile thingamajig for all occasions'),
    ('P4', 'Widget X', 99.99, 'Premium widget with advanced features'),
    ('P5', 'Gadget Y', 59.95, 'Compact gadget for tech enthusiasts'),
    ('P6', 'Doodad Z', 149.50, 'High-end doodad for collectors'),
    ('P7', 'Super Widget', 199.99, 'The ultimate widget for tech geeks'),
    ('P8', 'Mega Gizmo', 129.95, 'Feature-rich gizmo for professionals'),
    ('P9', 'Tiny Thingamajig', 19.99, 'Small thingamajig for everyday use'),
    ('P10', 'Awesome Gadget', 79.95, 'Impressive gadget with sleek design')
;



INSERT INTO users (id, first_name, last_name, email, password)
VALUES
    ('U1', 'Alice', 'Johnson', 'alice@example.com', 'securepass123'),
    ('U2', 'Bob', 'Smith', 'bob@example.com', 'strongpassword456'),
    ('U3', 'Charlie', 'Brown', 'charlie@example.com', 'secretword789'),
    ('U4', 'Eve', 'Davis', 'eve@example.com', 'securepass123'),
    ('U5', 'Frank', 'Lee', 'frank@example.com', 'strongpassword456'),
    ('U6', 'Grace', 'Wang', 'grace@example.com', 'secretword789'),
    ('U7', 'Henry', 'Smith', 'henry@example.com', 'mypassword123'),
    ('U8', 'Isabella', 'Johnson', 'isabella@example.com', 'password456'),
    ('U9', 'Jack', 'Brown', 'jack@example.com', 'letmein789'),
    ('U10', 'Katherine', 'Martin', 'katherine@example.com', 'hello123')
;

INSERT INTO product_reviews (id, rating, description, product_key, user_key)
VALUES
    ('R1', 5, 'Excellent product! Highly recommended.', 'P1', 'U1'),
    ('R2', 4, 'Good value for the price.', 'P2', 'U2'),
    ('R3', 3, 'Decent quality, but could be better.', 'P3', 'U3'),
    ('R4', 4, 'Solid product, but could use more features.', 'P4', 'U4'),
    ('R5', 5, 'Impressive gizmo! Love it.', 'P5', 'U5'),
    ('R6', 3, 'Thingamajig works as expected.', 'P6', 'U6'),
    ('R7', 4, 'Super Widget is worth the price.', 'P7', 'U7'),
    ('R8', 5, 'Mega Gizmo is a game-changer.', 'P8', 'U8'),
    ('R9', 3, 'Tiny Thingamajig is okay.', 'P9', 'U9'),
    ('R10', 4, 'Awesome Gadget lives up to its name.', 'P10', 'U10')
;
