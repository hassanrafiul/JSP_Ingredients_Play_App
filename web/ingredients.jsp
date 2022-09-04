<%-- 
    Document   : ingredients
    Created on : Jul 20, 2022, 3:31:08 PM
    Author     : rafiu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Ingredient.Ingredient" %>


<c:import url="/views/header.jsp" />


<h1>Welcome to the Ingredient Calculator For Biryani!</h1>

<h2>Biryani Recipe</h2>

<p>Prepping Procedure: </p>
<p> This Recipe is for 2-3 person.</p>
<p>1. Soak the Basmati Rice in a bowl for 20 mins. </p>
<p>2. While the Rice is soaking lets marinate our bone-in chicken with half of the Yogurt and one fourth of the SHAN SINDHI BIRYANI MASALA and let it seat for 20 mins.</p>
<p>3. Lets cut our Potatoes in Two if medium and four if large. (skin peeled off) (better if you like it with the skin but cut it in cubes then fry it in a pan with high heat before putting in to the pan).</p>
<p>4. Julienne the Onions and keep it separate.</p>
<p>5. lets cut our tomatoes into cubes as well.</p>
<p>6. Finely chop the cilantro.</p>
<p>7. and Finally slice the green chilli in the middle and keep in a bowl.</p>


<p>Directions:</P>
<p>Take a cast iron pan or a flat pan heat it up all the way. now add One fourth cup of Olive Oil And One Fourth Cup of Clarified Butter. 
Then sear your Marinated Chicken make sure we are looking for that golden crust and our chicken to cook ONLY HALFWAY.
As we are searing our chicken lets take a big pot and heat it up with One fourth cup of our Olive oil and one fourth cup of our Clarified butter.
then add half cup of our Julienne Onions and we are then add all our cloves, bay leaf, cardamon, cinnamon and whole peppers. and fry it until its almost golden brown.
Now add your soaked Rice make sure to drain all the water as best as you can. Then Fry the rice with medium heat make sure to stir it continuously for 5 - 8 mins.
While Frying the Rice Add rest of the SHAN SINDHI BIRYANI MASALA, rest of the Yogurt, tomatoes and half of the cilantro and all the fried Potatoes and keep on stirring. 
As your are doing this the chicken should be done searing keep it in a separate bowl scrap all the goodies from the pan as well.
Now Add Boiling Water to the pot with rice and Add you Sear chicken. and stir it for a sec.
Keep the Lid On and let it simmer for 30- 45 mins in medium to low heat.
Then on the flat pan add some cooking oil and fry the rest of the julienne onions until its crispy brown.
Finally the magic hours we gonna take the lid off and serve the the crispy onions on top and with lemons and cilantro.</p>

<form action="Ingredientss" method="post">
    <select name="baseAmounts">
        <option value="4">1/4</option>
        <option value="0.5">1/2</option><!-- comment -->
        <option value="1">1</option>    
        <option value="2">2</option><!-- comment -->
        <option value="3">3</option><!-- comment -->
        <option value="4">4</option><!-- comment -->

    </select>
    <input type="submit" value="Submit">
</form>


<table>
    <tr>
        <th>Name</th><!-- comment -->
        <th>Measure</th>
        <th>Quantity</th>
        <th>Base Amount</th>
    </tr>

    <tr>
        <td>${ingredientss.name}</td>
        <td>${ingredientss.measure}</td>
        <td>${ingredientss.quantity}</td><!-- comment -->
        <td>${ingredientss.baseAmount}</td>
    </tr>
    <c:forEach var="ingredientInList"  items ="${ingredients}">
        <tr>
            <td>${ingredientInList.name}</td>
            <td>${ingredientInList.measure}</td>
            <td>${ingredientInList.quantity}</td>
            <td>${ingredientInList.baseAmount}</td>
        </tr>
    </c:forEach>
        


</table>


<c:import url="/views/footer.jsp"/>
