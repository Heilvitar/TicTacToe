function clicked(id){
	console.log(id);
	$.ajax({
	    type: 'POST',
	    url: '/clickColumn',
	    data: 'id=' + id,
	    success: function(){
		console.log("response");
		var audio = $("#mySoundClip")[0];
		audio.play();
	    },
	    error: function(){
	    	console.log("shits fucked");
	    }
	});
}
