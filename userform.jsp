<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Registration Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 20px;
    }
    
    h1 {
      text-align: center;
      color: #333333;
    }
    
    .container {
      max-width: 400px;
      margin: 0 auto;
      background-color: #ffffff;
      padding: 80px;
      border-radius: 5px;
      box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    }
    
    label {
      font-weight: bold;
      display: block;
      margin-bottom: 10px;
    }
    
    input[type="text"],
    input[type="email"],
    input[type="password"],
    input[type="file"],
    input[type="number"]{
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
      margin-bottom: 20px;
    }
    
    input[type="submit"] {
      background-color: #4CAF50;
      color: #ffffff;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }
    
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>User Registration</h1>
   
    <form action="add" method="POST" enctype="multipart/form-data">
    
    <label for="uid">User I,D:</label>
      <input type="number" name="uid" required>
      
      <label for="uname">User Name:</label>
      <input type="text" name="uname" required>
      
       <label for="ugender">User Gender:</label>
      <input type="text" name="ugender" required>
      
      <label for="umn">User Mobile NO.</label>
      <input type="text" name="umn" required>
      
      <label for="ucity">User City</label>
      <input type="text" name="ucity" required>
      
       <label for="upincode">User PinCode</label>
      <input type="number" name="upincode" required>
      
       <label for="uemail">User Email:</label>
      <input type="email" name="uemail" required>
      
      <label for="upwd">Password:</label>
      <input type="password" name="upwd" required>
      
      
      <label for="profile_picture">Profile Picture:</label>
      <input type="file" name="profile_picture">
      
      <input type="submit" value="Register">
    </form>
  </div>
</body>
</html>
