function validateFormTest() {
    const fields = document.querySelectorAll(".fields-fill");
    let filledOut = true;

        fields.forEach(field => {
            if(field.nodeValue===""){
                filledOut = false;
            }
        });
        if(filledOut===false)
        {
            alert("Fill in the required fields.")
            return false;
        }
        return true;
}
function validateForm() {
    let email = document.getElementById("emailInput").value;
    if (email === "") {
        alert("Email cannot be empty!");
        return false; // Prevent form submission
    }
}
