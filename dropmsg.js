function add(){
	var name=document.myForm.name.value;
	var flatno=document.myForm.flatno.value;
	var letters = /^[A-Za-z]*$/;
	
	 
	 ///for   name
	 	if(name==""){
	 		 alert("Empty filed not allowed!!!");
	 		 document.myForm.name.focus();
	 		 document.myForm.name.style.background="Thistle";
	 		 return false;
	 	}else if(letters.test(name));
	 	else{
	 		alert("Enter valid name");
	 		 document.myForm.name.focus();
	 		  document.myForm.name.style.background="Thistle";
	 		 return false;
	 	}
	 	
	 	 ////for flat number
       if (isNaN(flatno))
	                 {
	                       alert("Enter valid flat no");
	                       document.myForm.flatno.focus();
	                       document.myForm.flatno.style.background ="Thistle";
	                       return false;
	                 }
	 	
	var x=confirm("are u surely want to submit event");
	if(x)
	  return true;
	else
		return false;
}