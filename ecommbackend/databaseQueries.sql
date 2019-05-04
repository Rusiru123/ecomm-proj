CREATE TABLE category(
	
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(300),
	image_url VARCHAR(70),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);