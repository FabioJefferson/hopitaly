<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>

	<title>Hopital</title>
	 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="prest.css">
     
</head>

<body>
<form action="#" method="get">
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

        <div class="container" id="boite">
            <h4 id="text">Fiche de prestation de XXXX du mois de mm20XX</h4>
        <div class="row" id="accueil">
            <p id="sary"class="col"><img src="homme.png"></p>
            <label class="col-md-10">
              <p>NUM:PER0001</p>
              <p>NOM: JEFFERSON</p>
              <p>PRENOM: AMBININTSOA</p>
              

            </label>
            <div class="row" id="table">
              <table id="table1"class="table table-bordered col col-md-6">
                <thead>
                <tr>
                    <th>Patient</th>
                    <th>Chambre</th>
                    <th>Periode</th>
                    <th>Prestation</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                      <td>PAT1098</td>
                      <td>Salle 3</td>
                      <td>2jrs</td>
                      <td>20000</td>
                    </tr>
                    <tr>
                      <td>PAT1098</td>
                      <td>Salle 3</td>
                      <td>2jrs</td>
                      <td>20000</td>
                    </tr>
                    <tr>
                      <td>PAT1098</td>
                      <td>Salle 3</td>
                      <td>2jrs</td>
                      <td>20000</td>
                    </tr>
                    <tr>
                      <td>PAT1098</td>
                      <td>Salle 3</td>
                      <td>2jrs</td>
                      <td>20000</td>
                    </tr>
                </tbody>
              </table> 
              
            </div>
            <label id="total">TOTAL PAR PATIENT:2000000AR</label>
            <div class="row" id="foot">
              <p id="footers">
              <select name="nom"size="1" id="taille">
                <option value="gen">mois</option>
                <option value="bla">blabla</option>
              </select>
              <select name="nom"size="1" id="tailles">
                <option value="gen">annee</option>
                <option value="bla">blabla</option>
              </select>
              <input type="submit" value="Fiche de prestation">
              
              </p>
            </div>
            
            
        
        </div>
</form>
</body>
</html>
