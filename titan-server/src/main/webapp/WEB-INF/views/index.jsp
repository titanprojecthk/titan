<!doctype html>
<html ng-app>
	<head>
		<title>Hello AngularJS</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script src="js/user.js"></script>
	</head>

	<body>
		<div ng-controller="UserController">
			<p>The Email is {{user.email}}</p>
		</div>
	</body>
</html>