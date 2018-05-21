function add(){
	var oname=document.myForm.oname.value;
	var ename=document.myForm.ename.value;
	var guest=document.myForm.guest.value;
	var venue=document.myForm.venue.value;
	var amount=document.myForm.amount.value;
	var name1=document.myForm.name1.value;
	var mno1=document.myForm.mno1.value;
	var name2=document.myForm.name2.value;
	var mno2=document.myForm.mno2.value;
	var name3=document.myForm.name3.value;
	var mno3=document.myForm.mno3.value;
	var name4=document.myForm.name4.value;
	var mno4=document.myForm.mno4.value;
	var date=document.myForm.date.value;
	var time=document.myForm.time.value;
	//var x1=isNaN(amount);
	var letters = /^[A-Za-z]*$/;
	var letters1 = /^[A-Za-z0-9]*$/;
	
	///for eventorganiser name
	if(oname==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.oname.focus();
		 document.myForm.oname.style.background="Thistle";
		 return false;
	}else if(letters.test(oname));
	else{
		alert("Enter valid organiser name");
		 document.myForm.oname.focus();
		document.myForm.oname.style.background="Thistle";
		 return false;
	}
	
	///for event  name
	if(ename==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.ename.focus();
		 document.myForm.ename.style.background="Thistle";
		 return false;
	}else if(letters.test(ename));
	else{
		alert("Enter valid Event name");
		 document.myForm.ename.focus();
		document.myForm.ename.style.background="Thistle";
		 return false;
	}
	
	///for guest  name
	if(guest==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.guest.focus();
		 document.myForm.guest.style.background="Thistle";
		 return false;
	}else if(letters.test(guest));
	else{
		alert("Enter valid Guest name");
		 document.myForm.guest.focus();
		document.myForm.guest.style.background="Thistle";
		 return false;
	}
	
	///for venue
	if(venue==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.venue.focus();
		 document.myForm.venue.style.background="Thistle";
		 return false;
	}else if(letters1.test(venue));
	else{
		alert("Enter valid venue");
		 document.myForm.venue.focus();
		document.myForm.venue.style.background="Thistle";
		 return false;
	}
	
	///for date
	if(date==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.date.focus();
		 document.myForm.date.style.background="Thistle";
		 return false;
	}
	
	///for time
	if(time==""){
		 alert("Empty filed not allowed!!!");
		 document.myForm.time.focus();
		 document.myForm.time.style.background="Thistle";
		 return false;
	}
	
	 ////for amount
       	if(amount==""){
   		 alert("Empty filed not allowed!!!");
   		 document.myForm.amount.focus();
   		 document.myForm.amount.style.background="Thistle";
   		 return false;
   	} else if(isNaN(amount)){
   		 alert("Enter valid amount");
   		 document.myForm.amount.focus();
   		 document.myForm.amount.style.background="Thistle";
   		 return false;
       }
       	
       	
      ///for   name1
    	if(name1==""){
    		 alert("Empty filed not allowed!!!");
    		 document.myForm.name1.focus();
    		 document.myForm.name1.style.background="Thistle";
    		 return false;
    	}else if(letters.test(name1));
    	else{
    		alert("Enter valid Contact name");
    		 document.myForm.name1.focus();
    		document.myForm.name1.style.background="Thistle";
    		 return false;
    	}
	
    	 ////for mno1
    	 if (mno1=="") {
	            alert("Empty filed not allowed!!!");
	            document.myForm.mno1.focus();
	            document.myForm.mno1.style.background ="Thistle"; 
	            return false;
	          }else if (isNaN(mno1)||mno1.length < 10 || mno1.length >10)
	                 {
	                       alert("Enter valid mobile no");
	                       document.myForm.mno1.focus();
	                       document.myForm.mno1.style.background ="Thistle";
	                       return false;
	                 }
      
    	 
    	 ///for   name2
     	if(name2==""){
     		 alert("Empty filed not allowed!!!");
     		 document.myForm.name2.focus();
     		 document.myForm.name2.style.background="Thistle";
     		 return false;
     	}else if(letters.test(name2));
     	else{
     		alert("Enter valid Contact name");
     		 document.myForm.name2.focus();
     		document.myForm.name2.style.background="Thistle";
     		 return false;
     	}
 	
     	 ////for mno2
     	 if (mno2=="") {
 	            alert("Empty filed not allowed!!!");
 	            document.myForm.mno2.focus();
 	            document.myForm.mno2.style.background ="Thistle"; 
 	            return false;
 	          }else if (isNaN(mno2)||mno2.length < 10 || mno2.length >10)
 	                 {
 	                       alert("Enter valid mobile no");
 	                       document.myForm.mno2.focus();
 	                       document.myForm.mno2.style.background ="Thistle";
 	                       return false;
 	                 }
     
    	
     	 
     	 ///for   name3
     	if(name3==""){
     		 alert("Empty filed not allowed!!!");
     		 document.myForm.name3.focus();
     		 document.myForm.name3.style.background="Thistle";
     		 return false;
     	}else if(letters.test(name3));
     	else{
     		alert("Enter valid Contact name");
     		 document.myForm.name3.focus();
     		document.myForm.name3.style.background="Thistle";
     		 return false;
     	}
 	
     	 ////for mno1
     	 if (mno1=="") {
 	            alert("Empty filed not allowed!!!");
 	            document.myForm.mno3.focus();
 	            document.myForm.mno3.style.background ="Thistle"; 
 	            return false;
 	          }else if (isNaN(mno3)||mno3.length < 10 || mno3.length >10)
 	                 {
 	                       alert("Enter valid mobile no");
 	                       document.myForm.mno3.focus();
 	                       document.myForm.mno3.style.background ="Thistle";
 	                       return false;
 	                 }
     
    	
     	 
     	 ///for   name4
     	if(name4==""){
     		 alert("Empty filed not allowed!!!");
     		 document.myForm.name4.focus();
     		 document.myForm.name4.style.background="Thistle";
     		 return false;
     	}else if(letters.test(name4));
     	else{
     		alert("Enter valid Contact name");
     		 document.myForm.name4.focus();
     		document.myForm.name4.style.background="Thistle";
     		 return false;
     	}
 	
     	 ////for mno4
     	 if (mno4=="") {
 	            alert("Empty filed not allowed!!!");
 	            document.myForm.mno4.focus();
 	            document.myForm.mno4.style.background ="Thistle"; 
 	            return false;
 	          }else if (isNaN(mno4)||mno4.length < 10 || mno4.length >10)
 	                 {
 	                       alert("Enter valid mobile no");
 	                       document.myForm.mno4.focus();
 	                       document.myForm.mno4.style.background ="Thistle";
 	                       return false;
 	                 }
     
    	
	var x=confirm("are u surely want to submit event");
	if(x)
	  return true;
	else
		return false;
}