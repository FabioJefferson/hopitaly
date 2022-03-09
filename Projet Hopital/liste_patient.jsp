<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>

	<title>Hopital</title>
	 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
     
</head>
<body>
  <nav class="navbar navbar-expand-lg  navbar-custom1">
    <div class="container-fluid">
      
      <ul class="navbar-nav">
        <li class="nav-item">
          <h4 class="navbar-brand navbar-custom"><img src="logo.png"></h4>
        </li>
       <li class="nav-item">
          <table class="nav-link navbar-customcol">
            <tr>
              <th class="nav-link navbar-custompat">PATIENT</th>
            </tr>
            <tr>
              <td class="nav-link navbar-customl1"> <a class="btn" id="bout" href="#" role="button">Nouvel</a> </td>
            </tr>
            <tr>
              <td class="nav-link navbar-customl2 "><a class="btn" id="btn1" href="#" role="button">Modifier</a></td>
            </tr>
            <tr>
              <td class="nav-link navbar-customl3 "><a class="btn"id="btn2" href="#" role="button">Supprimer</a></td>
            </tr>
            <td class="nav-link navbar-customl4"><a class="btn" id="btn3" href="#" role="button">Liste</a></td>
          </tr>
          </table>
           
        </li>
            <li class="nav-item">
              <table class="nav-link navbar-customcol">
                <tr>
                  <th class="nav-link navbar-customch">CHAMBRE</th>
                </tr>
                <tr>
                  <td class="nav-link navbar-custombut">  <a class="btn" href="#" role="button">Voir tous</a></td>
                </tr>
              </table>
               
            </li> 
            <li class="nav-item">
              <table class="nav-link navbar-customcol">
                <tr>
                  <th class="nav-link navbar-custompers">PERSONNELS</th>
                </tr>
                <tr>
                  <td class="nav-link navbar-custompr">  <a class="btn" id="prest" href="#" role="button">Voir prestation</a></td>
                </tr>
              </table>
               
            </li> 
        
      </ul>


      </div>  
  
               
    
                  
            
         
    
  </nav>
<nav class="navbar navbar-expand-lg navbar-custom2 ">
  <div class="container-fluid">
        <ul class="navbar-nav">
      <li class="nav-item">
        <h5 class="navbar-brand navbar-custom">Categorie:</h5>
      </li>
     <li class="nav-item">
        <h6 class="nav-link">
          <select name="nom"size="1">
            <option value="gen">general</option>
            <option value="bla">blabla</option>
          </select>
        </h6>
      
    </ul>


             
  
                
          
      <form class="d-flex" action="#">
        <input class="form-control me-2" type="search" placeholder="PATXXX/Nom/Prenom" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    
  </div>
</nav>
  <div class ="container">
   
  <table id="customers"class="table table-bordered">
      <thead>
      <tr>
          <th scope="col">Image</th>
          <th scope="col">Information Personnelle</th>
          <th scope="col">Information Chambre</th>
        </tr>
      </thead>
      <tbody>
        <tr class="table-secondary">
            <td><img src="homme.png"></td>
            <td><p>Nom:Jefferson</p>
              <p>Prenom:</p>
              <p>Localisation:
                Niveau:
                Salle:
              </p>
              <p>Numero Patient:</p>
            </td>
            <td><p>Categorie:</p>
                <p class="col col-md-6">Localisation:
                  Niveau:
                  Salle:
                </p>
                <p>Duree de sejour:</p>
                <a href="#">modifier</a>
                <a href="#">supprimer</a>
             </td>
        </tr>
        <tr>
          <td><img src="femme.png"></td>
            <td><p>Nom:Jefferson</p>
              <p>Prenom:</p>
              <p>Localisation:
                Niveau:
                Salle:
              </p>
              <p>Numero Patient:</p>
            </td>
            <td><p>Categorie:</p>
              <p class="col col-md-6">Localisation:
                Niveau:
                Salle:
              </p>
              <p>Duree de sejour:</p>
              <a href="#">modifier</a>
              <a href="#">supprimer</a>
        </tr>
        <tr class="table-secondary">
            <td><img src="homme.png"></td>
            <td><p>Nom:Jefferson</p>
              <p>Prenom:</p>
              <p>Localisation:
                Niveau:
                Salle:
              </p>
              <p>Numero Patient:</p>
            </td>
            <td><p>Categorie:</p>
              <p class="col col-md-6">Localisation:
                Niveau:
                Salle:
              </p>
              <p>Duree de sejour:</p>
              <a href="#">modifier</a>
              <a href="#">supprimer</a>
            </td>
        </tr>
      <tbody>
    </table>
</div>

<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
 
  <div class="footer-copyright text-center py-3">
    <a class="bi bi-reply" id="back" href="#"><svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-reply" viewBox="0 0 16 16">
      <path d="M6.598 5.013a.144.144 0 0 1 .202.134V6.3a.5.5 0 0 0 .5.5c.667 0 2.013.005 3.3.822.984.624 1.99 1.76 2.595 3.876-1.02-.983-2.185-1.516-3.205-1.799a8.74 8.74 0 0 0-1.921-.306 7.404 7.404 0 0 0-.798.008h-.013l-.005.001h-.001L7.3 9.9l-.05-.498a.5.5 0 0 0-.45.498v1.153c0 .108-.11.176-.202.134L2.614 8.254a.503.503 0 0 0-.042-.028.147.147 0 0 1 0-.252.499.499 0 0 0 .042-.028l3.984-2.933zM7.8 10.386c.068 0 .143.003.223.006.434.02 1.034.086 1.7.271 1.326.368 2.896 1.202 3.94 3.08a.5.5 0 0 0 .933-.305c-.464-3.71-1.886-5.662-3.46-6.66-1.245-.79-2.527-.942-3.336-.971v-.66a1.144 1.144 0 0 0-1.767-.96l-3.994 2.94a1.147 1.147 0 0 0 0 1.946l3.994 2.94a1.144 1.144 0 0 0 1.767-.96v-.667z"/>
    </svg>
   </a>
    <a class="btn" href="#">2</a>
    <a class="btn" href="#">3</a>
    <a class="btn" href="#">4</a>
    <a class="btn" href="#">5</a>
    <a class="btn" href="#">6</a>
    <a class="btn" href="#">7</a>
    <a class="btn" href="#">8</a>
    <a class="btn" href="#">9</a>
    <a class="bi bi-play" id="next" href="#"><svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-play" viewBox="0 0 16 16">
    
      <path d="M10.804 8 5 4.633v6.734L10.804 8zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C4.713 12.69 4 12.345 4 11.692V4.308c0-.653.713-.998 1.233-.696l6.363 3.692z"/>
    
    </svg>
    </a>
     
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->

</body>
</html>
 