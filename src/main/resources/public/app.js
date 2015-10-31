function clicked(id){
	console.log(id);
	$.ajax({
	    type: 'POST',
	    url: '/clickColumn',
	    data: 'id=' + id,
	    success: function(){
		console.log("response");
	    },
	    error: function(){
	    	console.log("shits fucked");
	    }
	});
}
