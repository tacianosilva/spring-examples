#

## Database

```postgresql
CREATE ROLE spring_login_user WITH
	LOGIN
	NOSUPERUSER
	NOCREATEDB
	NOCREATEROLE
	NOINHERIT
	NOREPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'xxxxxx';
	
	CREATE DATABASE spring_login
    WITH
    OWNER = spring_login_user
```

