INSERT INTO users (id, name, email, password) VALUES
(101, 'Rahul Sharma', 'rahul@gmail.com', '1234'),
(102, 'Priya Verma', 'priya@gmail.com', '1234'),
(103, 'Amit Kumar', 'amit@gmail.com', '1234'),
(104, 'Sneha Singh', 'sneha@gmail.com', '1234');


INSERT INTO restaurant (id, location, name) VALUES
(1, 'Mumbai', 'Dominos Pizza'),
(2, 'Delhi', 'KFC'),
(3, 'Bangalore', 'Burger King'),
(4, 'Pune', 'Subway');

INSERT INTO menu_item (id, item_name, price, restaurant_id) VALUES
-- Dominos (restaurant_id = 1)
(12, 'Veg Pizza', 199, 1),
(13, 'Paneer Pizza', 249, 1),
(14, 'Garlic Bread', 129, 1),

-- KFC (restaurant_id = 2)
(15, 'Fried Chicken Bucket', 499, 2),
(16, 'Chicken Wings', 299, 2),

-- Burger King (restaurant_id = 3)
(17, 'Veg Whopper', 179, 3),
(18, 'Chicken Whopper', 219, 3),

-- Subway (restaurant_id = 4)
(19, 'Veggie Delight Sub', 149, 4),
(20, 'Paneer Tikka Sub', 199, 4);


INSERT INTO orders (id, menu_item_id, quantity, total_price) VALUES
(111, 12, 2, 398),
(112, 15, 1, 499),
(113, 17, 3, 537);

