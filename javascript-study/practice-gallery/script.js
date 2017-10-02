var req = new XMLHttpRequest();
req.open("GET", "./json/image_list.json");
req.onreadystatechagnge = function(){
	if(this.readyState == 4){
		console.log(this.response);
	}
}