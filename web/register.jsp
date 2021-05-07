
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <script src="https://kit.fontawesome.com/5eb161e28e.js"></script>
    </head>
     <style>
        body {
            font-family: 'Mukta', sans-serif;
/*            background: url("img/drink11.jpg") no-repeat;
            background-size: 100%;*/
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
            border: none;
            color: #fff;
            padding: 11px 15px;
            text-transform: uppercase;
            font-family: 'Mukta', sans-serif;
            font-size: 16px;
            width:100%;
            letter-spacing: 2px;
            cursor: pointer;
            transition: 0.5s all;
            border-radius: 35px;
            background-color: lightskyblue;
            margin-top: 20px
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
            font-size: 15px;
            letter-spacing: 2px;
            font-weight: normal;
            text-transform: uppercase;
            color: #fff !important;
        }
        

    </style>
    <body>
        <a href="home"><img src="img/logo5.png" style="height:100px; margin-left: 37%" alt="Drinkstore logo"></a>
        <div class="content-w3ls">
            <div class="text-center icon">
                <span class="fa fa-user"></span>
            </div>

            <div class="content-bottom">

                <form action="register" method="post">

                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="username" id="text1" type="text" value="" placeholder="Username" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="password" id="myInput" type="Password" placeholder="Password" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="repassword" id="myInput2" type="Password" placeholder="Confirm Password" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="email" id="email" type="email" placeholder="Email" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="phone" id="phone" type="text" placeholder="Phone" required >
                        </div>
                    </div>
                    <div class="field-group">
                        <div class="wthree-field">
                            <input name="address" id="address" type="text" placeholder="Address" required >
                        </div>
                    </div>
                    <input type="checkbox" name="check" required/>To register with us please tick to agree to our Term and Conditions.<br>
                    <div class="wthree-field">
                        <input type="submit" class="btn" id="register" value="Register">
                    </div>
                        <%
                            if (request.getAttribute("errMess") != null) {
                        %>
                        <h2 style="color: red"><%= request.getAttribute("errMess")%></h2>
                        <%
                            }
                        %>
                </form>
            </div>
        </div>
    </body>
</html>
