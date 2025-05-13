function initPage() {
    console.log("Page loaded!");
}

function showProductImage() {
    const productImageSection = document.getElementById("productImageSection");
    const productImage = document.getElementById("productImage");
    const productCategory = document.getElementById("productCategory").value;
    if (productCategory === "phone") {
        productImage.src = "images/phone.png";
    } else if (productCategory === "laptop") {
        productImage.src = "images/laptop.png";
    } else if (productCategory === "camera") {
        productImage.src = "images/camera.png";
    } else if (productCategory === "headphones") {
        productImage.src = "images/headphones.png";
    } else if (productCategory === "watch") {
        productImage.src = "images/smartwatch.png";
    }

    productImageSection.style.display = "block";
}

function submitForm() {
    let isValid = true;

    clearErrors();

    if (isValid) {
        document.getElementById("productForm").style.display = "none";
        document.getElementById("thanksMessage").style.display = "block";
    }
}

function clearErrors() {
    const errors = document.querySelectorAll(".error-message");
    errors.forEach(error => error.innerHTML = "");
}

function displayError(elementId, message) {
    document.getElementById(elementId).innerHTML = message;
}
