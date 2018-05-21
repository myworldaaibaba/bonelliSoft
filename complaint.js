function add(){
	var name=document.myForm.name.value;
	var mnumber=document.myForm.mnumber.value;
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
	
	 ////for mobile no
	 if (mnumber=="") {
            alert("Empty filed not allowed!!!");
            document.myForm.mnumber.focus();
            document.myForm.mnumber.style.background ="Thistle"; 
            return false;
          }else if (isNaN(mnumber)||mnumber.length < 10 ||mnumber.length >10)
                 {
                       alert("Enter valid mobile no");
                       document.myForm.mnumber.focus();
                       document.myForm.mnumber.style.background ="Thistle";
                       return false;
                 }
	
	 	
	var x=confirm("are u surely want to submit event");
	if(x)
	  return true;
	else
		return false;
}