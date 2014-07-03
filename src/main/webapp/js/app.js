var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});
app.controller('Geeks', function($scope, $http) {
    $http.get('/Geeks').success(function(Geeks) {
        $scope.Geeks = Geeks;
    });
});