/*When the window loads, a new game is started*/
window.onload = function() {
	resetGame();
}
/*Variable that detmines if a game is ongoing*/
var on;

function clicked(id){
	/*If someone has already won the game will stop*/
	if(on === "0"){
		return;
	}
	/*Ajax request that takes in the id of the column that was clicked on, and sends api call to server for a response which determine the state of the game*/
	$.ajax({
	    type: 'POST',
	    url: '/clickColumn',
	    data: 'id=' + id,
	    dataType: 'json',
	    success: function(res){
		var audio = $("#mySoundClip")[0];
		audio.play();
		/*If someone wins, we tell it to the players and stop the game*/
		if(res.won !== undefined){
			if(res.won === "t"){
				showImage(res.player, id);
				$('#status').text('Tie!');
			}
			else if(res.won === "x"){
				showImage(res.player, id);
				$('#status').text('Player 1 WON!');				
			}
			else{
				showImage(res.player, id);
				$('#status').text('Player 2 WON!');
			}
			on = "0";
		}
		/*If player 1 clicked on a valid column,we show a appropriate image in that column, and switch turns*/
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
	/*Send a api call to server for a new game*/
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

/*Whenever a player clicks on a valid column, we show a appropriate image. Both images for player 1 and 2 are rendered when the window loads, and their visibility is manipulated when appropriate*/
function showImage(player, id){
	$('#' + id + player).show();
}
