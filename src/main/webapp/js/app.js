var app = angular.module("geektic", ['ngRoute']);

app.config(function($routeProvider){
    
    $routeProvider
    .when('/', {
        templateUrl: '/views/accueil.html'})
    .when('/Geeks/:sexe', {
        templateUrl: '/views/GetLesGeeks.html',
        controller: 'Geeks'})
    .when('/GeeksById/:id', {
        templateUrl: '/views/LeGeeks.html',
        controller: 'LeGeek'})
        
});
app.controller('LeGeek', function($scope, $http, $routeParams) {
	
	 $http.get('/GeeksById/' + $routeParams.id).success(function(Geek) {
	        $scope.LeGeek = Geek;
	 });
});

app.controller('Geeks', function($scope, $http, $routeParams) {
	
	 $http.get('/Geeks/' + $routeParams.sexe).success(function(Geeks) {
	        $scope.Geeks = Geeks;
	 });
	 
   /* $http.get('/Geeks').success(function(Geeks) {
        $scope.Geeks = Geeks;
    });*/
	 
    $http.get('/Interets').success(function(Interets) {
        $scope.Interets = Interets;
    });
});