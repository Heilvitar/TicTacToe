window.onload = function() {
	resetGame();
}
var on;

function clicked(id){
	console.log("on: " + on);
	if(on === "0"){
		return;
	}
	$.ajax({
	    type: 'POST',
	    url: '/clickColumn',
	    data: 'id=' + id,
	    dataType: 'json',
	    success: function(res){
		console.log(res);
		var audio = $("#mySoundClip")[0];
		audio.play();
		console.log(res.win);
		if(res.won !== undefined){
			if(res.won === "t"){
				console.log("t won!");
				showImage(res.player, id);
				$('#status').text('Tie!');
			}
			else if(res.won === "x"){
				showImage(res.player, id);
				console.log("x won!");
				$('#status').text('Player 1 WON!');				
			}
			else{
				showImage(res.player, id);
				console.log("o won!");
				$('#status').text('Player 2 WON!');
			}
			console.log("won!");
			on = "0";
		}
		else if(res.success === "1" && res.player === "x"){
			showImage(res.player, id);
			$('#status').text('Player 2 turn');
		}
		else if(res.success === "1" && res.player === "o"){
			showImage(res.player, id);
			$('#status').text('Player 1 turn');
		}
	    },
	    error: function(){
	    	console.log("shits fucked");
	    }
	});
}

function resetGame(){
	on = "1";
	$(".img").hide();
        $.ajax({
	    type: 'POST',
	    url: '/newGame',
	    success: function(res){
		$('#status').text('Player 1 turn');
	    },
	    error: function(){
		console.log("shits fucked");
	    }
	});
}

function showImage(player, id){
	$('#' + id + player).show();
}
