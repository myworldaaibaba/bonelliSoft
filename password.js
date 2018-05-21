function password(){
	var pass1=document.myForm.pass.value;
	var pass2=document.myForm.cpass.value;
	if(pass1==pass2){  }  
		else{  
		alert("password must be same!");  
		return false;  
		}  
	 var x=confirm("sure want to submit??? ");
     if(x)return true;
     else return false;
}