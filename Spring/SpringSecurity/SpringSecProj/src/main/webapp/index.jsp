<html>
<body>
<h2>Hello World!</h2>

create table users
(
username character(35) NOT NULL UNIQUE,
password character(20),
enabled character(1)
);


create table authorities
(
username character(35) NOT NULL UNIQUE,
authority character(20),
PRIMARY KEY (username,authority)
);


select * from users

</body>
</html>
