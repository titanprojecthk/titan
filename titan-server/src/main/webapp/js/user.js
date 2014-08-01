function UserController($scope, $http) {
    $http.get('/titan-server/user/1').
        success(function(data) {
            $scope.user = data;
        });
}