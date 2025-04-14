# [Guvi Zen](https://www.guvi.io/zen/)

## HTML Task to know usage of basic tags.

Answers:

1. Fix the bugs in below snippet 

```HTML
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

```
2. Try the below one

```HTML
<h2>Contact Us</h2>
<form>
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Subject: <input type="text" name="subject" required><br><br>
    Message: <textarea name="message" required></textarea><br><br>
    <input type="submit" value="Submit">
</form>
```

---

3. Design a contact us form with all fields as required.

---



---

4. Use certain HTML elements to display the following in a HTML page.

- Programming Language
  - JavaScript
    1. Angular
    2. React
    3. Vue.js
  - Python
    1. Django Framework
    2. Flask Framework
  - Java
    1. Spring
    2. Maven
    3. Hibernate
- Database
  - MySQL
  - MongoDB
  - Cansandra


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

---

5. Create an element that helps you to open the https://google.com in separate new tab.

<a href="https://google.com" target="_blank">Open Google</a>
---

6. In the form, add two radio buttons with grouping them for employee type(Salaried and own business)

<h3>Employee Type</h3>
<form>
    <input type="radio" name="employeeType" value="salaried" required> Salaried<br>
    <input type="radio" name="employeeType" value="ownBusiness"> Own Business<br>
</form>
---

7. Design form shown in the link (http://evc-cit.info/cit040/formguide/card_0.png)

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
---

8. Use the table tag to design given image [Click here](https://www.bapugraphics.com/assets/img/port_upload_dir/table-4.jpg).


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
---

9. Write HTML input tags snippet to show default values for all Form elements.


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

---

10. In your, HTML page add the below line and Highlight it without using any CSS.

- "HTML & CSS is awesome"


<mark>HTML & CSS is awesome</mark>

---

11. Create an HTML page, which should contain all types of input elements.
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
