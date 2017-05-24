<html>
<head>
 
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <%@ include file="/WEB-INF/views/header.jsp" %>
<style>
div.gallery {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
}

div.gallery:hover {
    border: 1px solid #777;
}

div.gallery img {
    width: 100%;
    height: auto;
}

div.desc {
    padding: 15px;
    text-align: center;
}

  </style>
</head>
<body> <!--  background="resources/images/b2.jpg">-->
	
	<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="./resources/images/c1.jpg" alt="Los Angeles" style="height:50%; width:100%;">
      </div>

      <div class="item">
        <img src="./resources/images/c2.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="./resources/images/c3.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<br><br><br><div class="gallery">
  <a target="_blank" href="productdesc.jsp">
    <img src="./resources/images/p1.jpeg"  width="300" height="200">
  </a>
  <div class="desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="#">
    <img src="./resources/images/p2.jpeg"  width="600" height="400">
  </a>
  <div class="desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="#">
    <img src="./resources/images/p3.jpeg"  width="600" height="400">
  </a>
  <div class="desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="#">
    <img src="./resources/images/p4.jpeg"  width="600" height="400">
  </a>
  <div class="desc">Add a description of the image here</div>
  </div>
  
<div class="gallery">
  <a target="_blank" href="#">
    <img src="./resources/images/p5.jpeg"  width="600" height="400">
  </a>
  <div class="desc">Add a description of the image here</div>  
</div>

<div class="gallery">
  <a target="_blank" href="#">
    <img src="./resources/images/p6.jpeg"  width="600" height="400">
  </a>
  <div class="desc">Add a description of the image here</div>

</body>
<%@include file="/WEB-INF/views/footer.jsp" %>
</html>
