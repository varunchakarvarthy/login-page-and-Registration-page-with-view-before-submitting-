const form = document.querySelector("form"),
        nextBtn = form.querySelector(".nextBtn"),
        backBtn = form.querySelector(".backBtn"),
        allInput = form.querySelectorAll(".first input");
    


nextBtn.addEventListener("click", ()=> {
    allInput.forEach(input => {
        if(input.value != ""){
            form.classList.add('secActive');
        }else{
            form.classList.remove('secActive');
        }
    })
})

backBtn.addEventListener("click", () => form.classList.remove('secActive'));


function last(){

    var fullname=document.getElementById("fullname").value;
    var dateofbirth =document.getElementById("dateofbirth").value;
    var email=document.getElementById("email").value;
    var mobilenumber=document.getElementById("mobilenumber").value;
    // var Gender=document.getElementById("Gender").value;
    var fathername=document.getElementById("fathername").value;
    var placeofbirth=document.getElementById("placeofbirth").value;
    var nationality=document.getElementById("nationality").value;
    // var bloodgroup=document.getElementById("bloodgroup").value;
    var passportnumber=document.getElementById("passportnumber").value;
    var aadharnumber=document.getElementById("aadharnumber").value;
    var pancardnumbar=document.getElementById("pancardnumbar").value;
    var housename=document.getElementById("housename").value;
    var street=document.getElementById("street").value;
    var area=document.getElementById("area").value;
    var city=document.getElementById("city").value;
    var state=document.getElementById("state").value;
    var pincode=document.getElementById("pincode").value;
    // // var qualification1=document.getElementById("qualification1").value;
    var percentage1=document.getElementById("percentage1").value;
    // // var qualification2=document.getElementById("qualification2").value;
    var percentage2=document.getElementById("percentage2").value;
   
    
    alert("Check The Details entered once\n Entered full name is ="+ fullname +"\n Date Of Birth is ="+ dateofbirth +"\n Entered Email is ="+ email +" \n Entered Mobile Number is ="+ mobilenumber +"\n Entered Father Name is ="+ fathername +
    "\n Entered Place Of Birth is ="+ placeofbirth +"\n Entered Nationality is ="+ nationality +"\n Entered Passport Number is ="+ passportnumber +"\n Entered Aadhar Number is ="+ aadharnumber +
    "\n Entered Pan Card Number is ="+ pancardnumbar +"\n Entered House Name/NUmber is ="+ housename +"\n Entered Street is ="+ street + "\n Entered city is ="+ city +"\n Entered State is ="+ state +
    "\n Entered Pincode is ="+ pincode +"\n Entered Percentage in Qualification Level 1 is ="+ percentage1 +"\n Entered Percentage in Qialification  Level 2 is ="+ percentage2 ) ;
}