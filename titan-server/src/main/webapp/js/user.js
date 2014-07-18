function UserController($scope, $http) {
    $http.get('/titan-server/city/1').
        success(function(data) {
            $scope.user = data;
        });
}