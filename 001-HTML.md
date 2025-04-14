1. Fix the bugs in below snippet
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    guvi
    <div>
        Lorem ipsum dolor sit amet consectetur adipisicing elit.
        <div>
            <div>
                Guvi Geek Network
            </div>
        </div>
    </div>
</body>
</html>

2. Design a contact us form with all fields as required
<h2>Contact Us</h2>
<form>
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Subject: <input type="text" name="subject" required><br><br>
    Message: <textarea name="message" required></textarea><br><br>
    <input type="submit" value="Submit">
</form>


3. Use HTML elements to display the following
<h2>Programming Languages & Technologies</h2>
<ul>
    <li>Programming Language
        <ul>
            <li>JavaScript</li>
            <li>Angular</li>
            <li>React</li>
            <li>Vue.js</li>
            <li>Python</li>
            <ul>
                <li>Django Framework</li>
                <li>Flask Framework</li>
            </ul>
            <li>Java</li>
            <ul>
                <li>Spring</li>
                <li>Maven</li>
                <li>Hibernate</li>
            </ul>
        </ul>
    </li>
    <li>Database
        <ul>
            <li>MySQL</li>
            <li>MongoDB</li>
            <li>Cassandra</li>
        </ul>
    </li>
</ul>


4. Create a link to open Google in a new tab
<a href="https://google.com" target="_blank">Open Google</a>


5. Radio buttons grouped for employee type (Salaried & Own Business)
<h3>Employee Type</h3>
<form>
    <input type="radio" name="employeeType" value="salaried" required> Salaried<br>
    <input type="radio" name="employeeType" value="ownBusiness"> Own Business<br>
</form>


6. Design form as shown in the image
<h3>Credit Card Form</h3>
<form>
    Name on Card: <input type="text" name="cardname" required><br><br>
    Card Number: <input type="text" name="cardnumber" required><br><br>
    Expiration Date:
    <select name="month" required>
        <option value="">Month</option>
        <option>01</option><option>02</option><option>03</option>
        <!-- ... -->
        <option>12</option>
    </select>
    <select name="year" required>
        <option value="">Year</option>
        <option>2025</option><option>2026</option>
    </select><br><br>
    CVV: <input type="text" name="cvv" required><br><br>
    <input type="submit" value="Submit">
</form>


7. Use <table> to design the given layout
    <h3>Simple Table</h3>
    <table border="1">
        <tr>
            <th>Language</th>
            <th>Framework</th>
        </tr>
        <tr>
            <td>Python</td>
            <td>Django</td>
        </tr>
        <tr>
            <td>Java</td>
            <td>Spring</td>
        </tr>
    </table>

    
8. HTML input tags snippet with default values

<form>
    Text: <input type="text" value="Default Text"><br><br>
    Email: <input type="email" value="user@example.com"><br><br>
    Number: <input type="number" value="10"><br><br>
    Date: <input type="date" value="2025-01-01"><br><br>
    Checkbox: <input type="checkbox" checked><br><br>
    Radio: <input type="radio" name="r1" checked> Option<br><br>
    Textarea: <textarea>Default message</textarea><br><br>
    Select:
    <select>
        <option selected>Option 1</option>
        <option>Option 2</option>
    </select><br><br>
</form>


9. Highlight “HTML & CSS is awesome” without using CSS

<mark>HTML & CSS is awesome</mark>


10. Create an HTML page with all input types

<h3>All Input Types</h3>
<form>
    Text: <input type="text"><br><br>
    Password: <input type="password"><br><br>
    Email: <input type="email"><br><br>
    Number: <input type="number"><br><br>
    Date: <input type="date"><br><br>
    Time: <input type="time"><br><br>
    Checkbox: <input type="checkbox"><br><br>
    Radio: <input type="radio" name="sample"><br><br>
    Color: <input type="color"><br><br>
    Range: <input type="range"><br><br>
    File: <input type="file"><br><br>
    Hidden: <input type="hidden" value="hidden"><br><br>
    Submit: <input type="submit"><br><br>
    Reset: <input type="reset"><br><br>
    Button: <input type="button" value="Click Me"><br><br>
    URL: <input type="url"><br><br>
    Tel: <input type="tel"><br><br>
    Search: <input type="search"><br><br>
</form>
