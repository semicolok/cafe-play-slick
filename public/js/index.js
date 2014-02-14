var app = angular.module('cafe', ['ngRoute']);

app.config(function($routeProvider) {
  $routeProvider
    .when('/',
    {
      controller  : 'MainCtrl',
      templateUrl : 'assets/partials/main.html'
    })
    .otherwise(
    {
      redirectTo : '/'
    })
});
