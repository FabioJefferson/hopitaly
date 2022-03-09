<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 

<!DOCTYPE html>
<html lang="en">
<head>

	<title>Hopital</title>
	 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="ajouter.css">
     
</head>

<body>
<form action="modif_patient.jsp" method="get">
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
     <div class="container" id="center">
        <div id="modif" class="form-row">
          <div class="form-group row">
            <div class="col col-md-6">
                  
                    <h4 id="text">Nouveau Patient
                    </h4>
                   <form action="#" method="post"> 
                    <p><input type="nom" class="form-control" id="inputNom" placeholder="Nom Patient"></p> 
                    <p><input type="prenom" class="form-control" id="prenom" placeholder="Prenom Patient"></p>
                    <p><input type="profession" class="form-control" id="profession" placeholder="Profession"> </p>
                    <p><input type="poids" class="form-control" id="poids" placeholder="Poids"></p>
                          <div class="form-check">
                            <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
                                <label class="form-check-label" for="gridRadios1">
                                         Homme
                                 </label>
                      

                          </div>
                         
                          <div class="form-check">
                            <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2" checked>
                                <label class="form-check-label" for="gridRadios1">
                                         Femme
                                 </label>
                      

                          </div>
                      
                     
            </div>
            <div class="col col-md-6">
              <p><input type="adresse" class="form-control" id="input1" placeholder="Addresse"></p>
              <p><input type="phone" class="form-control" id="mob" placeholder="telephone"></p> 
              <p><input type="email" class="form-control" id="mail" placeholder="email"></p> 
              <p><input type="date" class="form-control" id="daty" placeholder="Date de Naissance"></p> 
              <p><input type="submit" id="confirmer" value="Ajouter" ></p> 
            </div>
          
               
                
               

          </div>
      
                  
               
        </div>    
     </div>     
    
            
        
        
</body>
               
</form>                

                     
                    
                      
                     
            
                 
      
                    
              
           
      
 
</html>