<%@page isELIgnored="false" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
    <center>
        <h1>JLC Tech Support</h1>
        <h2>Login Form</h2>
        <font color="red" size=5>${MSG}</font>
        <form action="login.jlc" method="post">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                     <input type="submit" Value="Login"/>
                    </td>   
                </tr>
            </table>
        </form>
        <h2>
            <a href="register.jsp">New User Signup </a> |
            <a href="forgotpw.jsp"> Forgot My Password </a>
        </h2>
    </center>
    </body>
</html>

