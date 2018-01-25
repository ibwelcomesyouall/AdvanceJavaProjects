<%@page isELIgnored="false" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forget Password</title>
    </head>
    <body>
    <center>
        <h1>JLC Tech Support</h1>
        <h2>Password Assistence Form</h2>
        <font color="red" size=5>${MSG}</font>
        <form action="forgotpw.jlc" method="post">
            <table>
                <tr>
                    <td>Email Id</td>
                    <td><input type="text" name="email"/></td>
                </tr> 
                <tr>
                    <td colspan="2" align="center">
                     <input type="submit" Value="Submit"/>
                    </td>   
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
