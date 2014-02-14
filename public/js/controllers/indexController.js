app.controller('MainCtrl', function($scope, $location, boardService) {
  (function initialize(){
    boardService.findAll().success(function(json){
      console.log(json);
    });
  })();
});

app.controller('SidebarCtrl', function($scope, $location) {
  (function initialize(){
    console.log('SidebarCtrl');
  })();
});