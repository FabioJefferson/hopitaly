<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>

	<title>Hopital</title>
	 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="paie.css">
     
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
            <h4 id="text">Fiche de paiements</h4>
            <div class="row" id="accueil">
              <label class="col col-md-3" id="num">
                NUM: PAT10001
              </label>
              <label class="col col-md-4" id="num">
                NOM: JEFFERSON
              </label>
              <label class="col col-md-5" id="num">
              PRENOM:AMBININTSOA FABIO
              </label>
               
            </div>
            <div class="row" id="2">
              <table id="table1"class="table table-bordered">
                <thead>
                <tr>
                    <th scope="col" class="col col-md-3">Somme Interventions</th>
                    <th scope="col" class="col col-md-3">Somme logement</th>
                    <th scope="col"class="col col-md-3">Total</th>
                    <th scope="col"class="col col-md-3">Date d'hospitalisation</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                      <td>165000</td>
                      <td>200000</td>
                      <td>525000Ar</td>
                      <td>25-03-22</td>
                    </tr>
                </tbody>
              </table> 
              <h4 id="historique">Histoire depaiement</h4>
            </div>
            <div class="row" id="2">
              <table id="table1"class="table table-bordered">
                <thead>
                <tr>
                    <th scope="col" class="col col-md-3">Payeur</th>
                    <th scope="col" class="col col-md-3">Sommeverse</th>
                    <th scope="col"class="col col-md-3">Reste a payer</th>
                    <th scope="col"class="col col-md-3">Date du versement</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                      <td>Randria</td>
                      <td>200000</td>
                      <td>325000Ar</td>
                      <td>25-03-22</td>
                    </tr>
                </tbody>
              </table> 
               
            </div>
            <div class="row" id="3">
              <form action="#" method="post">
              <label id="foot">Nouveau paiement</label>
              <p id="footer" class="col col-md-4">Payeur:<input type="text"></p>
              <p id="footer" class="col col-md-5">Somme a verser:<input type="text"></p>
              <p id="footer" class="col col-md-3"><input type="submit" name="paye" value="payer" id="boutn"></p>
            </div>
        </div>
            


</form>
</body>
</html>