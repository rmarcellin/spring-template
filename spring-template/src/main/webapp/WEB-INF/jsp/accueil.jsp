<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<h1> Identité </h1>
		<table>
			<tr>
				<td>${ user.nom } 		</td>
				<td>${ user.prenom } 	</td>
			</tr>
			<tr>
				<td> Âge :</td>
				<td> ${ user.age }</td>
			</tr>
			<tr>
				<td> Email :</td>
				<td> ${ user.email } </td>
			</tr>
			<tr> 
				<td> <h3> Adresse : </h3></td>
				<td> 
					<table>
						<tr> 
							<td>${ user.adresse.numeroVoie } ${ user.adresse.voie } </td>
						</tr>
						<tr> 
							<td>${ user.adresse.codePostale } ${ user.adresse.localite }</td> 
						</tr>
					</table>				
				</td>
			</tr>
		</table>
	</body>
</html>