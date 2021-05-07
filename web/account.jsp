
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
        <script src="https://kit.fontawesome.com/5eb161e28e.js"></script>
    </head>
    <style>
        body {
            background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
            background-size: 400% 400%;
            animation: gradient 10s ease infinite;
        }

        @keyframes gradient {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }
        .text-center {
            text-align: center;
        }

        /*/////////////// FONT STYLES ////////////////////*/
        .content-w3ls {
            max-width: 500px;
            margin: 6em auto;
        }
        .icon span.fa{
            font-size: 60px;
            color: #eee;
        }
        .icon{
            margin-bottom:3em;
        }
        .content-bottom {
            padding: 0em 4em;
            margin: 0 1em;
            position: relative; 
            z-index: 1;
        }
        .logo h1 a {
            font-size: 25px;
            color: #fff;
            text-transform: capitalize;
            font-weight: 600;
            letter-spacing: 1px;
        }

        .field-group label {
            font-size: 15px;
        }

        /*/////////////// FORM STYLES ////////////////////*/

        form .field-group {
            background: rgba(255, 255, 255, 0.15);
            display: flex;
            display: flex;
            margin-bottom: 20px;
            padding: 2px 10px 2px 0;
            border-radius: 35px;
        }

        form .field-group span {
            flex: 1;
            width: 20%;             
            color: #fff;
/*            background: transparent;*/
            line-height: 49px;
            text-align: right;
        }

        form .field-group .wthree-field {
            flex: 4 50%;
        }

        .wthree-field .btn {
            background: #fc636b;
            border: none;
            color: white;
            padding: 11px 15px;
            text-transform: uppercase;
            font-family: 'Mukta', sans-serif;
            font-size: 16px;
            width:100%;
            margin-top:10px;
            letter-spacing: 2px;
            cursor: pointer;
            transition: 0.5s all;
            border-radius: 35px;
        }

        .wthree-field input {
            padding: 10px 0 10px 15px;
            font-size: 17px;
            font-weight: 300;
            color:#ddd;
            letter-spacing: 1px;
            border: none;
            background: transparent;
            box-sizing: border-box;
            font-family: 'Mukta', sans-serif;
            width: 100%;
            outline: none;
        }


        form .register a {
            font-weight: normal;
            text-transform: uppercase;
            color: #fff !important;   
            text-decoration: none;
            background: lightskyblue;;
            border: none;
            padding: 11px 82px;
            text-transform: uppercase;
            font-family: 'Mukta', sans-serif;
            font-size: 16px;
            width:100%;
            margin-top:10px;
            letter-spacing: 2px;
            cursor: pointer;
            transition: 0.5s all;
            border-radius: 35px;
        }

    </style>
    <body>
        <a href="home"><img src="img/logo5.png" style="height:100px; margin-left: 37%" alt="Drinkstore logo"></a>
        <div class="content-w3ls">
            <div class="text-center icon">
                <span class="fa fa-user"></span>
            </div>

            <div class="content-bottom">
            <%
            Cookie[] list = request.getCookies();
            String u = "";
            String p = "";
            String r = "";
            if (list!=null) {
                    for (int i = 0; i < list.length; i++) {
                            if (list[i].getName().equals("cuser")) {
                                    u=list[i].getValue();
                                }
                            if (list[i].getName().equals("cpass")) {
                                    p=list[i].getValue();
                                }
                            if (list[i].getName().equals("crem")) {
                                    r=list[i].getValue();
                                }
                        }
                }
             %>
                <form action="login" method="post">

                    <div class="field-group">
                        <span class="fa fa-user" aria-hidden="true"></span>
                        <div class="wthree-field">
                            <input name="username" id="text1" type="text" value="<%=u%>" placeholder="Username" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <span class="fa fa-lock" aria-hidden="true"></span>
                        <div class="wthree-field">
                            <input name="password" id="myInput" type="password" value="<%=p%>" placeholder="Password" required >
                        </div>
                    </div>
                    <input type="checkbox" id="remember" name="rem" value="on"
                    <%= "on".equals(r.trim()) ? "checked='check'" : "" %>/>Remember me<br>
                    <div class="wthree-field">
                        <input type="submit" class="btn" value="LOGIN">
                    </div>
                    <div class="register" style="margin-top: 20px;">
                        <a href="register.jsp">CREATE ACCOUNT</a>
                    </div>
                </form>
                <%
                    if (request.getAttribute("error") != null) {
                %>
                <h2 style="color: white"><%= request.getAttribute("error")%></h2>
                <%
                    }
                %>
            </div>
        </div>
    </body>
</html>
