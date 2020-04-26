<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
    <HEAD>
        <title>Fresherpro</title>
        <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&display=swap" rel="stylesheet">
        <style>
body {
  background-image: url(https://wallpapercave.com/wp/wp3191229.png);
    background-size: cover;
    background-attachment: fixed;
}
.aa{
  width: 350px;
    height: 200px;
    background-color: rgba(0,0,0,0.25);
    margin-left: 150px;
    margin-top: 129px;
    padding-top: 50px;
    padding-left: 20px;
    border-radius: 15px;
    color: black;
    font-weight: bold;
}
.aa input[type="text"]{
    width: 200px;
    height:35px;
    border-radius: 5px;
    font-family:monospace;
}      
.aa input[type="password"]{
    width: 200px;
    height:35px;
    border-radius: 5px;
    font-family:monospace;
}      
.aa input[type="submit"]{
    width: 80px;
    height:35px;
    border-radius: 5px;
    margin-left: 90px;
    font-family: cursive;
}    
.aa label{
    font-size: 20px;
    font-family: cursive;
}
            .a{
                margin-top: 100px;
                margin-left: 80px;
                font-size: 80px;
                font-family: 'Dancing Script';
            }
</style>
    </HEAD>
    <body>
        <div class="a">
            <p>Fresher Pro Learnings</p>
        </div>
    <div class="aa">
        <form action="validate" method="post">
            <label for="name">Username</label>
            <input type="text"  id="name" name="username" placeholder="Enter the username" required><br><br>
            <label for="password">Password </label>
        <input type="password" id="password" name="password" placeholder="Enter the password" required><br><br>
            <input type="submit"  placeholder="Enter the username" value="Login"><br>
        </form>
        </div>
    </body>
</HTML>