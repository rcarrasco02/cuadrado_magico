$(document).ready(function(){
	//No permitir valores fuera de rango
	$(".cm_cell").keyup(function(){
		n = parseInt($(this).val());
		if(!isNaN(n)){
			if(n > 9 || n < 1){
				$(this).addClass("invalid");
				$("#message").html("<span class='invalid'>Fuera de rango [1-9]</span>");
			}
			else{
				console.log("valid");
				$(this).removeClass("invalid");
			}
		}
		else{
			$("#message").html("<span class='invalid'>No válido. Solo enteros entre [1-9]</span>");
			$(this).addClass("invalid");
		}
	});
	//Validar antes del submit
	$("#cuadradoForm").submit(function(){
		//
		var a = $(this).serializeArray();
		for(var i=0; i<a.length; i++){
			if(a[i].value == "" || a[i].value > 9 || a[i].value < 1){
				var s = a[i].value;
				switch(s){
					case s == "":
						$("#message").html("<span class='invalid'>Hay campos vacíos</span>");
						break;
					case s > 9:
						$("#message").html("<span class='invalid'>Fuera de rango [1-9]</span>");
						break;
					case s < 1:
						$("#message").html("<span class='invalid'>Fuera de rango [1-9]</span>");
						break;
				}
			}
		}
		return true;
		
	});
	$("#formReset").click(function(){
		$(".cm_cell").removeClass("invalid");
		$("#message").html("");
	});
});