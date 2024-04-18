# Tutorial Registration Login Demo

Código baseado no Tutorial: https://www.javaguides.net/2018/10/user-registration-module-using-springboot-springmvc-springsecurity-hibernate5-thymeleaf-mysql.html

Repositório Original: https://github.com/RameshMF/registration-login-springboot-security-thymeleaf

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
```

```postgresql
CREATE DATABASE spring_login
    WITH
    OWNER = spring_login_user
```

