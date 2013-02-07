<%-- 
    Document   : index
    Created on : Feb 4, 2013, 4:46:29 PM
    Author     : Neal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Mouthful Eatery!</h1>
        <h2>Please make your order by checking the boxes below</h2>

        <form method="POST" action="front?action=checkboxes">
            <!-- Remember, using the %= notation below is a shortcut for out.print -->
            <input type="checkbox" name="menuItems" value="New York Strip" /> New York Strip, $23.95<br/>
            <input type="checkbox" name="menuItems" value="Greek Salad" /> Greek Salad, $8.95<br/>
            <input type="checkbox" name="menuItems" value="Coca-Cola" /> Coca-Cola, $1.95<br/>
        </form>

        <!-- Button to place the order -->
        <br/>
        <input type="submit" value="Place Order" name="submit"
               onsubmit=
        
        <%
            try {
                String[] values = request.getParameterValues("menuItems");
                for (String item : values) {
                    System.out.println(item);
                }
            } catch (NullPointerException npe) {
                System.out.println("");
            }
        %>
        >
    </body>
</html>
