app.service('boardService', function($http){
  this.findAll2 = function(){
    return $http({
      url : url,
      data : $.param(params),
      method : 'POST',
      headers : {'Content-Type' : 'application/x-www-form-urlencoded'}
    });
  };

  this.findAll = function(){
    return $http.get('boards');
  };
});