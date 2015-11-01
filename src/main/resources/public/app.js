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
				renderImage(res.player, id);
				$('#status').text('Tie!');
			}
			else if(res.won === "x"){
				renderImage(res.player, id);
				console.log("x won!");
				$('#status').text('Player 1 WON!');				
			}
			else{
				renderImage(res.player, id);
				console.log("o won!");
				$('#status').text('Player 2 WON!');
			}
			console.log("won!");
			on = "0";
			return;
		}
		if(res.success === "1" && res.player === "x"){
			renderImage(res.player, id);
			$('#status').text('Player 2 turn');
		}
		else if(res.success === "1" && res.player === "o"){
			renderImage(res.player, id);
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
	$(".img").remove();
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

function renderImage(player, id){
	if(player === "o"){
		$('#' + id)
        	.append($("<img></img>")
        	.attr("class", "img")
        	.attr("src", "img/thief.png")
        	);
	}
	else{
                $('#' + id)
                .append($("<img></img>")
                .attr("class", "img")
                .attr("src", "img/scrooge.png")
                );
	}
}
