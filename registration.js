/**
 * 
 */
function msg(){
	var x = document.forms["myForm"]["fname"].value;
	    var wing=document.myForm.wing.value;
	    var fnumber=document.myForm.fnumber.value;
	    var fname=document.myForm.fname.value;
	    var mname=document.myForm.mname.value;
	    var lname=document.myForm.lname.value;
	    var mnumber=document.myForm.mnumber.value;
	    var amnumber=document.myForm.amnumber.value;
	    var mail=document.myForm.id.value;
	    var familyno=document.myForm.familyno.value;
	    var letters = /^[A-Za-z]*$/;
	  
	    ///for wing
	          if (wing== "") {
	            alert("Empty filed not allowed!!!");
	            document.myForm.wing.focus();
	            document.myForm.wing.style.background ="Thistle"; 
	            return false;
	          }else if (letters.test(wing));
	                else {
	                      alert("Enter valid wing name");
	                      document.myForm.wing.focus();
	                      document.myForm.wing.style.background ="Thistle";
	                      return false;
	                    }
	    
	          
	          ////for flat number
	          if (fnumber=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.fnumber.focus();
		            document.myForm.fnumber.style.background ="Thistle"; 
		            return false;
		          }else if (isNaN(fnumber))
		                 {
		                       alert("Enter valid flat no");
		                       document.myForm.fnumber.focus();
		                       document.myForm.fnumber.style.background ="Thistle";
		                       return false;
		                 }
	          
	          
	          
	          
	          
	    ////for first name
	          if (fname=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.fname.focus();
		            document.myForm.fname.style.background ="Thistle"; 
		            return false;
		          }else if (letters.test(fname));
		                  else {
		                       alert("Enter valid first name");
		                       document.myForm.fname.focus();
		                       document.myForm.fname.style.background ="Thistle";
		                       return false;
		                 }
	          ////for middle name
	          if (mname=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.mname.focus();
		            document.myForm.mname.style.background ="Thistle"; 
		            return false;
		          }else if (letters.test(mname));
		                  else {
		                       alert("Enter valid middle name");
		                       document.myForm.mname.focus();
		                       document.myForm.mname.style.background ="Thistle";
		                       return false;
		                 }
	          
	          ////for last name
	          if (lname=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.lname.focus();
		            document.myForm.lname.style.background ="Thistle"; 
		            return false;
		          }else if (letters.test(lname));
		                  else {
		                       alert("Enter valid last name");
		                       document.myForm.lname.focus();
		                       document.myForm.lname.style.background ="Thistle";
		                       return false;
		                 }
	          
	        //for gender check  
	          
	          if((document.myForm.gender[0].checked==false)&&(document.myForm.gender[1].checked==false)&&(document.myForm.gender[2].checked==false))
	        	   {
	        	     document.myForm.gender[0].focus();
	        	     alert("Please select a gender.");
	        	    return false;
	        	  }

	          ////for mobile number
	              
	          if (mnumber=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.mnumber.focus();
		            document.myForm.mnumber.style.background ="Thistle"; 
		            return false;
		          }else if (isNaN(mnumber)||mnumber.length < 10 || mnumber.length >10)
		                 {
		                       alert("Enter valid mobile no");
		                       document.myForm.mnumber.focus();
		                       document.myForm.mnumber.style.background ="Thistle";
		                       return false;
		                 }
	          
	          ////for  alternative mobile number
              
	          if (amnumber=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.amnumber.focus();
		            document.myForm.amnumber.style.background ="Thistle"; 
		            return false;
		          }else if (isNaN(amnumber)||amnumber.length < 10 || amnumber.length >10)
		                 {
		                       alert("Enter valid mobile no");
		                       document.myForm.amnumber.focus();
		                       document.myForm.amnumber.style.background ="Thistle";
		                       return false;
		                 }
	          
	      
  ////for  mail id
	          var atpos = mail.indexOf("@");
	          var dotpos = mail.lastIndexOf(".");
	          if (mail=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.id.focus();
		            document.myForm.id.style.background ="Thistle"; 
		            return false;
		          }else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=mail.length)
		             {
		        	  alert("Enter proper e-mail address");
		        	  document.myForm.id.focus();
		        	  document.myForm.id.style.background ="Thistle"; 
		        	  return false;
		        	  }
////for family number
	          if (familyno=="") {
		            alert("Empty filed not allowed!!!");
		            document.myForm.familyno.focus();
		            document.myForm.familyno.style.background ="Thistle"; 
		            return false;
		          }else if (isNaN(familyno))
		                 {
		                       alert("Enter family member no");
		                       document.myForm.familyno.focus();
		                       document.myForm.familyno.style.background ="Thistle";
		                       return false;
		                 }
	          
 //for ownership check  
	          
	          if((document.myForm.you[0].checked==false)&&(document.myForm.you[1].checked==false))
	        	   {
	        	     document.myForm.you[0].focus();
	        	     alert("Please select a ownership");
	        	    return false;
	        	  }   
	          
	          
	       
	          var x=confirm("sure want to submit form??? ");
	          if(x)return true;
	          else return false;
	       }    


