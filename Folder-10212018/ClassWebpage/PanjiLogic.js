/* For Simple Login Box Validation */
function validateCredentials()
{
    if(loginform.userid.value == "admin" && loginform.pwd.value == "demo123")
    {
        return true;
    }
    else
    {	
        alert("Your Username or Password is wrong!!!");
        document.loginform.userid.focus() ;
        return false;
    }
}

/* For Guest Validation 
function validateGuest()
{ 
   if( document.GuestRegistration.textname.value == "" )
   {
     alert( "Please provide your First Name!" );
     document.GuestRegistration.textname.focus() ;
     return false;
   }
   if( document.GuestRegistration.familyname.value == "" )
   {
     alert( "Please provide your Last Name!" );
     document.GuestRegistration.familyname.focus() ;
     return false;
   }
   
   if( document.GuestRegistration.straddr.value == "" )
   {
     alert( "Please provide your Street Address!" );
     document.GuestRegistration.straddr.focus();
     return false;
   }
   
   if( document.GuestRegistration.City.value == "-1" )
   {
     alert( "Please pick your City name from the dropdown!" );
     document.GuestRegistration.City.focus() ;
     return false;
   } 
  
   if( document.GuestRegistration.State.value == "-1" )
   {
     alert( "Please pick your State name from the dropdown!" );
     document.GuestRegistration.State.focus();
     return false;
   }

   if( document.GuestRegistration.ZipCode.value == "-1" )
   {
     alert( "Please pick your ZipCode from the dropdown!" );
     document.GuestRegistration.ZipCode.focus();
     return false;
   } 
  
   var email = document.GuestRegistration.emailid.value;
   atpos = email.indexOf("@");
   dotpos = email.lastIndexOf(".");
   if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
   {
     alert("Please enter email ID in the correct Format")
     document.GuestRegistration.emailid.focus() ;
     return false;
   }

   if( document.GuestRegistration.mobileno.value == "" ||
     isNaN( document.GuestRegistration.mobileno.value) ||
     document.GuestRegistration.mobileno.value.length != 10 )
   {
         alert( "Please provide your Cell Number in the format 123." );
         document.GuestRegistration.mobileno.focus();
         return false;
   }

   if( document.GuestRegistration.drvlicense.value == "" )
   {
     alert( "Please provide your Drivers License Number!" )
     document.GuestRegistration.drvlicense.focus();
     return false;
   } 
   return true;
}
*/

/* For footer */
document.getElementById("foot001").innerHTML =
"<p>&copy;  " + new Date().getFullYear() + " Nobody, May be Somebody, Could be Everybody? Man! I don't know. Who Cares!!!!</p>";

/* For top menu items (3) */
document.getElementById("nav01").innerHTML =
"<ul id='menu'>" +
"<li><a href='index.html'>Home</a></li>" +
"<li><a href='Registration.html'>Registration</a></li>" +
"<li><a href='About.html'>About</a></li>" +
"</ul>";


