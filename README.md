# ASE-Assignment-2
Struts 2 MVC Framework

# Getting Started
## 1. Clone This Project

In your command prompt/terminal, go to your desired directory, and run the following command:
```
git clone https://github.com/hanliong-looi/ASE-Assignment-2.git
```
Next, go to the project's directory by running the following command:
```
cd ASE-Assignment-2
```
## 2. Run MySQL Database Creation Script

If you have not installed MySQL in your local computer, click on this link and follow the installation guide https://dev.mysql.com/doc/refman/8.0/en/installing.html
Ensure that the bin files for MySQL are added to your environment variables.

For you to connect to the MySQL database, you have to create an account by running the following command:
```
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON account_credentials.* TO 'admin'@'localhost';
```
After installation, in the same command prompt/terminal, run the following command:
```
mysql -u <username> -p < create_db.sql
```                                  
Here, username is the username you have set for your MySQL server. 

Next, the command prompt/terminal will ask you for the password for this user.

Key in the password and the SQL script will be executed, which creates a database, a table "account_info" and populates it with 3 rows of data:

(admin, admin), (user1, pass1) & (user2, pass2)

## 3. Running the Server

If you have not installed Maven in your local computer, click on this link and follow the installation guide https://maven.apache.org/download.cgi

After executing the SQL script, in the command prompt/terminal, run the following command:
```
mvn jetty:run
```
This will start the Jetty server and once the server is started, you can visit our login page by clicking on this link http://localhost:8080/struts-login-app/index

The valid login credentials are those listed in the database.
