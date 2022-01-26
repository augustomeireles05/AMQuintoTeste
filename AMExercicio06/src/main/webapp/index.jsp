<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio 06 - Triangulos & Áreas</title>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

	<!-- BEGIN MAIN -->

    <div class="p-3">
        <div class="container d-flex justify-content-center">
            <div class="col-12 col-md-8 col-lg-4 d-flex justify-content-center shadow shadow-container mt-5 mb-5 p-3 bg-secondary">
                <form class="col-12 col-md-6 col-lg-10 px-2" method="post" action="PrimeiroServlets"> <!--  MUITO IMPORTANTE: METHOD E ACTION -->
                    <div class="text-center mb-4">
                        <h3 class="font-title-recuperarsenha">Informe valores para A, B e C:</h3>
                        
                    </div>
                    <div class="col-12 col-md-12 col-lg-12 w-100">
                        <label class="label" for="name">Valor A: </label>
                        <input class="w-100 mb-2" type="text" name="valA"/>
                    </div>
                    
                    <div class="col-12 col-md-12 col-lg-12 w-100">
                        <label class="label" for="name">Valor B:</label>
                        <input class="w-100 mb-4" type="text" name="valB"/>
                    </div>
                    
                    <div class="col-12 col-md-12 col-lg-12 w-100">
                        <label class="label" for="name">Valor C:</label>
                        <input class="w-100 mb-4" type="text" name="valC"/>
                    </div>
                    <div class="d-grid gap-2 d-md-flex justify-content-md-center">
  						<button class="btn btn-dark me-md-2" type="reset" value="Limpar">Limpar</button>
  						<button class="btn btn-dark" type="submit" name="btnVerificar" value="Verificar">Verificar</button>
					</div>
                </form>
            </div>
        </div>
    </div>
    
    <!-- END MAIN -->

</body>
</html>