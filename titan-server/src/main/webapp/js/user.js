function UserController($scope, $http) {
    $http.get('http://localhost:8080/titan-server/users/1').
        success(function(data) {
            $scope.user = data;
        });
}