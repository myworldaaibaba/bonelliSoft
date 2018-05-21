function msg(){
	   var uname=document.myForm.uname.value;
	   var pass=document.myForm.pass.value;
	  
	   ////for user number
       if (uname=="") {
	            alert("Empty filed not allowed!!!");
	            document.myForm.uname.focus();
	            document.myForm.uname.style.background ="Thistle"; 
	            return false;
	          }else if (isNaN(uname))
	                 {
	                       alert("Enter valid user name");
	                       document.myForm.uname.focus();
	                       document.myForm.uname.style.background ="Thistle";
	                       return false;
	                 }
       
       ////for password
       if (pass=="") {
	            alert("Empty filed not allowed!!!");
	            document.myForm.pass.focus();
	            document.myForm.pass.style.background ="Thistle"; 
	            return false;
	          }
       
       var x=confirm("sure want to login??? ");
       if(x)return true;
       else return false;
}